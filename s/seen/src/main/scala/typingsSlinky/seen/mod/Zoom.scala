package typingsSlinky.seen.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.seen.anon.Smooth
import typingsSlinky.seen.anon.SmoothBoolean
import typingsSlinky.seen.mod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Zoom")
@js.native
class Zoom protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: SmoothBoolean) = this()
  def this(elementOrId: HTMLElement, options: SmoothBoolean) = this()
  var defaults: Smooth = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var speed: Double = js.native
}

