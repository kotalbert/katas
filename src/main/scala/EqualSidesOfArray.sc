def findEvenIndex(arr: Array[Int]): Int = {
  (1 to arr.length).find(i => arr.splitAt(i)._1.init.sum == arr.splitAt(i)._2.sum) match
    case Some(i) => i - 1
    case None => -1
}

val a1 = Array(1, 2, 3, 4, 3, 2, 1)
val a2 = Array(1, 100, 50, -51, 1, 1)
val a3 = Array(10, -80, 10, 10, 15, 35, 20)
findEvenIndex(a1)
findEvenIndex(a2)
findEvenIndex(a3)
