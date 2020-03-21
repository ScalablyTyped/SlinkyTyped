package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.decrypt
  - typingsSlinky.std.stdStrings.deriveBits
  - typingsSlinky.std.stdStrings.deriveKey
  - typingsSlinky.std.stdStrings.encrypt
  - typingsSlinky.std.stdStrings.sign
  - typingsSlinky.std.stdStrings.unwrapKey
  - typingsSlinky.std.stdStrings.verify
  - typingsSlinky.std.stdStrings.wrapKey
*/
trait KeyUsage extends js.Object

object KeyUsage {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typingsSlinky.std.stdStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveBits: typingsSlinky.std.stdStrings.deriveBits = this.cast("deriveBits")
  @scala.inline
  def deriveKey: typingsSlinky.std.stdStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typingsSlinky.std.stdStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typingsSlinky.std.stdStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typingsSlinky.std.stdStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typingsSlinky.std.stdStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typingsSlinky.std.stdStrings.wrapKey = this.cast("wrapKey")
}

