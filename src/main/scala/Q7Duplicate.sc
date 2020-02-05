@scala.annotation.tailrec
def addDuplicate(originalLst:List[Int], newLst:List[Int]): List[Int] ={
  originalLst match {
    case Nil => newLst
    case _ ::Nil => newLst
    case first::rest => addDuplicate(rest,newLst:::List(first):::List(first))

  }
}
print(addDuplicate(List(1,2,3,4),List()))