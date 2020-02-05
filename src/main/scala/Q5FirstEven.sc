@scala.annotation.tailrec
def firstEven(lst: List[Int]): Int = {
  lst match {
    case Nil => 0
    case first :: rest => if (first % 2 == 0) first else firstEven(rest)
  }
}
print(firstEven(List(5, 7, 9, 2, 4)))