fun main(){
    var woman=Human("James",37,70)
    woman.Eat(20)
    println(woman.weight)

    woman.speak("Home sweet HOme")
    woman.birthday()


    var person=User("Xtine","wawira",1232389,"54780954")
    println(person .firstName +" + "+person. lastName)

}
class Human(var name:String,var age:Int,var weight:Int){
   fun Eat(foodWeight:Int){
       println("I am eating $foodWeight kgs of food")
       weight+=foodWeight

 }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(){
        println(age++)

    }




}
data class User(var firstName:String,var lastName:String,var password:Int,var phoneNUmber:String)