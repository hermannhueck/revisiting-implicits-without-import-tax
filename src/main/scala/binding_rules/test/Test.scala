package binding_rules.test

object x {
  override def toString: String = "Externally bound object x in package test"
}
object Wildcard {
  def x: String = "Wildcard Import x"
}
object Explicit {
  def x: String = "Explicit Import x"
}

object Test extends App {

  println
  testSamePackage()
  println
  testWildcardImport()
  println
  testExplicitImport()
  println
  testInlineDefinition()
  println

  def testSamePackage(): Unit = {
    println("----- testSamePackage")

    println(x)
  }
  def testWildcardImport(): Unit = {
    println("----- testWildcardImport")

    //import Wildcard._
    //println(x)

    println("Does not compile: reference to x is ambiguous; it is both defined in package test and imported subsequently by import Wildcard._")
  }
  def testExplicitImport(): Unit = {
    println("----- testExplicitImport")

    // import Explicit.x
    // import Wildcard._
    // println(x)

    println("Does not compile: reference to x is ambiguous; it is both defined in package test and imported subsequently by import Wildcard._")
  }
  def testInlineDefinition(): Unit = {
    println("----- testInlineDefinition")

    val x: String = "Inline definition of x"
    import Explicit.x
    import Wildcard._
    println(x) // --> Inline definition of x

    println("Compiles with warning: imported `x' is permanently hidden by definition of value x import Explicit.x")
  }
}
