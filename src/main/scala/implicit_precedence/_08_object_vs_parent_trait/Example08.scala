package implicit_precedence._08_object_vs_parent_trait

trait CanFoo[A] {
  def foos(x: A): String
}
trait Super {
  implicit lazy val importIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "importIntFoo:" + x.toString
  }
}
object Def extends Super {}
object ExtendedDef extends Super {
  implicit val extendedImportIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "extendedImportIntFoo:" + x.toString
  }
}

object Main {
  def test(): String = {
    import Def.importIntFoo
    import ExtendedDef.extendedImportIntFoo

    foo(1)
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}

object Example08 extends App {
  println
  println(Main.test)
  println
  println("Example08 compiles in Scala 2.12")
  println("favours extendedImportIntFoo over importIntFoo")
  println
}
