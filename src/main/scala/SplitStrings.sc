def solution(s: String): List[String] = {
  if (s.isEmpty) return List.empty
  val groups = s.grouped(2).toList
  groups.init :+ {
    val e = groups.last
    if (e.length == 1) s"${e}_"
    else e
  }
}

solution("asdfadsf")
solution("asdfads")
solution("")
