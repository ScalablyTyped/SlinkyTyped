package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.AnonPosition
import typingsSlinky.vexflow.AnonSize
import typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TextBracket")
@js.native
class TextBracket_ protected () extends js.Object {
  def this(bracket_data: AnonPosition) = this()
  var position: Positions = js.native
  var start: Note = js.native
  var stop: Note = js.native
  def applyStyle(context: IRenderContext): TextBracket = js.native
  def draw(): Unit = js.native
  def setContext(context: IRenderContext): TextBracket = js.native
  def setDashed(dashed: Boolean): TextBracket = js.native
  def setDashed(dashed: Boolean, dash: js.Array[Double]): TextBracket = js.native
  def setFont(font: AnonSize): TextBracket = js.native
  def setLine(line: Double): TextBracket = js.native
}

