import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration._

val promise = Promise[String]()
val first = for(first <- promise.future) yield (s"$first FIRST!")

def sendToUsa(message: String) = Future {
  Thread.sleep(scala.util.Random.nextInt(5000))
  message
}.map(m => promise.success(s"USA received $m"))

def sendToLuxembourg(message: String) = Future {
  Thread.sleep(scala.util.Random.nextInt(5000))
  message
}.map(m => promise.success(s"Luxembourg received $m"))

sendToUsa("Hello!"); sendToLuxembourg("Moien!")

Await.result(first, 8.seconds)