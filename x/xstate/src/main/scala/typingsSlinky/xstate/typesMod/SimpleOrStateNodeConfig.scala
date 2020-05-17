package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.AtomicStateNodeConfig[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.StateNodeConfig[TContext, TStateSchema, TEvent]
*/
trait SimpleOrStateNodeConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object

object SimpleOrStateNodeConfig {
  @scala.inline
  implicit def apply[TContext, TStateSchema, TEvent](value: AtomicStateNodeConfig[TContext, TEvent]): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = value.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
  @scala.inline
  implicit def apply[TContext, TStateSchema, TEvent](value: StateNodeConfig[TContext, TStateSchema, TEvent]): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = value.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
}

