package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.LogAction
import typingsSlinky.xstate.typesMod.LogExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallExprLabel extends StObject {
  
  def apply[TContext, TEvent /* <: EventObject */](): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: js.UndefOr[scala.Nothing], label: String): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: String): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: String, label: String): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent]): LogAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](expr: LogExpr[TContext, TEvent], label: String): LogAction[TContext, TEvent] = js.native
}
