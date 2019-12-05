package typingsSlinky.w3cDashWebDashUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.ok
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.stall
  - typings.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.babble
*/
trait USBTransferStatus extends js.Object

object USBTransferStatus {
  @scala.inline
  def babble: typingsSlinky.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.babble = this.cast("babble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ok: typingsSlinky.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.ok = this.cast("ok")
  @scala.inline
  def stall: typingsSlinky.w3cDashWebDashUsb.w3cDashWebDashUsbStrings.stall = this.cast("stall")
}

