package com.upiiz.proyecto_final.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(List.of("https://proyecto-final-front-end-amber.vercel.app"));
        config.setAllowedOrigins(List.of("https://proyecto-final-frente-fywtwtie0.vercel.app"));
        config.setAllowedOrigins(List.of(
                "https://vercel.com/miguelalejandrorodriguezcruzs-projects/proyecto-final-front-end/Gt6o9ApdWAP6VYRQuXafkHXQzbJs"));
        config.setAllowedOrigins(
                List.of("https://proyecto-fina-git-756105-miguelalejandrorodriguezcruzs-projects.vercel.app/"));
        config.setAllowedOrigins(List.of("https://proyecto-final-front-end-amber.vercel.app/"));
        config.setAllowedOrigins(
                List.of("https://proyecto-final-front-end-miguelalejandrorodriguezcruzs-projects.vercel.app/"));
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE"));
        config.setAllowedHeaders(List.of("*")); // Adjust allowed headers if needed
        config.setAllowCredentials(true); // Set to true if cookies are passed

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
}