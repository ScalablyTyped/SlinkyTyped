package typingsSlinky.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitorInfo extends js.Object {
  var display_name: String = js.native
  var email: String = js.native
  var phone: String = js.native
}

object VisitorInfo {
  @scala.inline
  def apply(display_name: String, email: String, phone: String): VisitorInfo = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitorInfo]
  }
  @scala.inline
  implicit class VisitorInfoOps[Self <: VisitorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

