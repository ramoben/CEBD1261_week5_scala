println("Hello World!")

var numbers = List(1,2,3,4,5)
println(numbers.head)
println(numbers.tail)


var courses = Set("Chemistry", "History")
courses += "Math"
println(courses.contains("Physics"))
println(courses)

{
  val x = 2; x + 7
}

def square(x: Int) : Int = {x * x}
println(square(5))


def greet1 (a:String)  {
  println("Hello " + a + ", How are you doing?")
}
def greet2 (b:String) {
  println("Hey " + b + ", How was your day?")
}

def frame (c:String, func:String=> Unit) = func(c)

frame("Alice", greet1)
frame("Nick", greet2)

val names = List("Alice", "Nick", "Martin", "Bob")
for (name <- names) {println(name)}
val names2 = names.map( (name: String) => {name.reverse})
for (name <- names2) {println(name)}

val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
val sum = nums.reduce( (x: Int, y: Int) => x + y)
println(sum)

val oddNums = nums.filter( (x: Int) => x%2 != 0)
for (n <- oddNums) {println(n)}

println(names.map(_.toUpperCase))
println(names.flatMap(_.toUpperCase))

val list = List(1,2,3,4,5)
def g(v:Int) = List(v-1, v, v+1)
list.map(x => g(x))
list.flatMap(x => g(x))

//Create a list of integers from 1-9
// ▪remove the even numbers and make a new list
// ▪Write a cube function x=>x^3
// ▪Map the cube function to the filtered list and print the results in separate
//  lines.
val list1_9 = List(1,2,3,4,5,6,7,8,9)
val list1_9odd = list1_9.filter( (x: Int) => x%2 != 0)
def cube(x: Int) : Int = {x * x * x}
for(element<-list1_9odd.map(x => cube(x)))
{
  println(element)
}