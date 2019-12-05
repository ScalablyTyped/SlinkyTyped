package typingsSlinky.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.toastr.toastrStrings.error
  - typings.toastr.toastrStrings.info
  - typings.toastr.toastrStrings.success
  - typings.toastr.toastrStrings.warning
*/
trait ToastrType extends js.Object

object ToastrType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.toastr.toastrStrings.error = this.cast("error")
  @scala.inline
  def info: typingsSlinky.toastr.toastrStrings.info = this.cast("info")
  @scala.inline
  def success: typingsSlinky.toastr.toastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typingsSlinky.toastr.toastrStrings.warning = this.cast("warning")
}

