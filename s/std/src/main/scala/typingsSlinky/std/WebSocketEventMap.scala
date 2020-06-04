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
  @scala.inline
  implicit class WebSocketEventMapOps[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: org.scalajs.dom.raw.CloseEvent): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: org.scalajs.dom.raw.Event): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: org.scalajs.dom.raw.MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: org.scalajs.dom.raw.Event): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

