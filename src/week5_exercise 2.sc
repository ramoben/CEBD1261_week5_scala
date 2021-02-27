import scala.language.postfixOps

val x = 1 to 45 toList

val sum_div_by_four = x.filter( (x: Int) => x%4 == 0).sum
def sqr(x: Int) = x * x
val div_by_three_less_than_twenty = x.filter( (x: Int) => x%3 == 0 && x<20)
val sum_sq_div_by_three_less_than_twenty = div_by_three_less_than_twenty.map(x => sqr(x)).sum