package typingsSlinky.xstate

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.ExprWithMeta
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallErrorDataOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: TErrorData, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](errorData: ExprWithMeta[TContext, TEvent, TErrorData]): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */, TErrorData](
    errorData: ExprWithMeta[TContext, TEvent, TErrorData],
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
}

