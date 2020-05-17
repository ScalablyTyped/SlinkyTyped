package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.anon.Data[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]
*/
trait InvokeConfig[TContext, TEvent /* <: EventObject */] extends js.Object

object InvokeConfig {
  @scala.inline
  implicit def apply[TContext, TEvent](value: Data[TContext, TEvent]): InvokeConfig[TContext, TEvent] = value.asInstanceOf[InvokeConfig[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: StateMachine[js.Any, js.Any, js.Any, js.Any]): InvokeConfig[TContext, TEvent] = value.asInstanceOf[InvokeConfig[TContext, TEvent]]
}

