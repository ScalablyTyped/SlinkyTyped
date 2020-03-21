package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.trezorConnectStrings.valid
  - typingsSlinky.trezorConnect.trezorConnectStrings.outdated
  - typingsSlinky.trezorConnect.trezorConnectStrings.required
*/
trait DeviceFirmwareStatus extends js.Object

object DeviceFirmwareStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def outdated: typingsSlinky.trezorConnect.trezorConnectStrings.outdated = this.cast("outdated")
  @scala.inline
  def required: typingsSlinky.trezorConnect.trezorConnectStrings.required = this.cast("required")
  @scala.inline
  def valid: typingsSlinky.trezorConnect.trezorConnectStrings.valid = this.cast("valid")
}

