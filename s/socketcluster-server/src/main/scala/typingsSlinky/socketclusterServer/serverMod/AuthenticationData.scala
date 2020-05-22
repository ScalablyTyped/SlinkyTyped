package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.AuthToken
import typingsSlinky.socketclusterServer.serversocketMod.AuthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationData extends AuthenticateData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object AuthenticationData {
  @scala.inline
  def apply(socket: typingsSlinky.socketclusterServer.serversocketMod.^, authToken: AuthToken = null): AuthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
}

