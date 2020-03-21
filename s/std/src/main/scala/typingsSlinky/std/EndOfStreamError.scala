package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.decode
  - typingsSlinky.std.stdStrings.network
*/
trait EndOfStreamError extends js.Object

object EndOfStreamError {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decode: typingsSlinky.std.stdStrings.decode = this.cast("decode")
  @scala.inline
  def network: typingsSlinky.std.stdStrings.network = this.cast("network")
}

