@scala.annotation.tailrec
def isPalindrome(lst:List[Int]): Boolean ={
  lst match {
    case Nil => true
    case _ ::Nil => true
    case head::rest => if(head!=lst.last) false else isPalindrome(rest.dropRight(1))
  }
}

print(isPalindrome(List(1,2,2,1)))