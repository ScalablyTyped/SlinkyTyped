package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.AnonDescription
import typingsSlinky.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailListUpdateResponse extends js.Object {
  var list: AnonDescription = js.native
  var message: success = js.native
}

object EmailListUpdateResponse {
  @scala.inline
  def apply(list: AnonDescription, message: success): EmailListUpdateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateResponse]
  }
  @scala.inline
  implicit class EmailListUpdateResponseOps[Self <: EmailListUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
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

