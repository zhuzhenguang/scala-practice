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
  }
}
