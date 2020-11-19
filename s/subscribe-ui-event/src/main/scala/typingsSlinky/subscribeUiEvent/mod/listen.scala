package typingsSlinky.subscribeUiEvent.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.subscribeUiEvent.anon.Remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): Remove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Remove = js.native
}
