package worksheet

import dom._

object Samples {
  val persons = List(
    Person("Odersky", "Martin", 55, Male),
    Person("Kuhn", "Roland", 42, Male),
    Person("Suereth","Josh", 31, Male)
  )
  val imaginaryChildren = List(
    Person("Cominotto", "Obiwan", 70, Male),
    Person("Vandendaele", "Leonard", 30, Male),
    Person("Vandendaele", "Penny", 30, Female),
    Person("Cominotto", "Leia", 28, Female),
    Person("Vandendaele", "Rajesh", 30, Male),
    Person("Cominotto", "MorningLightMountain", 2789, Other)
  )
  val speakers = List(
    Person("Cominotto", "Adrien", 24, Male),
    Person("Vandendaele", "Alexis", 28, Male)
  )
}
