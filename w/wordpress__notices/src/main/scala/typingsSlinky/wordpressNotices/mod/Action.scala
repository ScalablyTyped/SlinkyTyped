package typingsSlinky.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressNotices.mod.URLAction
  - typingsSlinky.wordpressNotices.mod.CallbackAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  implicit def apply(value: CallbackAction): Action = value.asInstanceOf[Action]
  @scala.inline
  implicit def apply(value: URLAction): Action = value.asInstanceOf[Action]
}

