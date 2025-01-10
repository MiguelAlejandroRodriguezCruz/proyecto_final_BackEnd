package com.upiiz.proyecto_final.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permite todos los endpoints
                        .allowedOrigins("http://localhost:8081", "http://localhost:4200",
                                "https://proyecto-final-front-end-amber.vercel.app",
                                "https://proyecto-final-front-end-amber.vercel.app/",
                                "https://proyecto-final-front-end-amber.vercel.app/returns",
                                "https://vercel.com/miguelalejandrorodriguezcruzs-projects/proyecto-final-front-end/Gt6o9ApdWAP6VYRQuXafkHXQzbJs",
                                "https://proyecto-fina-git-756105-miguelalejandrorodriguezcruzs-projects.vercel.app/",
                                "https://proyecto-final-frente-fywtwtie0.vercel.app",
                                "https://proyecto-final-front-end-miguelalejandrorodriguezcruzs-projects.vercel.app/") // Cambia
                                                                                                                       // según
                                                                                                                       // tus
                        // necesidades
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
