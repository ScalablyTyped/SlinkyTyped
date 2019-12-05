package typingsSlinky.seen.seenMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.seen.Anon_Inertia
import typingsSlinky.seen.Anon_InertiaBoolean
import typingsSlinky.seen.Anon_Offset
import typingsSlinky.seen.seenMod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Drag")
@js.native
class Drag protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: Anon_InertiaBoolean) = this()
  def this(elementOrId: HTMLElement, options: Anon_InertiaBoolean) = this()
  var defaults: Anon_Inertia = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var inertia: Boolean = js.native
  def on(`type`: String, listener: js.Function1[/* e */ Anon_Offset, Unit]): Dispatcher = js.native
}

