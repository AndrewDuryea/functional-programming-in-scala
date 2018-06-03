def compose[A, B, C](f: B => C, g: A => B): A => C = {
  (a: A) => f(g(a))
}

compose[Int, Int, String](_.toString, _ * 2)(10)