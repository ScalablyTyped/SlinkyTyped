package typingsSlinky.sixRuntime.Six.plugins.sso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ssoClientConf extends js.Object {
  var callbackUrl: String
  var clientId: String
  var env: String
  var protocol: String
  var secret: String
  var token: typingsSlinky.sixRuntime.Six.plugins.sso.token
  def errorHook(error: js.Error): Unit
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
}

