package typingsSlinky.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait badAuthStatus extends js.Object {
  var authError: js.Error
  var signedAuthToken: String
}

object badAuthStatus {
  @scala.inline
  def apply(authError: js.Error, signedAuthToken: String): badAuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[badAuthStatus]
  }
}

