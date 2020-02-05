@scala.annotation.tailrec
def drop(originalLst: List[Int], newLst: List[Int],counter:Int): List[Int] = {
  originalLst match {
    case Nil => newLst
    case head::rest => if(counter==1) newLst:::rest else drop(rest,newLst:::List(head),counter-1)
  }
}

print(drop(List(1, 2, 3, 4, 5, 6, 7, 7), List(),4))