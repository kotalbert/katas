package codewars

import org.scalatest._
import flatspec._

class ValidBracesSpec extends AnyFlatSpec {
  "validBraces" should "pass basic tests" in {
    val testCases = List[(String, Boolean)]( // s, expected
      ("()", true),
      ("[(])", false),
      ("(){}[]", true),
      ("([{}])", true),
      ("(}", false),
      ("[(])", false),
      ("[({})](]", false),
      (")(}{][", false)


    )

    testCases.foreach {
      case (s, expected) => assertResult(expected, s"\nInput\n  s = $s") {
        ValidBraces.validBraces(s)
      }
    }
  }
}