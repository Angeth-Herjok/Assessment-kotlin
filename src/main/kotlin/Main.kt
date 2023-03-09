import java.util.Arrays

fun main(){
    people("James","Mark")
   friends()
    students()
    var calculator=Calculator(12+23,43-30,24/4,4*4)
    println(calculator.addition)
    println(calculator.substraction)
    println(calculator.division)
    println(calculator.multiplication)
}
fun people(person1:String,person2:String){
    println("J")


}
fun numbers(){
    var numArray= arrayOf(12,23,2,56,8,56)
    println(numArray.sorted())

}
fun friends(){
    var friend="Mary"
    println(friend.split(","))
}
fun students():Array<String>{
    var studentsArray= arrayOf("Moses","Joan","John","James")
    return studentsArray
    println(Arrays.toString(studentsArray))
}
class Calculator(var addition:Int,var substraction:Int,var division:Int,var multiplication:Int)