package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.w3cWebUsb.w3cWebUsbStrings.ok
  - typingsSlinky.w3cWebUsb.w3cWebUsbStrings.stall
  - typingsSlinky.w3cWebUsb.w3cWebUsbStrings.babble
*/
trait USBTransferStatus extends js.Object

object USBTransferStatus {
  @scala.inline
  def babble: typingsSlinky.w3cWebUsb.w3cWebUsbStrings.babble = this.cast("babble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ok: typingsSlinky.w3cWebUsb.w3cWebUsbStrings.ok = this.cast("ok")
  @scala.inline
  def stall: typingsSlinky.w3cWebUsb.w3cWebUsbStrings.stall = this.cast("stall")
}

