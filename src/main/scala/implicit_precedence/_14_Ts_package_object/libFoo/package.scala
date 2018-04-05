package implicit_precedence._14_Ts_package_object

package object libFoo {
  implicit val packageObjectAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "packageObjectAutomobileFoo:" + x.toString
  }

  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
