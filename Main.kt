fun Main (){
    val car = Vehicle( plate "AA111AA",VehicleType.CAR, discountCard = "DISCOUNT_CARD_001")
    val moto = Vehicle(plate: "B222BBB",Vehicletype.MOTORCYCLE)
    val minubus = Vehicle ( plate "CC333CC", VehicleType.MINUBUS)
    val bus = Vehicle ( plate " DD44DD", VehicleType.BUS)

    val car1= Vehicle( plate "AA111AA",VehicleType.CAR, discountCard = "DISCOUNT_CARD_001")
    val moto1 = Vehicle(plate: "B666BBB",Vehicletype.MOTORCYCLE)
    val minubus1 = Vehicle ( plate "CC777CC", VehicleType.MINUBUS)
    val bus1 = Vehicle ( plate " DD888DD", VehicleType.BUS)

    val car2= Vehicle( plate "AA999AA",VehicleType.CAR, discountCard = "DISCOUNT_CARD_001")
    val moto2 = Vehicle(plate: "B101BBB",Vehicletype.MOTORCYCLE)
    val minubus2 = Vehicle ( plate "CC102CC", VehicleType.MINUBUS)
    val bus2 = Vehicle ( plate " DD103DD", VehicleType.BUS)

    val car3= Vehicle( plate "AA104AA",VehicleType.CAR, discountCard = "DISCOUNT_CARD_001")
    val moto3 = Vehicle(plate: "B105BBB",Vehicletype.MOTORCYCLE)
    val minubus3 = Vehicle ( plate "CC106CC", VehicleType.MINUBUS)
    val bus3 = Vehicle ( plate " DD107DD", VehicleType.BUS)

    val car4= Vehicle( plate "AA108AA",VehicleType.CAR, discountCard = "DISCOUNT_CARD_001")
    val moto4 = Vehicle(plate: "B109BBB",Vehicletype.MOTORCYCLE)
    val minubus4 = Vehicle ( plate "CC121CC", VehicleType.MINUBUS)
    val bus4 = Vehicle ( plate "DD122DD", VehicleType.BUS)

    val vehiclesSet = MutableSet0f ( car,moto, minibus,bus,  car1
     bus1, moto1,  minubus1, car2, moto2, minubus2, bus2,
     car3,moto3, minubus3, bus3, car4, moto4,minubus4,bus4)
    val parking = Parking (mutableSet0f( car,moto,minubus,bus)
        val parkable = Parkable (vehiclesSet)

    for ( vehicle in vehiclesSet) {
println("welcome to alkeParking")
    } else {
        println ("Sorry,the check-in failed")
    }

}
parkable.checkOutVehicle ( plate "DD444DD", {it},{})
parkable.checkOutVehicle ( plate "B222BBB", {it},{})
parkable.earningsMessage()
println(parkable.ListVehicle())


}

