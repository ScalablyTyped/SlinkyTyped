package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.xstate.typesMod.DelayExpr[TContext, TEvent]
*/
trait DelayConfig[TContext, TEvent /* <: EventObject */] extends js.Object

object DelayConfig {
  @scala.inline
  implicit def apply[TContext, TEvent](value: DelayExpr[TContext, TEvent]): DelayConfig[TContext, TEvent] = value.asInstanceOf[DelayConfig[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: Double): DelayConfig[TContext, TEvent] = value.asInstanceOf[DelayConfig[TContext, TEvent]]
}

