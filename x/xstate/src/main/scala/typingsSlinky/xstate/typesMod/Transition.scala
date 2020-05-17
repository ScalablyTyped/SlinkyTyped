package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.ConditionalTransitionConfig[TContext, TEvent]
*/
trait Transition[TContext, TEvent /* <: EventObject */] extends js.Object

object Transition {
  @scala.inline
  implicit def apply[TContext, TEvent](value: ConditionalTransitionConfig[TContext, TEvent]): Transition[TContext, TEvent] = value.asInstanceOf[Transition[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: String): Transition[TContext, TEvent] = value.asInstanceOf[Transition[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: TransitionConfig[TContext, TEvent]): Transition[TContext, TEvent] = value.asInstanceOf[Transition[TContext, TEvent]]
}

