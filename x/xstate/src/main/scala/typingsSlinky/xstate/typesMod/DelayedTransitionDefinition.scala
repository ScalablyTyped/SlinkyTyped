package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  var delay: Double | String | (DelayExpr[TContext, TEvent]) = js.native
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (DelayExpr[TContext, TEvent]),
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typingsSlinky.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, _]
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
  @scala.inline
  implicit class DelayedTransitionDefinitionOps[Self[tcontext, tevent] <: DelayedTransitionDefinition[tcontext, tevent], TContext, TEvent] (val x: Self[TContext, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TContext, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TContext, TEvent]) with Other]
    @scala.inline
    def withDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self[TContext, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

