package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceEventMap extends js.Object {
  var error: org.scalajs.dom.raw.Event
  var message: org.scalajs.dom.raw.MessageEvent
  var open: org.scalajs.dom.raw.Event
}

object EventSourceEventMap {
  @scala.inline
  def apply(
    error: org.scalajs.dom.raw.Event,
    message: org.scalajs.dom.raw.MessageEvent,
    open: org.scalajs.dom.raw.Event
  ): EventSourceEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventSourceEventMap]
  }
}

