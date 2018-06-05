object TypeBasic {
  def main(args: Array[String]): Unit = {
    def drop1[A](l: List[A]) = l.tail

    print(drop1(List(1, 2, 3)))
  }
}
