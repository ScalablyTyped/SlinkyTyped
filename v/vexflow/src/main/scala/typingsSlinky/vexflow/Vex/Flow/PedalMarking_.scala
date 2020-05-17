package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.PedalMarking.Styles
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PedalMarking_ extends js.Object {
  def draw(): Unit = js.native
  def drawBracketed(): Unit = js.native
  def drawText(): Unit = js.native
  def setContext(context: IRenderContext): PedalMarking = js.native
  def setCustomText(): PedalMarking = js.native
  def setCustomText(depress: String): PedalMarking = js.native
  def setCustomText(depress: String, release: String): PedalMarking = js.native
  def setLine(line: Double): PedalMarking = js.native
  def setStyle(style: Styles): PedalMarking = js.native
}

