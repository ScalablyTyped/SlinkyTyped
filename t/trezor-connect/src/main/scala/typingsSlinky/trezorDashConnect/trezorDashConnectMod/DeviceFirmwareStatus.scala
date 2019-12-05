package typingsSlinky.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectStrings.valid
  - typings.trezorDashConnect.trezorDashConnectStrings.outdated
  - typings.trezorDashConnect.trezorDashConnectStrings.required
*/
trait DeviceFirmwareStatus extends js.Object

object DeviceFirmwareStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def outdated: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.outdated = this.cast("outdated")
  @scala.inline
  def required: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.required = this.cast("required")
  @scala.inline
  def valid: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.valid = this.cast("valid")
}

