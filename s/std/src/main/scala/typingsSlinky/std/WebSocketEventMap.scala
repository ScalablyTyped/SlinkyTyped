package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketEventMap extends js.Object {
  var close: org.scalajs.dom.raw.CloseEvent
  var error: org.scalajs.dom.raw.Event
  var message: org.scalajs.dom.raw.MessageEvent
  var open: org.scalajs.dom.raw.Event
}

object WebSocketEventMap {
  @scala.inline
  def apply(
    close: org.scalajs.dom.raw.CloseEvent,
    error: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
}

