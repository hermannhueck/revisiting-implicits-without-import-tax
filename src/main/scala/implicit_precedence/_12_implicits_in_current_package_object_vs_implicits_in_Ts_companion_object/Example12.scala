package implicit_precedence._12_implicits_in_current_package_object_vs_implicits_in_Ts_companion_object

trait CanFoo[A] {
  def foos(x: A): String
}

case class Automobile() {}

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

object Example12 extends App {
  println
  println(Main.test)
  println
  println("Example12 compiles in Scala 2.12")
  println("favours packageObjectAutomobileFoo over companionAutomobileFoo")
  println
}
