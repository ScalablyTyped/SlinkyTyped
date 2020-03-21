package typingsSlinky.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressNotices.wordpressNoticesStrings.error
  - typingsSlinky.wordpressNotices.wordpressNoticesStrings.info
  - typingsSlinky.wordpressNotices.wordpressNoticesStrings.success
  - typingsSlinky.wordpressNotices.wordpressNoticesStrings.warning
*/
trait Status extends js.Object

object Status {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.wordpressNotices.wordpressNoticesStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.wordpressNotices.wordpressNoticesStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.wordpressNotices.wordpressNoticesStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.wordpressNotices.wordpressNoticesStrings.warning = this.cast("warning")
}

