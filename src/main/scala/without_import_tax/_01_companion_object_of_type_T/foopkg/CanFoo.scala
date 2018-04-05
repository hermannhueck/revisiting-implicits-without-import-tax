package without_import_tax._01_companion_object_of_type_T.foopkg

trait CanFoo[A] {
  def foos(x: A): String
}

object CanFoo {
  implicit val companionIntFoo = new CanFoo[Int] {
    def foos(x: Int) = "companionIntFoo:" + x.toString
  }
}
