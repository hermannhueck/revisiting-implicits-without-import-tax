package implicit_precedence._01_local_declarations_vs_outer_declarations

trait CanFoo[A] {
  def foos(x: A): String
}

/*
object Main {
  implicit val memberIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "memberIntFoo:" + x.toString
  }

  def test(): String = {
    implicit val localIntFoo = new CanFoo[Int] {
      def foos(x: Int) = "localIntFoo:" + x.toString
    }

    foo(1) // error: ambiguous implicit values
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
*/

object Example01 extends App {
  println
  // println(Main.test)
  println
  println("Example01 does not compile in Scala 2.12")
  println("compiler error: ambiguous implicit values")
  println
}
