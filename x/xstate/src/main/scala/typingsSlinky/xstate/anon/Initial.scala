package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.StateSchema
import typingsSlinky.xstate.typesMod.StatesConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initial[TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends js.Object {
  var initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = js.native
  var states: StatesConfig[_, TStateSchema, TEvent] = js.native
}

object Initial {
  @scala.inline
  def apply[TStateSchema, TEvent](
    initial: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any,
    states: StatesConfig[_, TStateSchema, TEvent]
  ): Initial[TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial[TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class InitialOps[Self[tstateschema, tevent] <: Initial[tstateschema, tevent], TStateSchema, TEvent] (val x: Self[TStateSchema, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStateSchema, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStateSchema, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TStateSchema, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TStateSchema, TEvent]) with Other]
    @scala.inline
    def withInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self[TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: StatesConfig[_, TStateSchema, TEvent]): Self[TStateSchema, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

