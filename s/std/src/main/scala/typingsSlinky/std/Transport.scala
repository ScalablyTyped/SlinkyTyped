package typingsSlinky.std

import typingsSlinky.std.stdStrings.nfc_
import typingsSlinky.std.stdStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.usb_
  - typings.std.stdStrings.nfc_
  - typings.std.stdStrings.ble
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  def ble: typingsSlinky.std.stdStrings.ble = this.cast("ble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nfc: nfc_ = this.cast("nfc")
  @scala.inline
  def usb: usb_ = this.cast("usb")
}

