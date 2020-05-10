package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelEventInit extends MouseEventInit {
  var deltaMode: js.UndefOr[Double] = js.native
  var deltaX: js.UndefOr[Double] = js.native
  var deltaY: js.UndefOr[Double] = js.native
  var deltaZ: js.UndefOr[Double] = js.native
}

object WheelEventInit {
  @scala.inline
  def apply(): WheelEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WheelEventInit]
  }
  @scala.inline
  implicit class WheelEventInitOps[Self <: WheelEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaZ")(js.undefined)
        ret
    }
  }
  
}

