package typingsSlinky.xstate

import typingsSlinky.xstate.libTypesMod.Event
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.SendAction
import typingsSlinky.xstate.libTypesMod.SendActionOptions
import typingsSlinky.xstate.libTypesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_EventOptionsAny extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[_]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: Event[_], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

