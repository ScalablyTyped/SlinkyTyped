package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Action[TContext, TEvent /* <: EventObject */] extends js.Object

object _Action {
  @scala.inline
  def ActionObject[TContext, TEvent](`type`: String): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
  @scala.inline
  def SendAction[TContext, TEvent](event: TEvent | (SendExpr[TContext, TEvent]), id: String | Double, `type`: String): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
}

