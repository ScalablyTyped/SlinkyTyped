package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vuex.mod.ActionHandler[S, R]
  - typingsSlinky.vuex.mod.ActionObject[S, R]
*/
trait Action[S, R] extends js.Object

object Action {
  @scala.inline
  implicit def apply[S, R](value: ActionHandler[S, R]): Action[S, R] = value.asInstanceOf[Action[S, R]]
  @scala.inline
  implicit def apply[S, R](value: ActionObject[S, R]): Action[S, R] = value.asInstanceOf[Action[S, R]]
}

