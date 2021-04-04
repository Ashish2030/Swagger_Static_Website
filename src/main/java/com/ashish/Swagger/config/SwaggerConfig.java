package com.ashish.Swagger.config;
import org.springframework.stereotype.Controller;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Controller
@EnableSwagger2    // we can alo do this in main file but it cause problem
public class SwaggerConfig
{
   public Docket  authorAPI()
   {
       return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com/ashish/Swagger/Controller"))  .
               paths(regex("/.*")).build().apiInfo(metaDeta());
   }
   public ApiInfo metaDeta()
   {
       ApiInfo info =new ApiInfo(
               "SpringBootApplication",
               "API for Author's Info",
               "1.0.1",
               "https://www.upgrad.com/terms",
               "Upgrad Education",
               "Licensed Under Upgard Education",
               "https://upgrad.com"
       );
       return info;
   }

}
