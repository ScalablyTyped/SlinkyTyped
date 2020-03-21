package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.mounted
  - typingsSlinky.std.stdStrings.navigation
  - typingsSlinky.std.stdStrings.requested
  - typingsSlinky.std.stdStrings.unmounted
*/
trait VRDisplayEventReason extends js.Object

object VRDisplayEventReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mounted: typingsSlinky.std.stdStrings.mounted = this.cast("mounted")
  @scala.inline
  def navigation: typingsSlinky.std.stdStrings.navigation = this.cast("navigation")
  @scala.inline
  def requested: typingsSlinky.std.stdStrings.requested = this.cast("requested")
  @scala.inline
  def unmounted: typingsSlinky.std.stdStrings.unmounted = this.cast("unmounted")
}

