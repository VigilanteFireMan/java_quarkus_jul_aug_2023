package com.herbalife.labs.lab01;

import io.smallrye.config.ConfigMapping;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Map;

@ApplicationScoped
@ConfigMapping(prefix = "session")
public interface SessionPlanner {
    Map<String, String> topics();
}
