package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestingUser extends js.Object {
  var requestingUser: scala.Double = js.native
  var serviceAccount: scala.Double = js.native
}

object RequestingUser {
  @scala.inline
  def apply(requestingUser: scala.Double, serviceAccount: scala.Double): RequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestingUser]
  }
  @scala.inline
  implicit class RequestingUserOps[Self <: RequestingUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestingUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

