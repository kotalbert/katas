package codewars

object GapInPrimes {
  def gap(g: Int, m: Long, n: Long): String = {

    // validate parameters
    require(g >= 2)
    require(m > 2L)
    require(n >= m)

    // generate list of tuples to check
    val pairs = (m to n).zip(m + g to n)

    def isPrime(y: Long): Boolean = (2 to math.sqrt(y.toDouble).toInt).forall(x => y % x != 0)

    def noPrimesInGap(x: Long, y: Long): Boolean = {
      (1 + x to y - 1).find(isPrime) match {
        case Some(x) => false
        case None => true
      }
    }

    // look for primes in pairs list:
    // - check each tuple if they are both primes
    // - check if there is no other prime in between
    val found = pairs.find((x, y) => isPrime(x) && isPrime(y) && noPrimesInGap(x, y))

    found match {
      case Some((x, y)) => (x, y).toString
      case None => ""
    }
  }
}




