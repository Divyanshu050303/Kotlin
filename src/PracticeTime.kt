fun main(){
whatShouldIDoToday("happy")
}
fun whatShouldIDoToday(Mood:String):String{
    var mood=Mood
    var weather="sunny"
    var temperature=24
    return when{
        mood=="happy" && weather=="sunny"->"Go for a walk"
        else->"Say at home and read a book"
    }

}
