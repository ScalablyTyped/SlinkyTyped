package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastChannelEventMap extends js.Object {
  var message: org.scalajs.dom.raw.MessageEvent
  var messageerror: org.scalajs.dom.raw.MessageEvent
}

object BroadcastChannelEventMap {
  @scala.inline
  def apply(message: org.scalajs.dom.raw.MessageEvent, messageerror: org.scalajs.dom.raw.MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
}

