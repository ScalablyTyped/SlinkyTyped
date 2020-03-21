package typingsSlinky.xstate

import typingsSlinky.xstate.typesMod.Event
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionOptions
import typingsSlinky.xstate.typesMod.SendExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallEventOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](event: SendExpr[TContext, TEvent], options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

