// Exercise 2.3
object Currying {
  def curry[A,B,C](f: (A,B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }
}

val c = Currying.curry[Int, Int, Int](_ + _)
c(1)(2)

// Exercise 2.4
object UnCurrying {
  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}

val u = UnCurrying.uncurry(c)
u(1, 2)