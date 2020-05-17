package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides extended properties for a PointerPoint object. */
@js.native
trait PointerPointProperties extends js.Object {
  /** Gets the bounding rectangle of the contact area (typically from touch input). */
  var contactRect: Rect = js.native
  /** Gets the bounding rectangle of the raw input (typically from touch input). */
  var contactRectRaw: Rect = js.native
  /** Gets a value that indicates whether the barrel button of the pen/stylus device is pressed. */
  var isBarrelButtonPressed: Boolean = js.native
  /** Gets a value that indicates whether the input was canceled by the pointer device. */
  var isCanceled: Boolean = js.native
  /** Gets a value that indicates whether the input is from a digitizer eraser. */
  var isEraser: Boolean = js.native
  /** Gets a value that indicates whether the input is from a mouse tilt wheel. */
  var isHorizontalMouseWheel: Boolean = js.native
  /** Gets a value that indicates whether the pointer device is within detection range of a sensor or digitizer. */
  var isInRange: Boolean = js.native
  /** Gets a value that indicates whether the digitizer pen is inverted. */
  var isInverted: Boolean = js.native
  /** Gets a value that indicates whether the input is from the left button of a mouse or other input method. */
  var isLeftButtonPressed: Boolean = js.native
  /** Gets a value that indicates whether the input is from the middle button of a mouse or other input method. */
  var isMiddleButtonPressed: Boolean = js.native
  /** Gets a value that indicates whether the input is from the primary pointer when multiple pointers are registered. */
  var isPrimary: Boolean = js.native
  /** Gets a value that indicates whether the input is from the right button of a mouse or other input method. */
  var isRightButtonPressed: Boolean = js.native
  /** Gets the pressed state of the first extended mouse button. */
  var isXButton1Pressed: Boolean = js.native
  /** Gets the pressed state of the second extended mouse button. */
  var isXButton2Pressed: Boolean = js.native
  /** Gets a value (the raw value reported by the device) that indicates the change in wheel button input from the last pointer event. */
  var mouseWheelDelta: Double = js.native
  /** Gets the counter-clockwise angle of rotation around the major axis of the pointer device (the z-axis, perpendicular to the surface of the digitizer). A value of 0.0 degrees indicates the device is oriented towards the top of the digitizer. */
  var orientation: Double = js.native
  /** Gets the kind of pointer state change. */
  var pointerUpdateKind: PointerUpdateKind = js.native
  /** Gets a value that indicates the force that the pointer device (typically a pen/stylus) exerts on the surface of the digitizer. */
  var pressure: Double = js.native
  /** Gets a value that indicates whether the pointer device rejected the touch contact. */
  var touchConfidence: Boolean = js.native
  /** Gets the clockwise rotation in degrees of a pen device around its own major axis (such as when the user spins the pen in their fingers). */
  var twist: Double = js.native
  /** Gets the plane angle between the Y-Z plane and the plane that contains the Y axis and the axis of the input device (typically a pen/stylus). */
  var xtilt: Double = js.native
  /** Gets the plane angle between the X-Z plane and the plane that contains the X axis and the axis of the input device (typically a pen/stylus). */
  var ytilt: Double = js.native
  var zdistance: js.Any = js.native
  /**
    * Gets the Human Interface Device (HID) usage value of the raw input.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return The extended usage of the raw input pointer.
    */
  def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
  /**
    * Gets a value that indicates whether the input data from the pointer device contains the specified Human Interface Device (HID) usage information.
    * @param usagePage The HID usage page of the pointer device.
    * @param usageId Indicates a usage in a usage page.
    * @return True if the input data includes usage information; otherwise false.
    */
  def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
}

object PointerPointProperties {
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
    xtilt: Double,
    ytilt: Double,
    zdistance: js.Any
  ): PointerPointProperties = {
    val __obj = js.Dynamic.literal(contactRect = contactRect.asInstanceOf[js.Any], contactRectRaw = contactRectRaw.asInstanceOf[js.Any], getUsageValue = js.Any.fromFunction2(getUsageValue), hasUsage = js.Any.fromFunction2(hasUsage), isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalMouseWheel = isHorizontalMouseWheel.asInstanceOf[js.Any], isInRange = isInRange.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], isLeftButtonPressed = isLeftButtonPressed.asInstanceOf[js.Any], isMiddleButtonPressed = isMiddleButtonPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isRightButtonPressed = isRightButtonPressed.asInstanceOf[js.Any], isXButton1Pressed = isXButton1Pressed.asInstanceOf[js.Any], isXButton2Pressed = isXButton2Pressed.asInstanceOf[js.Any], mouseWheelDelta = mouseWheelDelta.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pointerUpdateKind = pointerUpdateKind.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], touchConfidence = touchConfidence.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any], xtilt = xtilt.asInstanceOf[js.Any], ytilt = ytilt.asInstanceOf[js.Any], zdistance = zdistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPointProperties]
  }
  @scala.inline
  implicit class PointerPointPropertiesOps[Self <: PointerPointProperties] (val x: Self) extends AnyVal {
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
    def withXtilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xtilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYtilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ytilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZdistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zdistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

