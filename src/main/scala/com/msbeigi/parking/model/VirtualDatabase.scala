package com.msbeigi.parking.model
import com.msbeigi.parking.domain.Domains.*

object VirtualDatabase {

  val location1: Location = Location(35.703010, 51.341765)
  val location2: Location = Location(35.706310, 51.338408)
  val location3: Location = Location(35.703942, 51.334432)

  val address1: Address = Address("Hafez", 22, location1)
  val address2: Address = Address("Jomhouri", 21, location2)
  val address3: Address = Address("Valiasr", 87, location3)

  val car1: Car = Car("Mercedes", 1988)
  val car2: Car = Car("Mazda", 2005)
  val car3: Car = Car("Volvo", 2010)


  val user1 = User(1, "Mohsen", 22, car1, Location(35.599482, 51.953622))
  val user2 = User(2, "Mohsen", 45, car2, Location(33.663514, 52.988564))
  val user3 = User(3, "Mohsen", 63, car3, Location(34.599482, 50.623145))

  val parking1 = Parking("Asadi", address1, 10)
  val parking2 = Parking("Novin", address2, 0)
  val parking3 = Parking("Ahaadi", address3, 0)

  //  val parking1 = Parking()

  def main(args: Array[String]): Unit = {
    val userRunServices = List (
      new UserRunService(user1, parking1),
      new UserRunService(user2, parking2),
      new UserRunService(user3, parking3)
    )

    userRunServices.foreach { u =>
      println(u.userStatusService())
    }

  }
}
