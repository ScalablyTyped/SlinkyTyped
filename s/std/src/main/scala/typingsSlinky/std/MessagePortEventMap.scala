package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePortEventMap extends js.Object {
  var message: org.scalajs.dom.raw.MessageEvent
  var messageerror: org.scalajs.dom.raw.MessageEvent
}

object MessagePortEventMap {
  @scala.inline
  def apply(message: org.scalajs.dom.raw.MessageEvent, messageerror: org.scalajs.dom.raw.MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessagePortEventMap]
  }
}

