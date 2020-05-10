package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessResp extends js.Object {
  var email_id_list: js.Array[String] = js.native
  var message: success = js.native
}

object SuccessResp {
  @scala.inline
  def apply(email_id_list: js.Array[String], message: success): SuccessResp = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResp]
  }
  @scala.inline
  implicit class SuccessRespOps[Self <: SuccessResp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail_id_list(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_id_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

