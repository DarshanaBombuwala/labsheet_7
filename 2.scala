object Q2 {

  def calculateSquare ( li: List[Int]): List[Int]={
     val sqe = li.map((x:Int) => x*x)
    sqe
  }
  def main(args:Array[String]): Unit ={
     val num = List(1,2,3,4,5,6,7,8,9)
    val out = calculateSquare(num)
    println("Output = " + out)
  }
}
