package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventInit extends MouseEventInit {
  var height: js.UndefOr[Double] = js.native
  var isPrimary: js.UndefOr[scala.Boolean] = js.native
  var pointerId: js.UndefOr[Double] = js.native
  var pointerType: js.UndefOr[java.lang.String] = js.native
  var pressure: js.UndefOr[Double] = js.native
  var tangentialPressure: js.UndefOr[Double] = js.native
  var tiltX: js.UndefOr[Double] = js.native
  var tiltY: js.UndefOr[Double] = js.native
  var twist: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PointerEventInit {
  @scala.inline
  def apply(): PointerEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventInit]
  }
  @scala.inline
  implicit class PointerEventInitOps[Self <: org.scalajs.dom.raw.PointerEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrimary(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(js.undefined)
        ret
    }
    @scala.inline
    def withPressure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(js.undefined)
        ret
    }
    @scala.inline
    def withTangentialPressure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentialPressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTangentialPressure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangentialPressure")(js.undefined)
        ret
    }
    @scala.inline
    def withTiltX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiltX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltX")(js.undefined)
        ret
    }
    @scala.inline
    def withTiltY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiltY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltY")(js.undefined)
        ret
    }
    @scala.inline
    def withTwist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twist")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

