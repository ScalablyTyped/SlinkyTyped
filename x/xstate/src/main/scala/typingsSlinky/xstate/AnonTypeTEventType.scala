package typingsSlinky.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeTEventType[TEventType /* <: String */] extends js.Object {
  var `type`: TEventType = js.native
}

object AnonTypeTEventType {
  @scala.inline
  def apply[TEventType](`type`: TEventType): AnonTypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeTEventType[TEventType]]
  }
  @scala.inline
  implicit class AnonTypeTEventTypeOps[Self[teventtype] <: AnonTypeTEventType[teventtype], TEventType] (val x: Self[TEventType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEventType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEventType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEventType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEventType] with Other]
    @scala.inline
    def withType(value: TEventType): Self[TEventType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

