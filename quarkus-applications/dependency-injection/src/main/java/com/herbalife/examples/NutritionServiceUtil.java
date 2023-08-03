package com.herbalife.examples;

import io.smallrye.config.ConfigMapping;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
@ConfigMapping(prefix = "nutritionService")
public interface NutritionServiceUtil {
    public String url();
    public String username();
    public String password();
    public String appId();
    public Map<String, String> vendor();
}
