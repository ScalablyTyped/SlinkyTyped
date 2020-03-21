package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.expired
  - typingsSlinky.std.stdStrings.`internal-error`
  - typingsSlinky.std.stdStrings.`output-downscaled`
  - typingsSlinky.std.stdStrings.`output-restricted`
  - typingsSlinky.std.stdStrings.released
  - typingsSlinky.std.stdStrings.`status-pending`
  - typingsSlinky.std.stdStrings.usable
*/
trait MediaKeyStatus extends js.Object

object MediaKeyStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typingsSlinky.std.stdStrings.expired = this.cast("expired")
  @scala.inline
  def `internal-error`: typingsSlinky.std.stdStrings.`internal-error` = this.cast("internal-error")
  @scala.inline
  def `output-downscaled`: typingsSlinky.std.stdStrings.`output-downscaled` = this.cast("output-downscaled")
  @scala.inline
  def `output-restricted`: typingsSlinky.std.stdStrings.`output-restricted` = this.cast("output-restricted")
  @scala.inline
  def released: typingsSlinky.std.stdStrings.released = this.cast("released")
  @scala.inline
  def `status-pending`: typingsSlinky.std.stdStrings.`status-pending` = this.cast("status-pending")
  @scala.inline
  def usable: typingsSlinky.std.stdStrings.usable = this.cast("usable")
}

