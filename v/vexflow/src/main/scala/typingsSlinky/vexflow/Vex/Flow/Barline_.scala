package typingsSlinky.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Barline_ extends StaveModifier {
  def draw(stave: Stave): Unit = js.native
  def draw(stave: Stave, x_shift: Double): Unit = js.native
  def drawRepeatBar(stave: Stave, x: Double, begin: Boolean): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double): Unit = js.native
  def drawVerticalBar(stave: Stave, x: Double, double_bar: Boolean): Unit = js.native
  def drawVerticalEndBar(stave: Stave, x: Double): Unit = js.native
  def setX(x: Double): Barline = js.native
}

