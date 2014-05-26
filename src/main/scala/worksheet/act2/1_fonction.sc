def profile(arg: Int, fct: Int => Int) = {
  val r = fct(arg)
  println(s"value = $r")
  r
}

val add42 = {i: Int => i + 42}

val profiled = profile(3, add42)