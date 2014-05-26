import worksheet.Samples._

for {
  s <- speakers
  ic <- imaginaryChildren if (ic.name == s.name)
} yield (s, ic)

speakers.flatMap{s => imaginaryChildren
  .filter(_.name == s.name)
  .map(ic => (s, ic))
}