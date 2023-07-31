package com.herbalife.labs.lab10;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class Lab10 {
    static String baseUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=52d1c7f&t=%s";
    static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
        List<String> movies = Files.readAllLines(Paths.get("./movies.txt"));
        int numberOfThreads = (int) (Runtime.getRuntime().availableProcessors() / (1 - 0.9));
        ForkJoinPool forkJoinPool = new ForkJoinPool(numberOfThreads);
        CompletableFuture.supplyAsync(() -> {
                    Map<String, List<MovieResponse>> movieDetailsMap = movies
                            .parallelStream()
                            .map(Lab10::constructMovieRequest)
                            .map(Lab10::fetchMovieDetailsFromOmdbApi)
                            .collect(Collectors.groupingBy(movieResponse -> movieResponse.getResponse()));
                    return movieDetailsMap;
                }, forkJoinPool)
                .thenAccept(movieDetailsMap -> {
                    movieDetailsMap.forEach((response, movieList) -> {
                        System.out.println("=========== Response: %s ===============".formatted(response));
                        movieList.forEach(System.out::println);
                    });
                });
        Thread.sleep(10000);
    }

    private static MovieResponse fetchMovieDetailsFromOmdbApi(MovieRequest movieRequest) {
        MovieResponse movieResponse = null;
        try {
            HttpRequest req = HttpRequest
                    .newBuilder(new URI(movieRequest.getUrl()))
                    .GET()
                    .build();
            HttpResponse<String> response = HttpClient.newBuilder().build().send(req, HttpResponse.BodyHandlers.ofString());
            String result = response.body();
            movieResponse = objectMapper.readValue(result, MovieResponse.class);
            if ("False".equalsIgnoreCase(movieResponse.getResponse())) {
                movieResponse.setTitle(movieRequest.getTitle());
            }
        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
            movieResponse = new MovieResponse();
            movieResponse.setTitle(movieRequest.getTitle());
            movieResponse.setResponse("False");
        }
        return movieResponse;
    }


    private static MovieRequest constructMovieRequest(String movieName) {
        MovieRequest movieRequest = new MovieRequest();
        movieRequest.setTitle(movieName);
        String encodedMovieName = URLEncoder.encode(movieName, StandardCharsets.UTF_8);
        String url = baseUrl.formatted(encodedMovieName);
        movieRequest.setUrl(url);
        return movieRequest;
    }
}
