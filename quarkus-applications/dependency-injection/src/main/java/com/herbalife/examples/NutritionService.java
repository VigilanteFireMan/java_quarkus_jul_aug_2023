package com.herbalife.examples;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class NutritionService {
    @ConfigProperty(name = "nutritionService.url")
    private String url;
    @ConfigProperty(name = "nutritionService.username")
    private String username;
    @ConfigProperty(name = "nutritionService.password")
    private String password;
    @ConfigProperty(name = "nutritionService.app-id")
    private String appId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
