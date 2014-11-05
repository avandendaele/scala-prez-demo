case class FooException(msg: String) extends RuntimeException(msg)

try {
  throw new FooException("bar")
} catch {
  case FooException(msg) => println(s"Exception $msg")
  case e: RuntimeException =>
    println("RuntimeException catched and rethrown")
    throw e
  case scala.util.control.NonFatal(e) =>
    println("Something not that bad occured")
    throw e
}
