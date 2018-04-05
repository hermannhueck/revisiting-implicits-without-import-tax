package implicit_precedence._13_Ts_companion_object_vs_companion_object_of_Ts_parent_trait

trait CanFoo[A] {
  def foos(x: A): String
}

trait Vehicle {}
object Vehicle {
  implicit val companionVehicleFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "companionVehicleFoo:" + x.toString
  }
}

case class Automobile() extends Vehicle {}
object Automobile {
  implicit val companionAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "companionAutomobileFoo:" + x.toString
  }
}

object Main {
  def test(): String = {
    foo(Automobile())
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}

object Example13 extends App {
  println
  println(Main.test)
  println
  println("Example13 compiles in Scala 2.12")
  println("favours companionAutomobileFoo over companionVehicleFoo")
  println
}
