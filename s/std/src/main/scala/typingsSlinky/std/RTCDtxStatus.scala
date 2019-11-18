package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.disabled
  - typings.std.stdStrings.enabled
*/
trait RTCDtxStatus extends js.Object

object RTCDtxStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.std.stdStrings.disabled = this.cast("disabled")
  @scala.inline
  def enabled: typingsSlinky.std.stdStrings.enabled = this.cast("enabled")
}

