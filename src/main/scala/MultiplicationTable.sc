object Kata {
  def multiplicationTable(size: Int): List[List[Int]] = {
    val rng = (1 to size)
    rng.map(i => rng.map(j => i * j).toList).toList
  }
}

Kata.multiplicationTable(3)