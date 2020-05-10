package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContactemail extends js.Object {
  var contact_email: String = js.native
}

object AnonContactemail {
  @scala.inline
  def apply(contact_email: String): AnonContactemail = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContactemail]
  }
  @scala.inline
  implicit class AnonContactemailOps[Self <: AnonContactemail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContact_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_email")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

