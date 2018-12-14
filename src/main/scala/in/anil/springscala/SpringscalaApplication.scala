package in.anil.springscala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@SpringBootApplication
class SpringscalaApplication

object SpringscalaApplication {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[SpringscalaApplication])
    println(">>>>> Server Started..... <<<<<")
  }
}
