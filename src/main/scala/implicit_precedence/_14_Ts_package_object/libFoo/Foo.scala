package implicit_precedence._14_Ts_package_object.libFoo

trait CanFoo[A] {
  def foos(x: A): String
}

case class Automobile() {}
object Automobile {
}