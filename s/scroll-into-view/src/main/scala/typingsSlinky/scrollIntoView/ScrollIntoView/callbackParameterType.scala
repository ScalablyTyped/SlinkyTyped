package typingsSlinky.scrollIntoView.ScrollIntoView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** type will be 'complete' if the scroll completed or 'canceled' if the current scroll was canceled by a new scroll */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.scrollIntoView.scrollIntoViewStrings.complete
  - typingsSlinky.scrollIntoView.scrollIntoViewStrings.canceled
*/
trait callbackParameterType extends js.Object

object callbackParameterType {
  @scala.inline
  def canceled: typingsSlinky.scrollIntoView.scrollIntoViewStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.scrollIntoView.scrollIntoViewStrings.complete = this.cast("complete")
}

