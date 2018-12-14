package in.anil.springscala.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.web.servlet.config.annotation.{WebMvcConfigurerAdapter, ViewControllerRegistry}

/**
 * @author Anil
 *         Created by AH00554631 on 12/14/2018.
 */
@Configuration
class WebConfig extends WebMvcConfigurerAdapter {

  def configureViewResolvers(registry: ViewControllerRegistry): Unit = {
    registry.addViewController("/").setViewName("forward:/index.html")
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE)
    super.addViewControllers(registry)
  }

}
