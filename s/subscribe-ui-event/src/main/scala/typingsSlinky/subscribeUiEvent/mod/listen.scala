package typingsSlinky.subscribeUiEvent.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.subscribeUiEvent.AnonRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscribe-ui-event", "listen")
@js.native
object listen extends js.Object {
  def apply(target: EventTarget, eventType: String, handler: EventListenerOrEventListenerObject): AnonRemove = js.native
  def apply(
    target: EventTarget,
    eventType: String,
    handler: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): AnonRemove = js.native
}

