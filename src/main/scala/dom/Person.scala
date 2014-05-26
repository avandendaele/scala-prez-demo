package dom

case class Person(name: String, firstName: String, age: Int, gender: Gender = Male) {
  def greet = s"Hi, I'm $name $firstName"
}
