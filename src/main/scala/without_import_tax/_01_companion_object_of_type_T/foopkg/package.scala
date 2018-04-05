package without_import_tax._01_companion_object_of_type_T

package object foopkg {
  def foo[A:CanFoo](x: A): String = implicitly[CanFoo[A]].foos(x)
}
