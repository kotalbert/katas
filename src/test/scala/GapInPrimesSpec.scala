package codewars

import org.scalatest._
import flatspec._


class GapInPrimesSpec extends AnyFlatSpec {
  "gap" should "pass basic tests" in {
    val testCases = List(
      (2, 3, 50, "(3,5)"),
      (2, 5, 5, ""),
      (2, 100, 100, ""),
      (2, 100, 110, "(101,103)"),
      (4, 100, 110, "(103,107)"),
      (4, 130, 200, "(163,167)"),
      (6, 100, 110, ""),
      (8, 113, 2390, "(359,367)"),
      (10, 300, 400, "(337,347)")

    )

    testCases.foreach {
      case (g, m, n, expected) => {
        lazy val clue = s"\nInput\n  g = $g\n  m = $m\n  n = $n"
        assertResult(expected, clue) {
          GapInPrimes.gap(g, m, n)
        }
      }
    }
  }
}