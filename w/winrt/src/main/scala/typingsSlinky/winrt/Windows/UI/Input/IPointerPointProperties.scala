package typingsSlinky.winrt.Windows.UI.Input

import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointerPointProperties extends js.Object {
  var contactRect: Rect = js.native
  var contactRectRaw: Rect = js.native
  var isBarrelButtonPressed: Boolean = js.native
  var isCanceled: Boolean = js.native
  var isEraser: Boolean = js.native
  var isHorizontalMouseWheel: Boolean = js.native
  var isInRange: Boolean = js.native
  var isInverted: Boolean = js.native
  var isLeftButtonPressed: Boolean = js.native
  var isMiddleButtonPressed: Boolean = js.native
  var isPrimary: Boolean = js.native
  var isRightButtonPressed: Boolean = js.native
  var isXButton1Pressed: Boolean = js.native
  var isXButton2Pressed: Boolean = js.native
  var mouseWheelDelta: Double = js.native
  var orientation: Double = js.native
  var pointerUpdateKind: PointerUpdateKind = js.native
  var pressure: Double = js.native
  var touchConfidence: Boolean = js.native
  var twist: Double = js.native
  var xTilt: Double = js.native
  var yTilt: Double = js.native
  def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
  def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
}

object IPointerPointProperties {
  @scala.inline
  def apply(
    contactRect: Rect,
    contactRectRaw: Rect,
    getUsageValue: (Double, Double) => Double,
    hasUsage: (Double, Double) => Boolean,
    isBarrelButtonPressed: Boolean,
    isCanceled: Boolean,
    isEraser: Boolean,
    isHorizontalMouseWheel: Boolean,
    isInRange: Boolean,
    isInverted: Boolean,
    isLeftButtonPressed: Boolean,
    isMiddleButtonPressed: Boolean,
    isPrimary: Boolean,
    isRightButtonPressed: Boolean,
    isXButton1Pressed: Boolean,
    isXButton2Pressed: Boolean,
    mouseWheelDelta: Double,
    orientation: Double,
    pointerUpdateKind: PointerUpdateKind,
    pressure: Double,
    touchConfidence: Boolean,
    twist: Double,
    xTilt: Double,
    yTilt: Double
  ): IPointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect.asInstanceOf[js.Any], contactRectRaw = contactRectRaw.asInstanceOf[js.Any], getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalMouseWheel = isHorizontalMouseWheel.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], isLeftButtonPressed = isLeftButtonPressed.asInstanceOf[js.Any], isMiddleButtonPressed = isMiddleButtonPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isRightButtonPressed = isRightButtonPressed.asInstanceOf[js.Any], isXButton1Pressed = isXButton1Pressed.asInstanceOf[js.Any], isXButton2Pressed = isXButton2Pressed.asInstanceOf[js.Any], mouseWheelDelta = mouseWheelDelta.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointerUpdateKind = pointerUpdateKind.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], touchConfidence = touchConfidence.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], xTilt = xTilt.asInstanceOf[js.Any], yTilt = yTilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerPointProperties]
  }
  @scala.inline
  implicit class IPointerPointPropertiesOps[Self <: IPointerPointProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactRectRaw(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactRectRaw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUsageValue(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsageValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasUsage(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasUsage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsBarrelButtonPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBarrelButtonPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEraser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEraser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHorizontalMouseWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHorizontalMouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLeftButtonPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeftButtonPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMiddleButtonPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMiddleButtonPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRightButtonPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRightButtonPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsXButton1Pressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXButton1Pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsXButton2Pressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isXButton2Pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseWheelDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerUpdateKind(value: PointerUpdateKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerUpdateKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchConfidence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xTilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yTilt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

