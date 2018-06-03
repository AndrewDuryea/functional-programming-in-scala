// Exercise 2.1
object Fibonacci {
  def fib(n: Int): Int = {
    def iter(count: Int, prev: Int, next: Int): Int = {
      if(count == n) next
      else iter(count + 1, next, prev + next)
    }

    iter(2, 0, 1)
  }
}

// 0 1 1 2 3 5 8 13
Fibonacci.fib(4) // 2
Fibonacci.fib(3) // 1
Fibonacci.fib(8) // 13
//Fibonacci.fib(1) // 0
Fibonacci.fib(2) // 1