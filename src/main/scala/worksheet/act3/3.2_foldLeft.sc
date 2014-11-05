import dom.{Female, Male}
import worksheet.Samples._

imaginaryChildren.foldLeft((0,0)) { (acc, p) => p.gender match {
    case Female => (acc._1 + 1, acc._2)
    case Male => (acc._1, acc._2 + 1)
    case _ => acc
  }
}
