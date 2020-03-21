package typingsSlinky.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.speakeasy.speakeasyStrings.ascii
  - typingsSlinky.speakeasy.speakeasyStrings.hex
  - typingsSlinky.speakeasy.speakeasyStrings.base32
  - typingsSlinky.speakeasy.speakeasyStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typingsSlinky.speakeasy.speakeasyStrings.ascii = this.cast("ascii")
  @scala.inline
  def base32: typingsSlinky.speakeasy.speakeasyStrings.base32 = this.cast("base32")
  @scala.inline
  def base64: typingsSlinky.speakeasy.speakeasyStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typingsSlinky.speakeasy.speakeasyStrings.hex = this.cast("hex")
}

