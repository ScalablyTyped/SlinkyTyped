package typingsSlinky.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsHandshake extends AbstractHandshake {
  var authData: CredentialsAuthData = js.native
  var login: String = js.native
  var password: String = js.native
}

object CredentialsHandshake {
  @scala.inline
  def apply(
    authData: CredentialsAuthData,
    authType: String,
    authVersion: String,
    deploymentId: String,
    getHandshakeFields: Client => HandshakeFields,
    login: String,
    password: String,
    sandboxId: String
  ): CredentialsHandshake = {
    val __obj = js.Dynamic.literal(authData = authData.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any], authVersion = authVersion.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], getHandshakeFields = js.Any.fromFunction1(getHandshakeFields), login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], sandboxId = sandboxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsHandshake]
  }
  @scala.inline
  implicit class CredentialsHandshakeOps[Self <: CredentialsHandshake] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthData(value: CredentialsAuthData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

