val foo = Option(42)
foo match {
  case Some(v) => println(v)
  case None => println("Whoops, nothing...")
}
