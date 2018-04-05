package without_import_tax._02_package_object_of_type_T

package object foopkg extends Implicit {
  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
