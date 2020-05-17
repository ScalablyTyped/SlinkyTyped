package typingsSlinky.sixRuntime.Six.plugins.sso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ssoClientConf extends js.Object {
  var callbackUrl: String = js.native
  var clientId: String = js.native
  var env: String = js.native
  var protocol: String = js.native
  var secret: String = js.native
  var token: typingsSlinky.sixRuntime.Six.plugins.sso.token = js.native
  def errorHook(error: js.Error): Unit = js.native
}

object ssoClientConf {
  @scala.inline
  def apply(
    callbackUrl: String,
    clientId: String,
    env: String,
    errorHook: js.Error => Unit,
    protocol: String,
    secret: String,
    token: token
  ): ssoClientConf = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], errorHook = js.Any.fromFunction1(errorHook), protocol = protocol.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ssoClientConf]
  }
  @scala.inline
  implicit class ssoClientConfOps[Self <: ssoClientConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorHook(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

