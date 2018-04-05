package implicit_precedence._09_outer_scope_vs_parent_trait

trait CanFoo[A] {
  def foos(x: A): String
}
trait Super {
  implicit lazy val superIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "superIntFoo:" + x.toString
  }
}
object Main extends Super {
  implicit val memberIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "memberIntFoo:" + x.toString
  }

  def test(): String = {
    foo(1)
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}

object Example09 extends App {
  println
  println(Main.test)
  println
  println("Example09 compiles in Scala 2.12")
  println("favours memberIntFoo over superIntFoo")
  println
}
