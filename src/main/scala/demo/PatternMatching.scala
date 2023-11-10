package demo

import scala.annotation.tailrec

object PatternMatching {
  case class PatternMatchingModel(name: String, maybeValue: Option[Int])
  def getOrErrorMessage(value: Option[String]): String = value match
    case Some(value) => value
    case None => "some error message"
  def toBoolean[A, B](value: Either[A, B]): Boolean = value match
    case Right(_) => true
    case Left(_) => false
  def count(model: PatternMatchingModel): Int = model match
    case PatternMatchingModel(name, Some(value)) => value
    case PatternMatchingModel(name, None) => name.length
  @tailrec
  def sum(list: List[Int], init: Int = 0): Int = list match
    case head :: tail => sum(tail, init + head)
    case Nil => init

}


