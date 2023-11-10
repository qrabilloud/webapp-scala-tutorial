package demo

import java.util.UUID

case class DemoModel(id: UUID, value: Int)
trait Demo {
  val initialValue: DemoModel
  def demo(valueToTest: DemoModel): Option[DemoModel]
}
class DemoModelService(value: DemoModel) extends Demo:
  override val initialValue: DemoModel = value
  override def demo(valueToTest: DemoModel): Option[DemoModel] =
    if (valueToTest.value > initialValue.value) {
      Some(valueToTest)
    } else None

object Demo {
  @main
  def main(): Unit =
    val test = new DemoModelService(DemoModel(UUID.randomUUID(), 0))
    val result = test.demo(DemoModel(UUID.randomUUID(),10))
    println(result)
}

