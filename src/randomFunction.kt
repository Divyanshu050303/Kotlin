import java.util.*;

fun main(){
feedFish()
}
fun feedFish(){
    val day=randomDay()
    val food=randomFood(day)
    println("Today is $day and the fish eat $food")
}
fun randomDay():String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
fun randomFood(day:String):String{
    var food="Fasting"
    when(day){
        "Monday"->food="French fries"
        "Tuesday"->food="Burger"
        "Wednesday"->food="Cold drink"
        "Thursday"->food="chaumin"
        "Friday"-> food="Tikki"
        "Saturday"->food="Pastries"
        "Sunday"->food="French fries"
    }
    return food
}