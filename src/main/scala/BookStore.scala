object BookStore:
   def total(l: List[Int]): Int =

      val m = l.groupBy(identity)
      m.size match
         case 2 => (m.map(_._2.size * 800).sum * 0.95).toInt
         case 3 => (m.map(_._2.size * 800).sum * 0.90).toInt
         case 4 => (m.map(_._2.size * 800).sum * 0.80).toInt
         case 5 => (m.map(_._2.size * 800).sum * 0.75).toInt
         case _ => m.map((*, books) => books.size * 800).sum
