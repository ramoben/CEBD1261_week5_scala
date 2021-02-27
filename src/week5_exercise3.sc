//Exercise 3
// Write a max function that picks the max of two numbers and another get_max function
// to call the first one with inputs.

def max(x: Double,y:Double): Double = {
  if(x > y){
    return x
  }
  else {
    return y
  }
}



def get_max() = {
  println(max(2,1))
  println(max(2.3,2.6))
  println(max(2234.6,2234.6))
}
get_max()