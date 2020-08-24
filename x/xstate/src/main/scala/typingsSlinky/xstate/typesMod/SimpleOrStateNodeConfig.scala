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
  def AtomicStateNodeConfig[TContext, /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typingsSlinky.xstate.typesMod.EventObject */ TEvent](): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  def StateNodeConfig[TContext, /* <: typingsSlinky.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typingsSlinky.xstate.typesMod.EventObject */ TEvent](): SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleOrStateNodeConfig[TContext, TStateSchema, TEvent]]
  }
}

