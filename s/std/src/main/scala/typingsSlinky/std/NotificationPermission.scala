package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.default
  - typingsSlinky.std.stdStrings.denied
  - typingsSlinky.std.stdStrings.granted
*/
trait NotificationPermission extends js.Object

object NotificationPermission {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsSlinky.std.stdStrings.default = this.cast("default")
  @scala.inline
  def denied: typingsSlinky.std.stdStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.std.stdStrings.granted = this.cast("granted")
}

