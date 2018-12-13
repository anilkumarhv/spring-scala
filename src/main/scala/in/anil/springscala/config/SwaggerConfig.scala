package in.anil.springscala.config

import java.util

import org.springframework.context.annotation.{Bean, Configuration}
import springfox.documentation.builders.{PathSelectors, RequestHandlerSelectors}
import springfox.documentation.service.{Contact, ApiInfo}
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@Configuration
@EnableSwagger2
class SwaggerConfig {

  @Bean
  def apiInfo: Docket = {
    new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.any)
      .paths(PathSelectors.any())
      .build.apiInfo(metaData)
  }

  private def metaData = {
    new ApiInfo(
      "Spring Boot Scala REST API",
      "Spring Boot Scala REST API for User",
      "1.0",
      "Terms of service",
      new Contact("Anil Kumar", "https://springframework.anil/about/", "anilkumarhv04@gmail.com"),
      "Apache License Version 2.0",
      "https://www.apache.org/licenses/LICENSE-2.0", new util.ArrayList()
    )
  }
}
