package implicit_precedence

package object _05_explicit_imports_vs_package_object {
  val name = "packageObjectIntFoo"
  implicit val packageObjectIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "packageObjectIntFoo:" + x.toString
  }
}
