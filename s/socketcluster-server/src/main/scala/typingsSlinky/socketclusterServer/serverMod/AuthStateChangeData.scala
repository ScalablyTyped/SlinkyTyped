package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.AuthToken
import typingsSlinky.socketclusterServer.serversocketMod.StateChangeData
import typingsSlinky.socketclusterServer.socketclusterServerStrings.authenticated
import typingsSlinky.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStateChangeData extends StateChangeData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object AuthStateChangeData {
  @scala.inline
  def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typingsSlinky.socketclusterServer.serversocketMod.^,
    authToken: AuthToken = null
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
}

