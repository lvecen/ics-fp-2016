//flatMap с помощью for
/**
  * Created by lu on 2016/12/19.
  */
object For{

  def main(args: Array[String]) {

    def flatMap[A, B](list: List[A], f: A => List[B]): List[B] = {
      for (x <- list; y <- f(x)) yield y
    }
    val list2 = List("a,b,c", "d,e,f")
    println(flatMap(list2, (s: String) => {
      s.split(",").toList
    }))

  }
}
