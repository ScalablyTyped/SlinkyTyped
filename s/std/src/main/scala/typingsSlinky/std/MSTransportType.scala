package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.BT
  - typingsSlinky.std.stdStrings.Embedded
  - typingsSlinky.std.stdStrings.NFC
  - typingsSlinky.std.stdStrings.USB
*/
trait MSTransportType extends js.Object

object MSTransportType {
  @scala.inline
  def BT: typingsSlinky.std.stdStrings.BT = this.cast("BT")
  @scala.inline
  def Embedded: typingsSlinky.std.stdStrings.Embedded = this.cast("Embedded")
  @scala.inline
  def NFC: typingsSlinky.std.stdStrings.NFC = this.cast("NFC")
  @scala.inline
  def USB: typingsSlinky.std.stdStrings.USB = this.cast("USB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

