package implicit_precedence._03_explicit_imports_vs_wildcard_imports

trait CanFoo[A] {
  def foos(x: A): String
}

/*
object Def {
  val name = "importIntFoo"
  implicit val importIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "importIntFoo:" + x.toString
  }
}

object WildDef {
  val name = "wildcardImportIntFoo"
  implicit val wildcardImportIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "wildcardImportIntFoo:" + x.toString
  }
}

object Main {
  def test(): String = {
    import Def.{importIntFoo, name}
    import WildDef._

    println(name)
    foo(1) // error: ambiguous implicit values
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
*/

object Example03 extends App {
  println
  // println(Main.test)
  println
  println("Example03 does not compile in Scala 2.12")
  println("compiler error: ambiguous implicit values")
  println
}
