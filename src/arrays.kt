fun main(){
    val a= arrayOf(1,2,3,"divyanshu", "singh", "time","pass")//mix array
    val b= arrayListOf<Int>(1, 2,3)// restricted array only int value present in the array
    for (element in a) print("$element ")
    println()
    for(element in b) print("$element ")
}