package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.ConnectData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends ConnectData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object ConnectionData {
  @scala.inline
  def apply(
    id: String,
    isAuthenticated: Boolean,
    pingTimeout: Double,
    socket: typingsSlinky.socketclusterServer.serversocketMod.^,
    authError: js.Error = null
  ): ConnectionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authError != null) __obj.updateDynamic("authError")(authError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionData]
  }
}

