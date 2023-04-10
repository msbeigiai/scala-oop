package com.msbeigi.pl

object TestOop {

  /*  abstract class Shape(protected val color: String, protected val isFilled: Boolean) {
    def draw(): String
  }

  case class Circle(radius: Double = 1.0, override protected val color: String = "red", override protected val isFilled: Boolean = true)
    extends Shape(color, isFilled) {
    override def draw(): String = s"Draw circle with radius $radius, color $color and is filled $isFilled"
  }*/

  abstract class Shape {
    def color: String

    def isFilled: Boolean

    def draw(): String
  }

  case class Circle(radius: Double = 1.0, override val color: String = "red", override val isFilled: Boolean = true) extends Shape {
    override def draw(): String = s"Draw circle with radius $radius, color $color and is filled $isFilled"
  }

  def main(args: Array[String]): Unit = {
    val circle = Circle()
    val circle2 = Circle(2.0, "blue", false)
    println(circle.draw())
    println(circle2.draw())
  }
}
