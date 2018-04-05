package without_import_tax._02_package_object_of_type_T.foopkg

trait CanFoo[A] {
  def foos(x: A): String
}

trait Implicit {
  implicit lazy val intFoo = new CanFoo[Int] {
    def foos(x: Int) = "intFoo:" + x.toString
  }
}
