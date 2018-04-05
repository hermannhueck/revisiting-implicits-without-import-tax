package implicit_precedence._10_local_view_vs_imported_more_specific_view

import scala.language.implicitConversions

trait Bar {
  def bar: String
}

object Def {
  implicit def importedIntToBar(x: Int) = new Bar { def bar = "importedIntToBar:" + x.toString }
}

object Main {
  def test(): String = {
    import Def.importedIntToBar
    implicit def localAnyToBar(x: Any) = new Bar {
      def bar = "localAnyToBar:" + x.toString
    }

    bar(1)
  }

  def bar[A <% Bar](x: A): String = x.bar
}

object Example10 extends App {
  println
  println(Main.test)
  println
  println("Example10 compiles in Scala 2.12")
  println("favours importedIntToBar over localAnyToBar, because it more specific")
  println
}
