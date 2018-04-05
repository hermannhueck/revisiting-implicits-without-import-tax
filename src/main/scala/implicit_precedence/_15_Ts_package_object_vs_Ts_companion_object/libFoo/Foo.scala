package implicit_precedence._15_Ts_package_object_vs_Ts_companion_object.libFoo

trait CanFoo[A] {
  def foos(x: A): String
}

case class Automobile() {}

object Automobile {
  implicit val companionAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "companionAutomobileFoo:" + x.toString
  }
}