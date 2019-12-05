package typingsSlinky.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateRequest extends js.Object {
  var authToken: AuthToken
  var socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^
}

object AuthenticateRequest {
  @scala.inline
  def apply(authToken: AuthToken, socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^): AuthenticateRequest = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticateRequest]
  }
}

