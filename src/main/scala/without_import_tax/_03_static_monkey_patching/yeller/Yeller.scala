package without_import_tax._03_static_monkey_patching.yeller

import scala.language.implicitConversions

case class YellerString(s: String) {
  def yell: String = s.toUpperCase + "!!"
}

trait Implicit {
  implicit def stringToYellerString(s: String): YellerString = YellerString(s)
}
