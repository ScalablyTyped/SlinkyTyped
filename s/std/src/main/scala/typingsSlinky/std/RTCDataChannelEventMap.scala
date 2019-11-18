package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDataChannelEventMap extends js.Object {
  var bufferedamountlow: org.scalajs.dom.raw.Event
  var close: org.scalajs.dom.raw.Event
  var error: RTCErrorEvent
  var message: org.scalajs.dom.raw.MessageEvent
  var open: org.scalajs.dom.raw.Event
}

object RTCDataChannelEventMap {
  @scala.inline
  def apply(
    bufferedamountlow: org.scalajs.dom.raw.Event,
    close: org.scalajs.dom.raw.Event,
    error: RTCErrorEvent,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): RTCDataChannelEventMap = {
    val __obj = js.Dynamic.literal(bufferedamountlow = bufferedamountlow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCDataChannelEventMap]
  }
}

