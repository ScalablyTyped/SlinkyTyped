package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSetServerQueryLogin extends js.Object {
  var client_login_password: String = js.native
}

object ClientSetServerQueryLogin {
  @scala.inline
  def apply(client_login_password: String): ClientSetServerQueryLogin = {
    val __obj = js.Dynamic.literal(client_login_password = client_login_password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetServerQueryLogin]
  }
  @scala.inline
  implicit class ClientSetServerQueryLoginOps[Self <: ClientSetServerQueryLogin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_login_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

