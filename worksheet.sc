import scala.annotation.tailrec

def sumUntil(n: Int): Int = {
  if (n <= 0) 0
  else n + sumUntil(n - 1)
}

sumUntil(30)

def sumUntilV2(n: Int): Int = {
  @tailrec
  def loop(n: Int, acc: Int): Int = {
    if (n <= 0) acc
    else loop(n - 1, acc + n)
  }

  loop(n, 0)
}

sumUntilV2(30)

def factorial(n: Int): Int = {
  if (n <= 1) 1
  else n * factorial(n - 1)
}

factorial(5)

def sumBetweenV2(a: Int, b: Int): Int = {
  val bigger = {
    if (a > b) a
    else b
  }

  val smaller = {
    if (a < b) a
    else b
  }

  @tailrec
  def loop(smaller: Int, acc: Int): Int = {
    if (smaller > bigger) acc
    else loop(smaller + 1, acc + smaller)
  }

  loop(smaller, 0)
}

sumBetweenV2(4, 2)


def nthFibonacciNumber1(n: Int): Int = {

  @tailrec
  def loop(acc1: Int, acc2: Int, position: Int): Int = {
    position match
      case x if( x == n) => acc1 + acc2
      case _ => loop(acc2, acc1 + acc2, position+1)
//    if (position == n) acc1 + acc2
//    else loop(acc2, acc1 + acc2, position+1)
  }
  n match
    case x if(x == 0) => 0
    case 1 => 1
    case _ => loop(0, 1, 2)
//  if (n == 0) 0
//  else if (n == 1) 1
//  else loop(0, 1, 2)
}

nthFibonacciNumber1(0)
nthFibonacciNumber1(1)
nthFibonacciNumber1(2)
nthFibonacciNumber1(3)
nthFibonacciNumber1(4)
nthFibonacciNumber1(5)

def fibonacci(n: Int): Long = {

  @tailrec
  def loop(prev: Long, next: Long, nextPosition: Int): Long = {
//    if (nextPosition == n) prev + next
//    else loop(next, prev + next, nextPosition + 1)
    nextPosition match
      case x if x == n => prev + next
      case _ => loop(next, prev + next, nextPosition + 1)
  }
  n match
    case x if n <= 1 => 0
    case 2 => 1
    case _ => loop(0, 1, 3)
//  if (n <= 1) 0
//  else if (n == 2) 1
//  else loop(0, 1, 3)
}

fibonacci(5)


