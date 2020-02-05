@scala.annotation.tailrec
def kthEle(lst: List[Int], find: Int): Int = {
  lst match {
    case Nil => -1
    case first :: rest => if (find == 0) first else {
      kthEle(rest, find - 1)
    }
  }

}

print(kthEle(List(5, 2, 8, 4), 0))