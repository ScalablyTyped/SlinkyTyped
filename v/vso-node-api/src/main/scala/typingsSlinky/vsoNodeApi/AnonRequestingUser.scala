package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequestingUser extends js.Object {
  var requestingUser: Double = js.native
  var serviceAccount: Double = js.native
}

object AnonRequestingUser {
  @scala.inline
  def apply(requestingUser: Double, serviceAccount: Double): AnonRequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestingUser]
  }
  @scala.inline
  implicit class AnonRequestingUserOps[Self <: AnonRequestingUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestingUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

