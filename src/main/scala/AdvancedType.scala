
object AdvancedType {
  def main(args: Array[String]): Unit = {
    implicit def strToInt(x: String) = x.toInt

    class Container[A <% Int] {
      def addIt(x: A) = 123 + x
    }

    println(new Container[String].addIt("123"))

    println(new Container[Int].addIt(123))
  }
}
