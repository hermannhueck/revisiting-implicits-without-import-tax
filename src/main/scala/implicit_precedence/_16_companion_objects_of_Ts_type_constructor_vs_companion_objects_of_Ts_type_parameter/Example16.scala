package implicit_precedence._16_companion_objects_of_Ts_type_constructor_vs_companion_objects_of_Ts_type_parameter

trait CanFoo[A] {
  def foos(x: A): String
}
object CanFoo {
  implicit val canFooAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "canFooAutomobileFoo:" + x.toString
  }
}

case class Automobile()
object Automobile {
  implicit val companionAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "companionAutomobileFoo:" + x.toString
  }
}

/*
object Main {
  def test(): String = {
    foo(Automobile()) // error: ambiguous implicit values
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
*/

object Example16 extends App {
  println
  // println(Main.test)
  println
  println("Example16 compiles in Scala 2.12")
  println("error: ambiguous implicit values")
  println
}
