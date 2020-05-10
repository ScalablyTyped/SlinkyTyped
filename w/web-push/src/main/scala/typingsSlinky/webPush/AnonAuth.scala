package typingsSlinky.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuth extends js.Object {
  var auth: String = js.native
  var p256dh: String = js.native
}

object AnonAuth {
  @scala.inline
  def apply(auth: String, p256dh: String): AnonAuth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuth]
  }
  @scala.inline
  implicit class AnonAuthOps[Self <: AnonAuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP256dh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

