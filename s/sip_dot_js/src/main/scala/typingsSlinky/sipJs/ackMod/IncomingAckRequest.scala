package typingsSlinky.sipJs.ackMod

import typingsSlinky.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingAckRequest extends js.Object {
  /** The incoming message. */
  val message: IncomingRequestMessage = js.native
}

object IncomingAckRequest {
  @scala.inline
  def apply(message: IncomingRequestMessage): IncomingAckRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingAckRequest]
  }
  @scala.inline
  implicit class IncomingAckRequestOps[Self <: IncomingAckRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IncomingRequestMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

