package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.Context
import typingsSlinky.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuardMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var cond: Guard[TContext, TEvent]
}

object GuardMeta {
  @scala.inline
  def apply[TContext, TEvent](
    _event: typingsSlinky.xstate.typesMod.SCXML.Event[TEvent],
    cond: Guard[TContext, TEvent],
    state: State[TContext, TEvent, _, Context[TContext]]
  ): GuardMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardMeta[TContext, TEvent]]
  }
}

