package com.herbalife.labs.lab01;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class Conference {
    @Inject
    private SessionPlanner sessionPlanner;


    public int getTopicsCountOf(int duration) {
        return sessionPlanner.topics().get(duration + "").split(",").length;
    }

    public List<String> getTopicsOf(int duration) {
        return Arrays.asList(sessionPlanner.topics().get(duration + "").split(","));
    }
}
