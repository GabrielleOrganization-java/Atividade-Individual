package com.senai.infob.SurLeFond.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Sur Le Fond",
        version = "1.0",
        description = "API dos usuários da Sur Le Fond"
    )
)
public class Swagger {
    
}
