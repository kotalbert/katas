package codewars

object GapInPrimes {
  def gap(g: Int, m: Long, n: Long): String = {

    // validate parameters
    require(g >= 2)
    require(m > 2L)
    require(n >= m)

    // generate list of tuples to check
    val pairs = (m to n).zip(m + g to n)

    // check each tuple if they are both primes
    def isPrime(y: Long) = (2 to math.sqrt(y.toDouble).toInt).forall(x => y % x != 0)

    // look for primes in pairs list
    val gap = pairs.find((a, b) => isPrime(a) && isPrime(b))

    gap match {
      case Some((x, y)) => (x, y).toString
      case None => ""
    }
  }
}




