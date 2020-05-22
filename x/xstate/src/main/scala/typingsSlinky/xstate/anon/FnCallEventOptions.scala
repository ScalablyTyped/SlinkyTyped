package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionOptions
import typingsSlinky.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallEventOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: typingsSlinky.xstate.typesMod.Event[TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](
    event: typingsSlinky.xstate.typesMod.Event[TSentEvent],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */](event: SendExpr[TContext, TEvent, TSentEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent, TSentEvent] = js.native
}

