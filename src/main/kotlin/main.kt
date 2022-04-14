fun main(){
    var q =CurrentAccount(1234,"Reefs",5000)
    println()
   product("String",10,20,"fruits")
    println()



}
class CurrentAccount(var num:Int, var name:String, var accountbalance:Int){
    fun deposit(amount:Double){
        var depo= 200
        println(depo++)
    }
    fun withdrawal(amount: Double){
        var withdraw = 100
        println(withdraw--)
    }
    fun details(){
    println("num$ with the balance$ is operated by z" )
    }

}
class SavingAccount(var num:Int,var name:String,var accountbalance: Int){

    fun deposit(amount:Double){
        var depo= 200
        println(depo++)
    }
    fun withdrawal(amount: Double){
        var withdraw = 100
        println(withdraw--)

    }

}
data class  product(val name: String,val weight:Int,val price:Int,val category:String) {
    fun staffs(words: String) {
        when ("fruits") {
            "pineapple" -> println("grown in Thika?")
            "oranges" -> println("grown in Meru")
            else -> println("have you eaten one?")
        }
    }
}




