class Animal {
  override def toString = "I'm an animal"
}

trait Flying extends Animal {
  override def toString = s"${super.toString} and I fly"
}

trait Swimming extends Animal {
  override def toString = s"${super.toString} and I swim"
}

val swimmingBird = new Animal with Flying with Swimming
val flyingFish = new Animal with Swimming with Flying