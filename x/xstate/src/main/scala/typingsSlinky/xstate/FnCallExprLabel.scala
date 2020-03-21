package typingsSlinky.xstate

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.LogAction
import typingsSlinky.xstate.typesMod.LogExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallExprLabel extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
}

