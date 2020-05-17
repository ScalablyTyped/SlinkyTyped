package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */, TEvent /* <: EventObject */] extends js.Object {
  var `type`: TEventType = js.native
}

object `0` {
  @scala.inline
  def apply[TEventType, TEvent](`type`: TEventType): `0`[TEventType, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TEventType, TEvent]]
  }
  @scala.inline
  implicit class `0Ops`[Self[teventtype, tevent] <: `0`[teventtype, tevent], TEventType, TEvent] (val x: Self[TEventType, TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEventType, TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEventType, TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEventType, TEvent]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEventType, TEvent]) with Other]
    @scala.inline
    def withType(value: TEventType): Self[TEventType, TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

