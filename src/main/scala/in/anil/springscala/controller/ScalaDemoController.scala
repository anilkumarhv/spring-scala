package in.anil.springscala.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@RestController
class ScalaDemoController {

  @GetMapping(path = Array("/demo"))
  def demo = {
    "welcome to spring scala example"
  }

}
