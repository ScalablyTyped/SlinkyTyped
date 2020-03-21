package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.trezorConnectStrings.available
  - typingsSlinky.trezorConnect.trezorConnectStrings.occupied
  - typingsSlinky.trezorConnect.trezorConnectStrings.used
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def available: typingsSlinky.trezorConnect.trezorConnectStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def occupied: typingsSlinky.trezorConnect.trezorConnectStrings.occupied = this.cast("occupied")
  @scala.inline
  def used: typingsSlinky.trezorConnect.trezorConnectStrings.used = this.cast("used")
}

