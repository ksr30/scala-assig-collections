@scala.annotation.tailrec
def removeDuplicate(originalLst: List[Int], newList: List[Int]): List[Int] = {
  originalLst match {
    case Nil => newList
    case first :: Nil => newList ::: List(first)
    case first :: second :: rest => if (first == second) removeDuplicate(List(second) ::: rest, newList) else removeDuplicate(List(second) ::: rest, newList ::: List(first))

  }
}
println(removeDuplicate(List(1, 2, 2, 3, 5, 5, 5, 6, 7, 7), List()))