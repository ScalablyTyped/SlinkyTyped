package typingsSlinky.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.trezorDashConnectStrings.normal
  - typings.trezorDashConnect.trezorDashConnectStrings.bootloader
  - typings.trezorDashConnect.trezorDashConnectStrings.initialize
  - typings.trezorDashConnect.trezorDashConnectStrings.seedless
*/
trait DeviceMode extends js.Object

object DeviceMode {
  @scala.inline
  def bootloader: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.bootloader = this.cast("bootloader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.initialize = this.cast("initialize")
  @scala.inline
  def normal: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.normal = this.cast("normal")
  @scala.inline
  def seedless: typingsSlinky.trezorDashConnect.trezorDashConnectStrings.seedless = this.cast("seedless")
}

