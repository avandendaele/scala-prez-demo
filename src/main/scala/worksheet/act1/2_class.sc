import dom.Person

class Person(val name: String, val firstName: String) {
  override def toString = s"[name=$name, firstname=$firstName]"
}

val p = new Person("Odersky", "Martin")