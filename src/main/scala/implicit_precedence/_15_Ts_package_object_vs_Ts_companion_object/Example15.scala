package implicit_precedence._15_Ts_package_object_vs_Ts_companion_object

object Example15 extends App {

  /*
  def test(): String = {
    libFoo.foo(libFoo.Automobile()) // error: ambiguous implicit values
  }
  */

  println
  // println(test)
  println
  println("Example15 doesn not compile in Scala 2.12")
  println("error: ambiguous implicit values: package object and companion object have the same precedence")
  println
}
