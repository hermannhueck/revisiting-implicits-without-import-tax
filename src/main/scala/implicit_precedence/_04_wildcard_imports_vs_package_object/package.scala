package implicit_precedence

package object _04_wildcard_imports_vs_package_object {
  val name = "packageObjectIntFoo"
  implicit val packageObjectIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "packageObjectIntFoo:" + x.toString
  }
}
