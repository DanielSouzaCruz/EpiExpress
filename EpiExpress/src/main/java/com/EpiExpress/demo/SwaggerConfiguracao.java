package com.EpiExpress.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguracao {
    
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors
                .basePackage("com.EpiExpress.demo.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
        }
    /* retorna as informações da API */
/* fica visível na API */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
            .title("API - EpiExpress")
            .description("API de Emissão de Equipamentos de proteção individual")
            .version("1.0")
            .termsOfServiceUrl("https://github.com/DanielSouzaCruz/EpiExpress.git")
            .license("Arthur Barbato da Silva,Daniel Souza da Cruz, Eduardo Gabriel Zacarias Pereira, Fernando Scolari Camargo ")
            .build();
}
}
