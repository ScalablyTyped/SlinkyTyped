package typingsSlinky.seen.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.seen.anon.Inertia
import typingsSlinky.seen.anon.Offset
import typingsSlinky.seen.anon.`0`
import typingsSlinky.seen.mod.Events.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Drag")
@js.native
class Drag protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: `0`) = this()
  def this(elementOrId: HTMLElement, options: `0`) = this()
  
  var defaults: Inertia = js.native
  
  var dispatch: Dispatcher = js.native
  
  var el: HTMLElement = js.native
  
  var inertia: Boolean = js.native
  
  def on(`type`: String, listener: js.Function1[/* e */ Offset, Unit]): Dispatcher = js.native
}
