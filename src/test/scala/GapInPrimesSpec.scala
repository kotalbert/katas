package codewars

import org.scalatest._
import flatspec._


class GapInPrimesSpec extends AnyFlatSpec {
  "gap" should "pass basic tests" in {
    val testCases = List(
      (2, 100, 100, ""),
      (2, 100, 110, "(101,103)"),
      (4, 100, 110, "(103,107)"),
      (10, 300, 400, "(337,347)"),
      (4, 100, 110, "(359,367)")

    )

    testCases.foreach {
      case (g, m, n, expected) => {
        lazy val clue = s"\nInput\n  g = $g\n  m = $m\n  n = $n"
        assertResult(expected, clue) {GapInPrimes.gap(g, m, n)}
      }
    }
  }
}

//GapInPrimes.gap(10, 300, 400) //(337, 317)
//GapInPrimes.gap(8, 138, 4556) //(339, 467)