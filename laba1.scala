// реализовать функцию, вычисляющую факториал def fact(n:Int) = ???
object laba1{ 
def fact (n:Int):Int = { 
if (n<=1) 1 
else 
n*factorial(n-1) 
} 
println(factorial(4)) 
} 
