package com.archifyai.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
// This class is a configuration class for Cross-Origin 
//  Sharing (CORS) in the Archify AI backend. 
// It implements the WebMvcConfigurer interface and overrides the addCorsMappings method to allow CORS requests from any origin,
//  with any HTTP method and any headers. The allowCredentials(true) call allows cookies and other credentials to be included in CORS requests. This configuration is essential for enabling communication between the frontend and backend when they are hosted on different domains or ports.
