package in.anil.springscala.controller

import java.lang.Iterable
import java.util.Optional
import javax.sql.DataSource

import in.anil.springscala.model.User
import in.anil.springscala.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpStatus, HttpHeaders, ResponseEntity}
import org.springframework.web.bind.annotation._


/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@RestController
@RequestMapping(path = Array("/api"))
class UserController @Autowired()(private val userService: UserService, private val dataSource: DataSource) {

  @GetMapping(path = Array("/users"))
  def getAllUsers: Iterable[User] = {
    userService.listUsers
  }

  @GetMapping(path = Array("/users/{id}"))
  def getUserById(@PathVariable id: Long): Optional[User] = {
    userService.getUser(id)
  }

  @PostMapping(path = Array("/users"))
  def saveUser(@RequestBody user: User): ResponseEntity[Long] = {
    val id = userService.saveUser(user)
    new ResponseEntity(id, new HttpHeaders, HttpStatus.CREATED)
  }
}
