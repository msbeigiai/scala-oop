package com.msbeigi.parking.domain

object Domains {

  trait ParkingService {
    def nearestParking(parkingLocation: Parking): Boolean
    def parkingStatus(parking: Parking): String
  }

  class UserRunService(parkingService: ParkingService, parking: Parking) {
    def findParking(): Boolean = parkingService.nearestParking(parking)
    def userStatusService(): String = parkingService.parkingStatus(parking)
  }

  abstract class Person {
    def name: String
    def age: Int
  }
  case class Location(l: Double, h: Double)
  case class Car(name: String, modelYear: Int)
  case class User(id: Int, override val name: String, override val age: Int, car: Car, location: Location)
    extends Person with ParkingService {
    override def nearestParking(parkingLocation: Parking): Boolean = {
      if (location.h - parkingLocation.address.location.h < 100 &&
        location.l - parkingLocation.address.location.l < 100 && parkingLocation.capacity != 0) {
        true
      } else false
    }

    override def parkingStatus(parking: Parking): String =
      if (nearestParking(parking)) {
        s"$this can park in parking ${parking.name} with address ${parking.address}"
      } else s"the is no appropriate parking near $this"
  }

  case class Parking(name: String, address: Address, capacity: Int)
  case class Address(street: String, no: Int, location: Location)




}
