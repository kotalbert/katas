import collection.mutable.Map

object Kata {
  def count(string: String): Map[Char, Int] = {
    val res = Map[Char, Int]().withDefault(_ => 0)
    string.foreach(c => res(c) = res(c) + 1)
    res
  }
}

Kata.count("")
