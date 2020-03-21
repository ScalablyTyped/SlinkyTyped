package typingsSlinky.vexflow.Vex.Flow

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.RaphaelContext")
@js.native
class RaphaelContext protected () extends IRenderContext {
  def this(element: HTMLElement) = this()
  @JSName("glow")
  def glow_RaphaelContext(): RaphaelContext = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setLineWidth")
  def setLineWidth_RaphaelContext(width: Double): RaphaelContext = js.native
  def setViewBox(viewBox: String): Unit = js.native
}

