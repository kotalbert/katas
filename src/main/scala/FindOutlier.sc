object Parity {

  def findOutlier(integers: List[Int]): Int = {
    def isEven(n: Integer): Boolean = n % 2 == 0

    {
      if (integers.count(n => isEven(n)) == 1) integers.find(n => isEven(n))
      else integers.find(n => !isEven(n))
    } match {
      case Some(n) => n
      case None => 0
    }
  }
}

val l1 = List(2, 4, 6, 8, 10, 3)
val l2 = List(2, 4, 0, 100, 4, 11, 2602, 36)
val l3 = List(160, 3, 1719, 19, 11, 13, -21)

Parity.findOutlier(l1)
Parity.findOutlier(l2)
Parity.findOutlier(l3)

val l4 = List(1, 1, 1, 1, 1, 44, 7, 7, 7, 7, 7, 7, 7, 7)
Parity.findOutlier(l4)
