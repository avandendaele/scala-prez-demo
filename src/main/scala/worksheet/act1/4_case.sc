import dom.Person

/**
 * Classic class Person
 * @param name
 * @param firstName
 */
class Person(val name: String, val firstName: String) {
  override def toString = s"[name=$name, firstname=$firstName]"
}
val p = new Person("Odersky", "Martin")

/**
 * Case class Person named here Person2
 * @param name
 * @param firstName
 */
case class Person2(val name: String, val firstName: String)

val p2 = Person2("Odersky", "Martin")