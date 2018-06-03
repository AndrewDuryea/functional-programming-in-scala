object Sorted{
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def iter(index: Int): Boolean = {
      if(index >= as.length - 1) true
      else if(!ordered(as(index), as(index + 1))) false
      else iter(index + 1)
    }

    iter(0)
  }
}


Sorted.isSorted[Int](Array(1,2,3,4,5), (i, j) => i < j) // true
Sorted.isSorted[Int](Array(1,2,3,4,5), (i, j) => i > j) // false
Sorted.isSorted[Int](Array(54,32,31,11,7), (i, j) => i > j) // true
Sorted.isSorted[Int](Array(88,65,99,4,6), (i, j) => i > j) // false
Sorted.isSorted[String](Array("a","b","c","d"), (i, j) => i < j) // true
Sorted.isSorted[String](Array("a","b","c","d"), (i, j) => i > j) // false
Sorted.isSorted[String](Array("a","a","a","a"), (i, j) => i == j) // true