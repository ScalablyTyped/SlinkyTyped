package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchInit extends js.Object {
  var altitudeAngle: js.UndefOr[Double] = js.native
  var azimuthAngle: js.UndefOr[Double] = js.native
  var clientX: js.UndefOr[Double] = js.native
  var clientY: js.UndefOr[Double] = js.native
  var force: js.UndefOr[Double] = js.native
  var identifier: Double = js.native
  var pageX: js.UndefOr[Double] = js.native
  var pageY: js.UndefOr[Double] = js.native
  var radiusX: js.UndefOr[Double] = js.native
  var radiusY: js.UndefOr[Double] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var screenX: js.UndefOr[Double] = js.native
  var screenY: js.UndefOr[Double] = js.native
  var target: org.scalajs.dom.raw.EventTarget = js.native
  var touchType: js.UndefOr[TouchType] = js.native
}

object TouchInit {
  @scala.inline
  def apply(identifier: Double, target: org.scalajs.dom.raw.EventTarget): TouchInit = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchInit]
  }
  @scala.inline
  implicit class TouchInitOps[Self <: TouchInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: org.scalajs.dom.raw.EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltitudeAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitudeAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withAzimuthAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuthAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzimuthAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuthAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withClientX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientX")(js.undefined)
        ret
    }
    @scala.inline
    def withClientY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientY")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(js.undefined)
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusX")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusY")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenX")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenY")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchType(value: TouchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchType")(js.undefined)
        ret
    }
  }
  
}

