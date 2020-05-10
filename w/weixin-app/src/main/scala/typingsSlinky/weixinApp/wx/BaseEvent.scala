package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEvent[T /* <: String */, Detail] extends js.Object {
  var currentTarget: EventTarget = js.native
  var detail: Detail = js.native
  var target: EventTarget = js.native
  var timeStamp: Double = js.native
  var `type`: T = js.native
}

object BaseEvent {
  @scala.inline
  def apply[T, Detail](currentTarget: EventTarget, detail: Detail, target: EventTarget, timeStamp: Double, `type`: T): BaseEvent[T, Detail] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[T, Detail]]
  }
  @scala.inline
  implicit class BaseEventOps[Self[t, detail] <: BaseEvent[t, detail], T, Detail] (val x: Self[T, Detail]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Detail] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Detail]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Detail]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Detail]) with Other]
    @scala.inline
    def withCurrentTarget(value: EventTarget): Self[T, Detail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: Detail): Self[T, Detail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: EventTarget): Self[T, Detail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: Double): Self[T, Detail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, Detail] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

