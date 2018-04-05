package implicit_precedence

package object _12_implicits_in_current_package_object_vs_implicits_in_Ts_companion_object {

  val name = "packageObjectAutomobileFoo"
  implicit val packageObjectAutomobileFoo = new CanFoo[Automobile] {
    def foos(x: Automobile) = "packageObjectAutomobileFoo:" + x.toString
  }
}
