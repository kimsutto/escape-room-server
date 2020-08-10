package com.kimsutto.escaperoom.config;

import com.google.common.base.Predicates;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  private String version;
  private String title;

  @Bean
  public Docket apiV1() {
    version = "V1";
    title = "EscapeRoom API " + version;

    List<ResponseMessage> responseMessages = new ArrayList<>();
    responseMessages.add(new ResponseMessageBuilder()
        .code(200)
        .build());
    responseMessages.add(new ResponseMessageBuilder()
        .code(404)
        .message("Not Found")
        .build());
    responseMessages.add(new ResponseMessageBuilder()
        .code(500)
        .message("Internal Server Error")
        .build());

    return new Docket(DocumentationType.SWAGGER_2)
        .useDefaultResponseMessages(false)
        .select()
        .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
        //.apis(RequestHandlerSelectors.basePackage("com.kimsutto.escaperoom.api.v1"))
        //.paths(PathSelectors.ant("/v1/api/**"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo(title, version))
        .globalResponseMessage(RequestMethod.GET, responseMessages);

  }


  private ApiInfo apiInfo(String title, String version) {
    return new ApiInfo(
        title,
        "",
        version,
        "",
        new Contact("", "", ""),
        "",
        "",
        new ArrayList<>());
  }

}
