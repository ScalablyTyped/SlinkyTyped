package typingsSlinky.vexflow.Vex.Flow

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vexflow.Vex.Flow.Renderer.Backends
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Renderer")
@js.native
class Renderer_ protected () extends js.Object {
  def this(sel: HTMLElement, backend: Backends) = this()
  def getContext(): IRenderContext = js.native
  def resize(width: Double, height: Double): Renderer = js.native
}

