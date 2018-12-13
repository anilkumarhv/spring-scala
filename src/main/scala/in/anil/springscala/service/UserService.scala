package in.anil.springscala.service

import java.lang.Iterable
import java.util.Optional

import in.anil.springscala.dao.UserRepository
import in.anil.springscala.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.access.prepost.{PostAuthorize, PreAuthorize}
import org.springframework.stereotype.Service

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@Service
class UserService(@Autowired private val userRepository: UserRepository) {

//  @PreAuthorize("hasRole('admin')")
  def listUsers: Iterable[User] = {
    userRepository.findAll()
  }

//  @PreAuthorize("hasRole('user')")
//  @PostAuthorize("returnObject.username==principal.username || hasRole('admin')")
  def getUser(id: Long): Optional[User] = {
    userRepository.findById(id)
  }

//  @PreAuthorize("hasRole('admin')")
  def saveUser(user: User): Long = {
    userRepository.save(user)
    user.getId
  }
}
