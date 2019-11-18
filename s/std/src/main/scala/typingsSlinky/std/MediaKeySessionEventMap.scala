package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySessionEventMap extends js.Object {
  var keystatuseschange: org.scalajs.dom.raw.Event
  var message: org.scalajs.dom.raw.MessageEvent
}

object MediaKeySessionEventMap {
  @scala.inline
  def apply(keystatuseschange: org.scalajs.dom.raw.Event, message: org.scalajs.dom.raw.MessageEvent): MediaKeySessionEventMap = {
    val __obj = js.Dynamic.literal(keystatuseschange = keystatuseschange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaKeySessionEventMap]
  }
}

