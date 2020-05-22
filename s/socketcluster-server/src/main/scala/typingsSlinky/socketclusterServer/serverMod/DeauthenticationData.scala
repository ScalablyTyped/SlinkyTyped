package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.AuthToken
import typingsSlinky.socketclusterServer.serversocketMod.DeauthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeauthenticationData extends DeauthenticateData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object DeauthenticationData {
  @scala.inline
  def apply(socket: typingsSlinky.socketclusterServer.serversocketMod.^, oldAuthToken: AuthToken = null): DeauthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (oldAuthToken != null) __obj.updateDynamic("oldAuthToken")(oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticationData]
  }
}

