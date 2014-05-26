import scala.concurrent.duration._
import scala.language.postfixOps
import scala.concurrent._
import ExecutionContext.Implicits.global
//

val promise = Promise[String]()
//

val first = for(first <- promise.future) yield (s"$first FIRST!")
//

def sendToUsa(message: String) = Future {
  Thread.sleep(scala.util.Random.nextInt(5000))
  message
}.map(m => promise.success(s"USA received $m"))
//

def sendToChina(message: String) = Future {
  Thread.sleep(scala.util.Random.nextInt(5000))
  message
}.map(m => promise.success(s"China received $m"))
//

sendToUsa("Hello!"); sendToChina("Ni hao!")
// Non-blocking calls

// Worksheet trick to see the result
Await.result(first, 5 seconds)