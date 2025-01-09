package com.upiiz.proyecto_final.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API de Return", description = "Esta API proporciona acceso a los recursos de la API de Returns", version = "1.0.0", contact = @Contact(name = "Miguel Alejandro Rodríguez Cruz", email = "miguel.ale.rodri.cruz@gmail.com", url = "http://localhost:8081/contacto"), license = @License(), termsOfService = "Solo se permiten 400 solicitudes diarias"), servers = {
                @Server(description = "Servidor de produccion", url = "http://localhost:8081")
}, tags = {
                @Tag(name = "Return", description = "Endpoint para los recursos de Returns")
})
public class OpenApiConfiguration {

        @Bean
        public OpenAPI customOpenAPI() {
                final String securitySchemeName = "basicAuth";
                return new OpenAPI()
                                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                                .components(new Components()
                                                .addSecuritySchemes(securitySchemeName,
                                                                new SecurityScheme()
                                                                                .name(securitySchemeName)
                                                                                .type(SecurityScheme.Type.HTTP)
                                                                                .scheme("basic")));
        }

}
