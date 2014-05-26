case class Person(age: Int, name: String) {
  def sayHi = println(s"Hi!, I'm $name and I'm $age")
}
implicit def tupleToPerson(t: (Int, String)): Person = {
  Person(t._1, t._2)
}
(28, "Alexis").sayHi