
object BasicExtension {
  def main(args: Array[String]): Unit = {
    class Foo {
      def name() = "zhu"
    }

    object FooMaker {
      def apply() = new Foo()
    }

    val foo = FooMaker()
    println(foo.name())

    /*class Bar {
      def apply() = 0
    }

    val bar = new Bar
    println(bar())*/

    object Timer {
      var count = 0

      def currentCount(): Int = {
        count += 1
        count
      }
    }

    println(Timer.currentCount())
    println(Timer.currentCount())

    class Bar(foo: String) {
      val myFoo: String = foo
    }
    object Bar {
      def apply(foo: String) = new Bar(foo)
    }

    val bar = Bar("zhu")
    println(bar.myFoo)

    object addOne extends Function1[Int, Int] {
      def apply(m: Int): Int = m + 1
    }

    println(addOne(1))

    class AddOne {
      def apply(m: Int): Int = m + 1
    }

    val onePlus = new AddOne()
    println(onePlus(100))

    val times = 1

    times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

    case class Calculator(brand: String, model: String)

    val h20B = Calculator("HP", "20b")
    val h30B = Calculator("HP", "30b")

    def calcType(calc: Calculator) = calc match {
      case Calculator("HP", "20b") => "financial"
      case Calculator("HP", "30b") => "scientific"
      //case Calculator(ourBrand, ourModel) => "unknown %s %s".format(ourBrand, ourModel)
      //case Calculator(_, _) => "unknown"
      //case _ => "unknown"
      case c@Calculator(_, _) => "%s".format(c)
    }

    val result = try {
      calcType(h20B)
      calcType(h30B)
    } catch {
      case e: Exception => println(e.getLocalizedMessage)
    }
  }

  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }

  /*def calcType(calculator: Calculator) = calculator match {
    case _ if calculator.brand == "HP" => "financial"
    case _ if calculator.brand == "IBM" => "scientific"
    case _ if calculator.brand == "Oracle" => "business"
    case _ => "unknown"
  }

  class Calculator(val brand: String) {
    //val color: String = if (brand == "Ti") "blue" else "red"
    val color: String = ""

    def add(m: Int, n: Int) = m + n
  }*/

}
