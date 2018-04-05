package implicit_precedence._02_local_declarations_vs_explicit_imports

trait CanFoo[A] {
  def foos(x: A): String
}

/*
object Def {
  implicit val importIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "importIntFoo:" + x.toString
  }
}

object Main {
  def test(): String = {
    implicit val localIntFoo = new CanFoo[Int] {
      def foos(x: Int) = "localIntFoo:" + x.toString
    }
    import Def.importIntFoo

    foo(1) // error: ambiguous implicit values
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
*/

object Example02 extends App {
  println
  // println(Main.test)
  println
  println("Example02 does not compile in Scala 2.12")
  println("compiler error: ambiguous implicit values")
  println
}
