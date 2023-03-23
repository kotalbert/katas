
object WeightSort {

  private def getWeight(s: String): Long = s.map(_.asDigit).sum

  private def compareWeight(s1: String, s2: String): Boolean = {
    val w1 = getWeight(s1)
    val w2 = getWeight(s2)
    if (w1 == w2) s1 > s2
    else w1 > w2

  }

  def orderWeight(str: String): String = str.split("\\s")
    .sortWith(compareWeight).reverse.mkString(" ")
}

WeightSort.orderWeight("56 65 74 100 99 68 86 180 90")