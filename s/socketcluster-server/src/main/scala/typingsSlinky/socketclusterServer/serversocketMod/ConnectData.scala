package typingsSlinky.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectData extends js.Object {
  var authError: js.UndefOr[js.Error] = js.undefined
  var id: String
  var isAuthenticated: Boolean
  var pingTimeout: Double
}

object ConnectData {
  @scala.inline
  def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double, authError: js.Error = null): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
    if (authError != null) __obj.updateDynamic("authError")(authError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectData]
  }
}

