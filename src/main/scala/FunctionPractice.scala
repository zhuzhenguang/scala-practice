object FunctionPractice {
  def main(args: Array[String]): Unit = {
    def f(s: String) = "f(" + s + ")"

    def g(s: String) = "g(" + s + ")"

    val fComposeG = f _ compose g
    println(fComposeG("yay"))

    val fAndThenG = f _ andThen g
    println(fAndThenG("yay"))

    val one: PartialFunction[Int, String] = {
      case 1 => "one"
    }

    println(one.isDefinedAt(1))
    println(one.isDefinedAt(2))
    println(one(1))

    val two: PartialFunction[Int, String] = {
      case 2 => "two"
    }

    val three: PartialFunction[Int, String] = {
      case 3 => "three"
    }

    val wildcard: PartialFunction[Int, String] = {
      case _ => "something else"
    }

    val partial = one orElse two orElse three orElse wildcard
    println(partial(5))

    case class PhoneExt(name: String, ext: Int)

    val extensions = List(PhoneExt("steve", 100), PhoneExt("bob", 10))
    val afterFilter = extensions.filter { case PhoneExt(name, extension) => extension < 100 }
    println(afterFilter)
  }
}
