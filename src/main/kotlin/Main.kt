fun main() {
    println(namesList(listOf("teacher","eat","help","her","car","baby","jelly","cry","ride","toy")))

    peoplelist()

    println(cars())

    println(calculations(listOf(5,10,2,12,18,5,8,9,3,7)))


}
//Question 1
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
    fun namesList(names:List<String>):List<String> {
        var evenIndices= names.filterIndexed { index, _ -> index % 2 == 0 }

        return evenIndices
    }
//    Question3 Given a list of Person objects, each with the attributes, name, age,
    //height and weight. Sort the list in order of descending age
 data class Personobjects(var Name: String,var age: Int,var height: Double,var weight: Int)
fun peoplelist(){
    val boy = Personobjects("Cathy",30,5.0,80)
    val girl = Personobjects("Caren" ,10, 1.47, 43)
    val son = Personobjects("Biwott", 22, 1.56, 60)
    val y = listOf(boy,girl,son)
    var sorted=y.sortedByDescending { x-> x.age }
    println(sorted)
}

//Question 2

data class heights(var average: Double , var sum:Int)
fun calculations(height:List<Int>):heights{
    var average = height.average()
    var total = height.sum()
    var both = heights(average,total)
    return both
}

//Question 5

    data class Car(var registration:String,var mileage:Int)
    fun cars():Int{
        var car1 = Car("KDK",1300)
        var car2 = Car("KDH",1000)
        var vehicles = listOf(car1, car2)
        val mileagevehicles =vehicles.sumOf {z -> z.mileage}/vehicles.size
        return mileagevehicles

    }






//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
//fun stmt():List<String> {
//    val m = mutableListOf("back", "bag", "read", "cup", "girl", "mother", "pen", "food", "book", "apple")
//    val evenindices = m.filterIndexed { index, _ -> index % 2 == 0 }
//    return evenindices
//}
////Given a list of Person objects, each with the attributes, name, age,
////height and weight. Sort the list in order of descending age (2 points)
//data class Person (var name:String, var age:Int, var height:Double, var weight:Double )
//fun people(){
//    val boy = Person("Ahmed", 28, 1.82, 70.5)
//    val girl = Person("Halima" ,10, 1.47, 43.8)
//    val son = Person("Ali", 22, 1.56, 60.2)
//    val y = listOf(boy,girl,son)
//    var sorted=y.sortedByDescending { person1->person1.age }
//    println(sorted)
//}


