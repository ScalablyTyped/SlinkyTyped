package typingsSlinky.sipJs.incomingResponseMod

import typingsSlinky.sipJs.incomingResponseMessageMod.IncomingResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingResponse extends js.Object {
  /** The incoming message. */
  val message: IncomingResponseMessage = js.native
}

object IncomingResponse {
  @scala.inline
  def apply(message: IncomingResponseMessage): IncomingResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingResponse]
  }
  @scala.inline
  implicit class IncomingResponseOps[Self <: IncomingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IncomingResponseMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

