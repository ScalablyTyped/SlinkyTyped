package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.FrameRequestCallback
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Window")
@js.native
class Window_ () extends Window {
  /* CompleteClass */
  override val localStorage: org.scalajs.dom.raw.Storage = js.native
  /* CompleteClass */
  override val sessionStorage: org.scalajs.dom.raw.Storage = js.native
  /* CompleteClass */
  override def cancelAnimationFrame(handle: Double): Unit = js.native
  /* CompleteClass */
  override def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}

@JSGlobal("Window")
@js.native
object Window_
  extends Instantiable0[org.scalajs.dom.raw.Window]

