
@scala.annotation.tailrec
def innerRec(lst: List[Int], firstMax: Int, secondMax: Int): Int = {

  lst match {
    case Nil => secondMax
    case _ :: Nil => secondMax
    case first :: second :: rest => if (first > second) {
      if (second > secondMax) {
        innerRec(List(first) ::: rest, first, second)
      } else innerRec(List(first) ::: rest, first, secondMax)
    } else {
      if (first > secondMax) {
        innerRec(List(second) ::: rest, second, first)
      } else innerRec(List(second) ::: rest, second, secondMax)
    }
    case _ => secondMax
  }

}

val min = innerRec(List(5, 9, 3, 4, 0), 0, 0)
print(min)