class Person(val name: String, val firstName: String) {
  override def toString = s"[name=$name, firstname=$firstName]"
}

object Person { // Companion object
  def apply(name: String, firstName: String) = new Person(name, firstName)

  // Made lazy because we are in worksheet
  lazy val all = List(
      Person("Odersky", "Martin"),
      Person("Kuhn", "Roland"),
      Person("Suereth","Josh"))
}

val vips = Person.all

vips.mkString("\n") // Pretty print