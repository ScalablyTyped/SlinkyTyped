package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.follow
  - typings.std.stdStrings.error
  - typings.std.stdStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.std.stdStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsSlinky.std.stdStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsSlinky.std.stdStrings.manual = this.cast("manual")
}

