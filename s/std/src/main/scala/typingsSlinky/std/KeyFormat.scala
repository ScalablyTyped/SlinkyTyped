package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.jwk
  - typingsSlinky.std.stdStrings.pkcs8
  - typingsSlinky.std.stdStrings.raw
  - typingsSlinky.std.stdStrings.spki
*/
trait KeyFormat extends js.Object

object KeyFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jwk: typingsSlinky.std.stdStrings.jwk = this.cast("jwk")
  @scala.inline
  def pkcs8: typingsSlinky.std.stdStrings.pkcs8 = this.cast("pkcs8")
  @scala.inline
  def raw: typingsSlinky.std.stdStrings.raw = this.cast("raw")
  @scala.inline
  def spki: typingsSlinky.std.stdStrings.spki = this.cast("spki")
}

