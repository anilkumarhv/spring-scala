package in.anil.springscala.dao

import in.anil.springscala.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@Repository
trait UserRepository extends CrudRepository[User, Long] {
  def findUserByUsername(username: String): User
}
