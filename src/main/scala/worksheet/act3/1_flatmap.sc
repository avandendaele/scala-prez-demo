import dom.Person
import worksheet.Samples._
/*
 * Filter
 */
speakers.filter(s => s.age <= 25)
/*
 * Map
 */
speakers.map(s => s.name + " " + s.firstName)
/**
 * FlatMap
 */
speakers.flatMap(s => s :: imaginaryChildren)
  .mkString("\n")

