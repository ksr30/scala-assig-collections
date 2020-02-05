@scala.annotation.tailrec
def reverse(lst: List[Int], revLst: List[Int], counter: Int): List[Int] = {
  lst match {
    case Nil => lst
    case first :: Nil => List(first)
    case first :: rest => if (counter == 0) {
      revLst
    } else {
      reverse(rest ::: List(first), List(first) ::: revLst, counter - 1)
    }
  }

}
val lst = List(5, 3, 8, 1, 4)
val revLst1 = List()
print(reverse(lst, revLst1, lst.length))
