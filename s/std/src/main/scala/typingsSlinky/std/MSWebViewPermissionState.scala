package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.unknown
  - typings.std.stdStrings.defer
  - typings.std.stdStrings.allow
  - typings.std.stdStrings.deny
*/
trait MSWebViewPermissionState extends js.Object

object MSWebViewPermissionState {
  @scala.inline
  def allow: typingsSlinky.std.stdStrings.allow = this.cast("allow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def defer: typingsSlinky.std.stdStrings.defer = this.cast("defer")
  @scala.inline
  def deny: typingsSlinky.std.stdStrings.deny = this.cast("deny")
  @scala.inline
  def unknown: typingsSlinky.std.stdStrings.unknown = this.cast("unknown")
}

