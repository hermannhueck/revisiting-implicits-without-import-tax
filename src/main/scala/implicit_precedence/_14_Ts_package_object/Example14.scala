package implicit_precedence._14_Ts_package_object

object Example14 extends App {

  def test(): String = {
    libFoo.foo(libFoo.Automobile())
  }

  println
  println(test)
  println
  println("Example14 compiles in Scala 2.12")
  println("uses packageObjectAutomobileFoo from package object of libFoo")
  println
}
