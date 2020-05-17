package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.typesMod.ConditionPredicate[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.Guard[TContext, TEvent]
*/
trait Condition[TContext, TEvent /* <: EventObject */] extends js.Object

object Condition {
  @scala.inline
  implicit def apply[TContext, TEvent](value: ConditionPredicate[TContext, TEvent]): Condition[TContext, TEvent] = value.asInstanceOf[Condition[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: Guard[TContext, TEvent]): Condition[TContext, TEvent] = value.asInstanceOf[Condition[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: String): Condition[TContext, TEvent] = value.asInstanceOf[Condition[TContext, TEvent]]
}

