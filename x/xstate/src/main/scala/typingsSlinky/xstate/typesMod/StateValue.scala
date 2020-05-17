package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.typesMod.StateValueMap
*/
trait StateValue extends js.Object

object StateValue {
  @scala.inline
  implicit def apply(value: StateValueMap): StateValue = value.asInstanceOf[StateValue]
  @scala.inline
  implicit def apply(value: String): StateValue = value.asInstanceOf[StateValue]
}

