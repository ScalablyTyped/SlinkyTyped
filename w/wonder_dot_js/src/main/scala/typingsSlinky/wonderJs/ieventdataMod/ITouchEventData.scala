package typingsSlinky.wonderJs.ieventdataMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchEventData extends IEventData {
  var changedTouches: js.Array[ITouchData] = js.native
  var currentTarget: HTMLElement | Null = js.native
  var target: HTMLElement = js.native
  var targetTouches: js.Array[ITouchData] = js.native
  var touches: js.Array[ITouchData] = js.native
}

object ITouchEventData {
  @scala.inline
  def apply(
    changedTouches: js.Array[ITouchData],
    preventDefault: () => Unit,
    returnValue: Boolean,
    target: HTMLElement,
    targetTouches: js.Array[ITouchData],
    touches: js.Array[ITouchData]
  ): ITouchEventData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchEventData]
  }
  @scala.inline
  implicit class ITouchEventDataOps[Self <: ITouchEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedTouches(value: js.Array[ITouchData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetTouches(value: js.Array[ITouchData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouches(value: js.Array[ITouchData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(null)
        ret
    }
  }
  
}

