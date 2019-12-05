package typingsSlinky.vexflow.Vex.Flow

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vexflow.Anon_Color
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.RaphaelContext")
@js.native
class RaphaelContext protected () extends IRenderContext {
  def this(element: HTMLElement) = this()
  @JSName("glow")
  def glow_Anon_Color(): Anon_Color = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  @JSName("setLineWidth")
  def setLineWidth_Unit(width: Double): Unit = js.native
  def setViewBox(viewBox: String): Unit = js.native
}

