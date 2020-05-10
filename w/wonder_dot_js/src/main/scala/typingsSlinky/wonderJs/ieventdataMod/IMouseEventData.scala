package typingsSlinky.wonderJs.ieventdataMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseEventData extends IEventData {
  var button: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var currentTarget: HTMLElement = js.native
  var detail: js.UndefOr[Double] = js.native
  var movementX: js.UndefOr[Double] = js.native
  var movementY: js.UndefOr[Double] = js.native
  var mozMovementX: js.UndefOr[Double] = js.native
  var mozMovementY: js.UndefOr[Double] = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var target: HTMLElement = js.native
  var webkitMovementX: js.UndefOr[Double] = js.native
  var webkitMovementY: js.UndefOr[Double] = js.native
  var wheelDelta: js.UndefOr[Double] = js.native
}

object IMouseEventData {
  @scala.inline
  def apply(
    button: Double,
    clientX: Double,
    clientY: Double,
    currentTarget: HTMLElement,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    returnValue: Boolean,
    target: HTMLElement
  ): IMouseEventData = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventData]
  }
  @scala.inline
  implicit class IMouseEventDataOps[Self <: IMouseEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovementX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementX")(js.undefined)
        ret
    }
    @scala.inline
    def withMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMovementY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movementY")(js.undefined)
        ret
    }
    @scala.inline
    def withMozMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozMovementX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementX")(js.undefined)
        ret
    }
    @scala.inline
    def withMozMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMozMovementY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozMovementY")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitMovementX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitMovementX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementX")(js.undefined)
        ret
    }
    @scala.inline
    def withWebkitMovementY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebkitMovementY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitMovementY")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelDelta")(js.undefined)
        ret
    }
  }
  
}

