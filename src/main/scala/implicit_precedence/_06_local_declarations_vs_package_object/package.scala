package implicit_precedence

package object _06_local_declarations_vs_package_object {
  val name = "packageObjectIntFoo"
  implicit val packageObjectIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "packageObjectIntFoo:" + x.toString
  }
}
