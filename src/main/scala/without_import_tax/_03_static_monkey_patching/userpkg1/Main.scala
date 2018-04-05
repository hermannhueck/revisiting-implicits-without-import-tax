package without_import_tax._03_static_monkey_patching.userpkg1

object Main extends App {
  import scala.language.implicitConversions
  import without_import_tax._03_static_monkey_patching.yeller._
  println("banana".yell)
}