package codewars

import scala.collection.mutable

object ValidBraces {

  def validBraces(s: String): Boolean = {
    val stack = mutable.Stack[Char]()

    def isOpeningBrace(c: Char): Boolean = "([{".contains(c)

    def checkIfBracesAreValid(right: Char, left: Char): Boolean = {
      (right == '(' && left == ')') ||
        (right == '[' && left == ']') ||
        (right == '{' && left == '}')
    }

    def isEqualNumberOfBraces(s: String): Boolean = {
      if (s.length % 2 != 0) false
      else {
        val (opening, closing) = s.partition(isOpeningBrace)
        opening.length == closing.length
      }
    }

    /**
     * Check if closing brace matches opening brace on top of stack.
     * If current char is opening brace push to stack and return true.
     *
     * @param c
     * @return
     */
    def checkBraceWithStackAndUpdate(c: Char): Boolean = {
      if (isOpeningBrace(c)) {
        stack.push(c)
        true
      }
      else {
        if (stack.isEmpty) return false
        if (checkIfBracesAreValid(stack.top, c)) {
          stack.pop
          true
        } else false

      }
    }

    isEqualNumberOfBraces(s) && s.forall(checkBraceWithStackAndUpdate) && stack.isEmpty
  }
}
