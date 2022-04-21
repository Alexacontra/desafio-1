import java.sql.Time
import java.util.*

const val  MINUTES_IN_MILISECONDS = 60_000

data class Vehicle(
    val plate: String,
    val VehicleType: VehicleType,
    val checkInTime: calendar = calendar.getInstance().
val discountCard: String = null,
    val parkedTime: Long = (calendar.getInstance(). timeInMilles - checkInTime.timeInMillis)/ MINUTES_IN_MILISECONDS
){

}