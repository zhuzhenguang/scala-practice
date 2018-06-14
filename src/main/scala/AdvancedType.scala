
object AdvancedType {
  def main(args: Array[String]): Unit = {
    implicit def strToInt(x: String): Int = x.toInt

    val y: Int = "123"
    println(y);

    class Container[A <% Int] {
      def addIt(x: A): Int = 123 + x
    }

    println(new Container[String].addIt("123"))

    println(new Container[Int].addIt(123))

    class LimitContainer[A](value: A) {
      def addIt(implicit evidence: A =:= Int) = value + 123
    }
  }
}
