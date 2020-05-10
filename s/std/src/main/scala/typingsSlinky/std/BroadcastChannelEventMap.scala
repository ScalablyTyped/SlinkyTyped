package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastChannelEventMap extends js.Object {
  var message: org.scalajs.dom.raw.MessageEvent = js.native
  var messageerror: org.scalajs.dom.raw.MessageEvent = js.native
}

object BroadcastChannelEventMap {
  @scala.inline
  def apply(message: org.scalajs.dom.raw.MessageEvent, messageerror: org.scalajs.dom.raw.MessageEvent): BroadcastChannelEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastChannelEventMap]
  }
  @scala.inline
  implicit class BroadcastChannelEventMapOps[Self <: BroadcastChannelEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageerror(value: org.scalajs.dom.raw.MessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageerror")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

