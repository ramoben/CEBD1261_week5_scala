import scala.language.postfixOps

val x = 1 to 45 toList

val sum_div_by_four = x.filter( (x: Int) => x%4 == 0)
