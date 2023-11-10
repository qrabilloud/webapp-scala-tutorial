package workshop

import cats.effect.IO


trait UserRepository {
  def insert(name: String): IO[User]
}
