def main(args:Array[String]):Unit={
    println(filterEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}

val filterEvenNumbers = (numberList:List[Int]) => numberList.filter(number=>if(number%2) return number)