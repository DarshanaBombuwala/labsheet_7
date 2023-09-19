object PrimeFilter {
  
  val isPrime: Int => Boolean = (n: Int) => {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to Math.sqrt(n).toInt).exists(x => n % x == 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11)
    val primeNumbers = filterPrime(inputList)
    println("Prime numbers: " + primeNumbers)
  }
}

