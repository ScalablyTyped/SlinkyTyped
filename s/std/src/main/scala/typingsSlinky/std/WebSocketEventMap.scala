package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketEventMap extends js.Object {
  var close: org.scalajs.dom.raw.CloseEvent
  var error: Event_
  var message: org.scalajs.dom.raw.MessageEvent
  var open: Event_
}

object WebSocketEventMap {
  @scala.inline
  def apply(
    close: org.scalajs.dom.raw.CloseEvent,
    error: Event_,
    message: org.scalajs.dom.raw.MessageEvent,
    open: Event_
  ): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebSocketEventMap]
  }
}

