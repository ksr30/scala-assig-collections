@scala.annotation.tailrec
def drop(originalLst: List[Int], newLst: List[Int]): List[Int] = {
  originalLst match {
    case Nil => newLst
    case _ :: Nil => newLst
    case first :: second :: Nil => newLst ::: List(first) ::: List(second)
    case first :: second :: _ :: rest => drop(rest, newLst ::: List(first) ::: List(second))
  }
}

print(drop(List(1, 2, 3, 4, 5, 6, 7, 7), List()))