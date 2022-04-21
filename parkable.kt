import com.sun.net.httpserver.Authenticator.Success
import kotlin.math.ceil

open class  Parkable(override val vehicles:MutableSet<vehicle>) : Parking(vehicles){

    fun checkOutVehicle(plate: String, onSucess: (Int) -> Int, onError: () -> Unit){
        val findVehicle: vehicles.filter {it.plate == plate}
        if (findVehicle.isNotEmty()){
            val fee = calculateFee(
                findVehicle[0].vehicleType,
                findVehicle[0].parkedTime.ToInt(),
                hansDiscountCard findVehicle[0].discountCard?, isNotEmpy()?: false

            )
            totalCar++
            totalFee += fee

            var totalChockOut: Pair< Int,Int> =Pair(totalCar,totalFee)
            onSucess(fee)
            vehicles.remove(findVehicle[0])

            println ("you fee $$fee. come bock 500n")


        } else{

        onError()
        println ("sorry, the check-out failed")
        }
    }
}
