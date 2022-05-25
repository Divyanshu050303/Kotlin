fun main(){
println(file())
}
fun file(): List<String> {
    var a = listOf("Apple", "Banana", "mango","Guava", "Papaya","Fish")
    return a.filter { it[0]=='A'}
}