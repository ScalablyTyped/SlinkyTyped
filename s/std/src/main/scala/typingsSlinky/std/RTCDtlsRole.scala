package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.auto
  - typingsSlinky.std.stdStrings.client
  - typingsSlinky.std.stdStrings.server
*/
trait RTCDtlsRole extends js.Object

object RTCDtlsRole {
  @scala.inline
  def auto: typingsSlinky.std.stdStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client: typingsSlinky.std.stdStrings.client = this.cast("client")
  @scala.inline
  def server: typingsSlinky.std.stdStrings.server = this.cast("server")
}

