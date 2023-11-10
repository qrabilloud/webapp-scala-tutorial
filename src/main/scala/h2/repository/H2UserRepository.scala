package h2.repository

import cats.effect.IO
import doobie.h2.implicits.*
import doobie.implicits.*
import doobie.util.transactor.Transactor
import h2.query.UserQueries
import workshop.{User, UserRepository}

import java.util.UUID

final class H2UserRepository(transactor: Transactor[IO]) extends UserRepository {
  override def insert(name: String): IO[User] =
    UserQueries
      .insert(name)
      .withUniqueGeneratedKeys[UUID]("id")
      .map(id => User(id, name))
      .transact(transactor)
}
