package typingsSlinky.seen.seenMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.seen.Anon_Smooth
import typingsSlinky.seen.Anon_SmoothBoolean
import typingsSlinky.seen.seenMod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Zoom")
@js.native
class Zoom protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: Anon_SmoothBoolean) = this()
  def this(elementOrId: HTMLElement, options: Anon_SmoothBoolean) = this()
  var defaults: Anon_Smooth = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var speed: Double = js.native
}

