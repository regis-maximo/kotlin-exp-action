package com.example.kotlinaction.chapternine

fun main() {
    // 1. Create a Motorcycle list
    val motorcycles = listOf(Motorcycle("CG 150"))

    // 2. Create a Motorcycle Factory (a subtype of VehicleHonda)
    val motorcycleFactory: FactoryVehicle<Motorcycle> = FactoryVehicle(motorcycles)

    /* 3. Demonstrate covariance:
        It is possible to assign a FactoryMotorcycle<Motorcycle> to a variable
        of type FactoryMotorcycle<VehicleHonda>, since Motorcycle is a subtype
        of VehicleHonda. If `out` weren't there, this line would give an error.
     */
    val vehicleFactory: FactoryVehicle<VehicleHonda> = motorcycleFactory

    /*4. Use the more generic factory to get a vehicle
        The compiler knows the result will be a VehicleHonda or a subtype.
     */
    val vehicle = vehicleFactory.getVehicle()

    println("Covariance successfully demonstrated: $vehicle")
}

open class VehicleHonda
data class Motorcycle(private val name: String) : VehicleHonda()
data class Car(private val name: String) : VehicleHonda()

class FactoryVehicle<out T>(private val vehicles: List<T>) {

    /* Returns the first vehicle in the list.
        The `out` keyword ensures that T will only be "produced" (returned),
        which maintains type safety.
     */
    fun getVehicle(): T {
        return vehicles.first()
    }
}