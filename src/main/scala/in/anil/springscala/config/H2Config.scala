package in.anil.springscala.config


import org.springframework.context.annotation.Configuration
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.h2.server.web.WebServlet

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@Configuration
class H2Config {

  @Bean
  def h2servletRegistration(): ServletRegistrationBean[WebServlet] = {
    val registrationBean = new ServletRegistrationBean(new WebServlet)
    registrationBean.addUrlMappings("/console/*")
    registrationBean
  }
}
