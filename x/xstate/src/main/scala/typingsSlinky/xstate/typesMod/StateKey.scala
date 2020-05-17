package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.stateMod.State[js.Any, typingsSlinky.xstate.typesMod.EventObject, js.Any, js.Any]
*/
trait StateKey extends js.Object

object StateKey {
  @scala.inline
  implicit def apply(value: State[js.Any, EventObject, js.Any, js.Any]): StateKey = value.asInstanceOf[StateKey]
  @scala.inline
  implicit def apply(value: String): StateKey = value.asInstanceOf[StateKey]
}

