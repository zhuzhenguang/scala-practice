object Basic {
  def main(args: Array[String]): Unit = {
    val two = 1 + 1
    println(two)

    var name = "zhu"
    name = "zhen"
    println(name)

    /*def addOne(m: Int) = m + 1

    println(addOne(1))*/

    def three() = 1 + 2

    println(three())

    val addOne = (m: Int) => m + 1
    println(addOne(2))

    /*def timesTwo(i: Int) = {
      println("Hello, World")
      i * 2
    }

    println(timesTwo(2))*/

    val timesTwo = {
      i: Int =>
        println("Hello, World")
        i * 2
    }

    println(timesTwo(3))

    def adder(m: Int, n: Int) = m + n

    val addTwo = adder(2, _: Int)
    println(addTwo(2))

    def multiple(m: Int)(n: Int) = m * n

    val timesThree = multiple(3) _
    println(timesThree(5))

    val cAdder = (adder _).curried
    println(cAdder(2)(3))

    class Calculator(brand: String) {
      val color: String = if (brand == "Ti") "blue" else "red"

      def add(m: Int, n: Int) = m + n
    }

    val calc = new Calculator("Ti")
    println(calc.color)

    trait Car {
      val brand: String
    }

    trait Shiny {
      val shineRefraction: Int
    }

    trait Luxury {
      val price: Double
    }

    class BMW extends Car with Shiny with Luxury {
      override val brand: String = "BMW"
      override val shineRefraction: Int = 12
      override val price: Double = 1200000
    }

    val bmw = new BMW
    println(bmw.price)
  }
}