package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.trezorConnectStrings.normal
  - typingsSlinky.trezorConnect.trezorConnectStrings.bootloader
  - typingsSlinky.trezorConnect.trezorConnectStrings.initialize
  - typingsSlinky.trezorConnect.trezorConnectStrings.seedless
*/
trait DeviceMode extends js.Object

object DeviceMode {
  @scala.inline
  def bootloader: typingsSlinky.trezorConnect.trezorConnectStrings.bootloader = this.cast("bootloader")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def initialize: typingsSlinky.trezorConnect.trezorConnectStrings.initialize = this.cast("initialize")
  @scala.inline
  def normal: typingsSlinky.trezorConnect.trezorConnectStrings.normal = this.cast("normal")
  @scala.inline
  def seedless: typingsSlinky.trezorConnect.trezorConnectStrings.seedless = this.cast("seedless")
}

