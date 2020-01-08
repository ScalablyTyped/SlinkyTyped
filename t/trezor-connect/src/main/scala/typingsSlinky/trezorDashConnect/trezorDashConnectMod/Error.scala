package typingsSlinky.trezorDashConnect.trezorDashConnectMod

import typingsSlinky.trezorDashConnect.Anon_Error
import typingsSlinky.trezorDashConnect.trezorDashConnectBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends ResponseMessage[js.Any] {
  var payload: Anon_Error
  var success: `false`
}

object Error {
  @scala.inline
  def apply(payload: Anon_Error, success: `false`): Error = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Error]
  }
}

