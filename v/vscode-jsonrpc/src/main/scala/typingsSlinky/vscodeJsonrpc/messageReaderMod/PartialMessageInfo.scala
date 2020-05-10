package typingsSlinky.vscodeJsonrpc.messageReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialMessageInfo extends js.Object {
  val messageToken: Double = js.native
  val waitingTime: Double = js.native
}

object PartialMessageInfo {
  @scala.inline
  def apply(messageToken: Double, waitingTime: Double): PartialMessageInfo = {
    val __obj = js.Dynamic.literal(messageToken = messageToken.asInstanceOf[js.Any], waitingTime = waitingTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMessageInfo]
  }
  @scala.inline
  implicit class PartialMessageInfoOps[Self <: PartialMessageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageToken(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitingTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

