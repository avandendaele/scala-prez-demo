import scala.util.Random

case class MyClass(a: Int, b: String)

MyClass(Random.nextInt(100), "bar") match {
  case MyClass(42, s) => println(s"Bravo! $s,  tu as trouvé la réponse!")
  case MyClass(n, "foo") if n < 42 => println(s"$n, trop bas");
  case MyClass(n, "foo") if n > 42 => println(s"$n trop haut");
  case MyClass(n, s) => println(s"Désolé $s, $n n'est pas la réponse")
}