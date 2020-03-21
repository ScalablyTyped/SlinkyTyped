package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.BadAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadSocketAuthTokenData extends BadAuthTokenData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object BadSocketAuthTokenData {
  @scala.inline
  def apply(
    authError: js.Error,
    signedAuthToken: String,
    socket: typingsSlinky.socketclusterServer.serversocketMod.^
  ): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
}

