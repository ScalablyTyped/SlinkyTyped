package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.typesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaiseAction[TEvent /* <: EventObject */]
  extends Action[js.Any, js.Any] {
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
  var `type`: Raise = js.native
}

object RaiseAction {
  @scala.inline
  def apply[TEvent](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any,
    `type`: Raise
  ): RaiseAction[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseAction[TEvent]]
  }
  @scala.inline
  implicit class RaiseActionOps[Self[tevent] <: RaiseAction[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Raise): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

