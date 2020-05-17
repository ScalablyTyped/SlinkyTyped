package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.ActionType
  - typingsSlinky.xstate.typesMod.ActionObject[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.ActionFunction[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.AssignAction[typingsSlinky.std.Required[TContext], TEvent]
  - typingsSlinky.xstate.typesMod.SendAction[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.RaiseAction[typingsSlinky.xstate.typesMod.AnyEventObject]
*/
trait Action[TContext, TEvent /* <: EventObject */] extends js.Object

object Action {
  @scala.inline
  implicit def apply[TContext, TEvent](value: ActionFunction[TContext, TEvent]): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: ActionObject[TContext, TEvent]): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: ActionType): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: AssignAction[Required[TContext], TEvent]): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: RaiseAction[AnyEventObject]): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: SendAction[TContext, TEvent]): Action[TContext, TEvent] = value.asInstanceOf[Action[TContext, TEvent]]
}

