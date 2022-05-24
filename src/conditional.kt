fun main(){
    val a=10
    if (a==0){
        println("The value of a is $a ")
    }
    else{
        println("The value of a is $a")
    }//first way of conditional statement

    println(maxTwo(1,2))// second way to apply conditional statement
}
fun maxTwo(a:Int, b:Int) = if (a>b) a else b