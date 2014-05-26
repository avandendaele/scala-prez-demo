def parseArg(arg: String) = arg match {
  case "--help" | "-h" => println("Afficher l'aide")
  case "--version" | "-v" => println("Afficher la version")
  case unknownArg => println(s"Argument non reconnu: $unknownArg")
}
