package typingsSlinky.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[js.Error] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var event: String
  var socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^
}

object EmitRequest {
  @scala.inline
  def apply(
    event: String,
    socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^,
    authTokenExpiredError: js.Error = null,
    data: js.Any = null
  ): EmitRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitRequest]
  }
}

