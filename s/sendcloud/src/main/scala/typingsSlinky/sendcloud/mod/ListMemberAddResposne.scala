package typingsSlinky.sendcloud.mod

import typingsSlinky.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAddResposne extends js.Object {
  var message: success = js.native
  var total_counts: Double = js.native
}

object ListMemberAddResposne {
  @scala.inline
  def apply(message: success, total_counts: Double): ListMemberAddResposne = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], total_counts = total_counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAddResposne]
  }
  @scala.inline
  implicit class ListMemberAddResposneOps[Self <: ListMemberAddResposne] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_counts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_counts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

