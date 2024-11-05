package workshop

import java.util.UUID

case class User(id : UUID, name : String)

trait UserService:
  def createUser(name : String) : User

class MyUserService extends UserService:
  override def createUser(name: String): User = User(UUID.randomUUID(), name)

