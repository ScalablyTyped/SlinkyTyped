package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vuex.mod.ActionSubscriber[P, S]
  - typingsSlinky.vuex.mod.ActionSubscribersObject[P, S]
*/
trait SubscribeActionOptions[P, S] extends js.Object

object SubscribeActionOptions {
  @scala.inline
  implicit def apply[P, S](value: ActionSubscriber[P, S]): SubscribeActionOptions[P, S] = value.asInstanceOf[SubscribeActionOptions[P, S]]
  @scala.inline
  implicit def apply[P, S](value: ActionSubscribersObject[P, S]): SubscribeActionOptions[P, S] = value.asInstanceOf[SubscribeActionOptions[P, S]]
}

