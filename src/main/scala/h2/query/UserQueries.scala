package h2.query

import doobie.implicits._
import doobie.util.fragment

object UserQueries {
  val tableName: fragment.Fragment = doobie.Fragment.const("User")

  private val columns = doobie.Fragment.const("id, name")

  def insert(name: String): doobie.Update0 = sql"""INSERT INTO $tableName (name) VALUES ($name)""".update

}
