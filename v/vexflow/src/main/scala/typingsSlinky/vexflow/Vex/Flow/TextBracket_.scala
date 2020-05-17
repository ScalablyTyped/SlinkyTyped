package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBracket_ extends js.Object {
  var position: Positions = js.native
  var start: Note = js.native
  var stop: Note = js.native
  def applyStyle(context: IRenderContext): TextBracket = js.native
  def draw(): Unit = js.native
  def setContext(context: IRenderContext): TextBracket = js.native
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  def setFont(font: Family): TextBracket = js.native
  def setLine(line: Double): TextBracket = js.native
}

