import worksheet.Samples._
import dom.Person

implicit object AgeOrdering extends Ordering[Person] {
  def compare(a: Person, b: Person) = a.age compare b.age
}

imaginaryChildren.sorted.mkString("\n")
