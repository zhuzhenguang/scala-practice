object CollectionPractice {
  def main(args: Array[String]): Unit = {
    val numbers = Array(1, 2, 3, 5, 6)
    numbers(3) = 10

    println(numbers)

    val numberList = List(1, 2, 3, 4)

    val numberSet = Set(2, 3, 4)

    val hostPort = ("localhost", 80)

    val name = "logan" -> "kayla"

    Map(1 -> 2)
    Map("foo" -> "bar")
    val map = Map((1, "a"), (2, "b"))

    val result = map.getOrElse(3, 0)
    println(result)

    map.get(3) match {
      case Some(n) => println(n)
      case None => println("None")
    }

    println(numberList.map(i => i * 2))

    def timeTwo(i: Int) = i * 2

    println(numberList.map(timeTwo))

    println(numberList.filter(i => i % 2 == 0))

    def isEven(i: Int) = i % 2 == 0

    println(numberList.filter(isEven))

    println(List(1, 2, 3).zip(List("a", "b", "c")))

    println(numberList.partition(i => i % 2 == 0))

    println(numberList.find(i => i > 5))

    println(numberList.drop(2))

    println(numberList.dropWhile(i => i < 3))

    println(numberList.foldLeft(0)((m, n) => m + n))

    println(List(List(1, 2, 3), List(4, 5)).flatten)

    println(List(List(1, 2, 3), List(4, 5)).flatMap(i => i.map(_ * 2)))

    def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
      numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) => fn(x) :: xs }
    }

    println(ourMap(numberList, timeTwo))

    val extensions = Map("steve" -> 10, "bob" -> 100)

    println(extensions.filter(namePersion => namePersion._2 > 10))
    println(extensions.filter({ case (name, phone) => phone > 10 }))
  }
}
