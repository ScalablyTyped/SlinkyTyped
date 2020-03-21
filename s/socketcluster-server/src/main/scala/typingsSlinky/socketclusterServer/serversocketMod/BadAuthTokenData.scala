package typingsSlinky.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadAuthTokenData extends js.Object {
  var authError: js.Error
  var signedAuthToken: String
}

object BadAuthTokenData {
  @scala.inline
  def apply(authError: js.Error, signedAuthToken: String): BadAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadAuthTokenData]
  }
}

