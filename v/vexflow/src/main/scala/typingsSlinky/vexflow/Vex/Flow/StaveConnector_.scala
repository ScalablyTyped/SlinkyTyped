package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.StaveConnector.`type`
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Shiftx
import typingsSlinky.vexflow.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveConnector_ extends js.Object {
  var bottom_stave: Stave = js.native
  var thickness: Double = js.native
  var top_stave: Stave = js.native
  var x_shift: Double = js.native
  def draw(): Unit = js.native
  def drawBoldDoubleLine(ctx: js.Object, `type`: `type`, topX: Double, topY: Double, botY: Double): Unit = js.native
  def setContext(ctx: IRenderContext): StaveConnector = js.native
  def setFont(font: Size): Unit = js.native
  def setText(text: String): StaveConnector = js.native
  def setText(text: String, text_options: Shiftx): StaveConnector = js.native
  def setType(`type`: `type`): StaveConnector = js.native
   //inconsistent type: void -> StaveConnector
  def setXShift(x_shift: Double): StaveConnector = js.native
}

