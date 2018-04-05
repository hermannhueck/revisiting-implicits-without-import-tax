package implicit_precedence._07_function1IntBar_vs_function1AnyBar

import scala.language.implicitConversions

trait Bar {
  def bar: String
}

object Main {
  def test(): String = {
    implicit def localAnyToBar(x: Any) = new Bar { def bar = "localAnyToBar:" + x.toString }
    implicit def localIntToBar(x: Int) = new Bar { def bar = "localIntToBar:" + x.toString }

    bar(1)
  }

  def bar[A <% Bar](x: A): String = x.bar
}

object Example07 extends App {
  println
  println(Main.test)
  println
  println("Example07 compiles in Scala 2.12")
  println("favours localIntToBar over localAnyToBar")
  println
}
