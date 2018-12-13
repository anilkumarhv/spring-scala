package in.anil.springscala.model

import javax.persistence._

import scala.beans.BeanProperty

/**
 * @author Anil
 *         Created by AH00554631 on 12/11/2018.
 */
@Entity
@Table(name = "user")
class User extends Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Long = _

  @BeanProperty
  @Column(name = "username")
  var username: String = _

  @BeanProperty
  @Column(name = "password")
  var password: String = _

  @BeanProperty
  @Column(name = "enabled")
  var enabled: Boolean = _
}
