
fun main() {
    var car= Car( "Prado", "toyota", 8, "blue")
    car.carry(10)
    car.identity()
    var y= car.calculateParkingFee( 12)
    println(y)
    var vahicle= Bus( "Bus","corgi", 70, "white")
    println(vahicle.maxTripFare( 200.00))
    println(vahicle.parkingFees( 8, 400))






}

open class Car(var make:String, var model:String, var capacity:Int, var color:String){
    fun carry(people:Int){
        var x=people-capacity
        if (people<=capacity){
            println("carrying $people passangers")}
        else{
            people>capacity
            println("over capacity by $x people")

        }

    }


    fun identity() {
        println("i am a $color $make $model")

   }
//calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
   open fun calculateParkingFee( hours:Int):Int {

       var parkingFee=hours*20
    return parkingFee


    }


}
class Bus( make:String,  model:String,  capacity:Int,  color:String ) :Car(make, model, capacity, color){
    fun maxTripFare(fare:Double) :Double{
        var tripFare=33.6
        return tripFare

    }
    fun parkingFees(hours: Int,fee:Int):Int{
        var fee= hours*fee
        return fee

    }





}




