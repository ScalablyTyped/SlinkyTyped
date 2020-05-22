package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.ActionTypes.NullEvent
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.Guard
import typingsSlinky.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var cond: js.UndefOr[Guard[TContext, TEvent]] = js.undefined
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk
  var source: String
  var target: js.UndefOr[js.Array[String]] = js.undefined
}

object Actions {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | NullEvent | Asterisk,
    source: String,
    cond: Guard[TContext, TEvent] = null,
    target: js.Array[String] = null
  ): Actions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions[TContext, TEvent]]
  }
}

