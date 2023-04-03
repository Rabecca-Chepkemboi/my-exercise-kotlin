fun main() {

    greetings("Hello world")
    numbers(arrayOf(54, 34, 76))

    var rectangle = rectangle(2.2, 4.2)
    rectangle.area()
//
//    vowel("Hello ken")

    even(arrayOf(12, 33, 4, 22, 13, 8))
    odd(arrayOf(3, 21, 4, 16, 7))

//    var result = names("ashley", "jane")
//    println(result)


    var person = Person("Becky", 24)
    println(person)

    details("Hey there my good people")

    nums(arrayOf(12, 43, 22, 56, 34))

    aging(12)
    aging(20)
    aging(70)

    number()
    digits(12)
    digits(23)

    pass("password123")
    pass("chep")

//    numbers(6)

    vowels("chepkemboi")

}

//fun names(name: String, detail: String): String{
//    if(name.isNotEmpty())
//        return name[0].toString()
//}



//Write a Kotlin program to reverse a given string.
fun greetings(name: String){
    println(name.reversed())
}


//Given an array of integers, write a program in Kotlin to
// find the second largest number
fun numbers(num: Array<Int>){

//    println(num.max())
//     var num = intArrayOf(12, 43, 22)
//    var secondLargestElement = getSecondLargestNumber(num)
}


//Create a class called Rectangle with properties width and height.
//Write a method to calculate the area of the rectangle in Kotlin
class rectangle(var width: Double, var length: Double){
   fun area(){
       println(width * length)
   }
}


//Write a Kotlin program to count the number of vowels in a given string
fun vowels(name: String) {
    var y = 0
    for (x in name){
//    name.forEach { x ->
        when (x) {
            'a' -> y++
            'e' -> y++
            'i' -> y++
            'o' -> y++
            'u' -> y++
        }
    }
    println(y)
}

//Write a program in Kotlin to find the sum of all
//the even numbers in an array of integers
fun even(num: Array<Int>){
    var sum = 0
    for (numnum in num){
        if(numnum % 2 == 0){
            sum += numnum
        }
    }
   println("$sum")
}


//for odd
fun odd(y: Array<Int>){
    var sums = 0
    for (yy in y){
        if(yy % 2 != 0){
            sums += yy
        }
    }
    println("$sums")
}


//Create a class called Person with properties name and age.
//Write a method to print out the person's name and age in Kotlin
class Person(var name: String, var age: Int){
    fun name(){
        println()
    }
    fun age(){
        println()
    }
}


//Write a Kotlin program to remove all the white spaces from a given string.
fun details(det: String){
    println(det.trim())
}


//Given an array of strings, write a program in Kotlin to find
//the longest string in the array.
fun numArray(num: Array<String>){

}


//Create a class called BankAccount with properties balance and accountNumber.
//Write methods to deposit and withdraw money from the account in Kotlin
class BankAccount(var balance: Int, var accountNumber: Int ){
    fun withdraw(num: Int){
        println()
    }
    fun deposit(num: Int){
        println()
    }

}


//Write a Kotlin program to sort an array of integers in ascending order.
fun nums(num: Array<Int>){
    println(num.sortedArray().contentToString())
}


//Write a program in Kotlin that asks the user to enter their age and prints a
//message based on their age. If the age is less than 18, print "You are not old enough to vote".
//If the age is between 18 and 65, print "You are eligible to vote". If the age is greater than 65,
//print "You are a senior citizen".
fun aging(age:Int){

    if (age < 18){
        println("you are not old enough to vote")
    }
    else if(age<=65){
        println("you are eligible enough to vote")
    }
    else if(age>65){
        println("you are a senior citizen")
    }
}


//Write a program in Kotlin that prints the numbers from 1 to 10 using a for loop.
fun number(){
    for (x in 1..10 )
        println(x)
}


//Write a program in Kotlin that asks the user to enter a number and prints whether
//it is even or odd.
fun digits(num: Int){

    if (num %2 == 0){
        println("it's even")
    }
    else{
        println("it's odd")
    }
}


//Write a program in Kotlin that asks the user to enter a password. If the password is
//"password123", print "Access granted". If the password is incorrect, print "Access denied".
fun pass(passwrd: String){
    print("Enter password: ")
    val passes = readLine()
    if (passes == "password123"){
        println("access granted")
    }
    else{
        println("access denied")
    }
}


//Write a program in Kotlin that asks the user to enter a number and then prints the
//factorial of that number. Use a while loop to calculate the factorial.
//fun numbers(numms: Int){
//   val num = 23
//    val factorial = (numms)
//    println("factorial of $numms = $factorial")
//}