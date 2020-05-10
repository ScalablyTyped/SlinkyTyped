package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAction
  extends ActionObject[js.Any, js.Any] {
  var sendId: String | Double = js.native
}

object CancelAction {
  @scala.inline
  def apply(sendId: String | Double, `type`: String): CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAction]
  }
  @scala.inline
  implicit class CancelActionOps[Self <: CancelAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSendId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

