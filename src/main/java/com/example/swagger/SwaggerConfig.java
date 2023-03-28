package com.example.swagger;

 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import springfox.documentation.builders.ApiInfoBuilder;
 import springfox.documentation.builders.PathSelectors;
 import springfox.documentation.builders.RequestHandlerSelectors;
 import springfox.documentation.oas.annotations.EnableOpenApi;
 import springfox.documentation.service.ApiInfo;
 import springfox.documentation.service.Contact;
 import springfox.documentation.spi.DocumentationType;
 import springfox.documentation.spring.web.plugins.Docket;

 import java.util.ArrayList;

 /**
 * @Author: 高建伟
 * @Date: 2022/11/22
 * @Description: SwaggerConfig
 */
 @Configuration
 @EnableOpenApi
 public class SwaggerConfig {

     /**
      * 文档基本信息
      */
     private ApiInfo apiInfo() {
         return new ApiInfoBuilder()
                 .title("swagger口文档")
                 .description("swagger接口文档")
                 .version("2.0")
                 .build();
     }

     /**
      * 全局通用属性（摘要）配置
      */
     @Bean
     public Docket api() {
         return new Docket(DocumentationType.OAS_30)
                 .apiInfo(apiInfo()) //应用文档基本信息
                 .select()
                 .apis(RequestHandlerSelectors.basePackage("com.example.swagger")) // swagger扫描路径
                 .paths(PathSelectors.any()) // 应用于包下所有路径
                 .build();
     }
 }

