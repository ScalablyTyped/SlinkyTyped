package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties associated with the button wheel of a mouse device. */
@js.native
trait MouseWheelParameters extends js.Object {
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  var charTranslation: Point = js.native
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  var deltaRotationAngle: Double = js.native
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  var deltaScale: Double = js.native
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  var pageTranslation: Point = js.native
}

object MouseWheelParameters {
  @scala.inline
  def apply(charTranslation: Point, deltaRotationAngle: Double, deltaScale: Double, pageTranslation: Point): MouseWheelParameters = {
    val __obj = js.Dynamic.literal(charTranslation = charTranslation.asInstanceOf[js.Any], deltaRotationAngle = deltaRotationAngle.asInstanceOf[js.Any], deltaScale = deltaScale.asInstanceOf[js.Any], pageTranslation = pageTranslation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseWheelParameters]
  }
  @scala.inline
  implicit class MouseWheelParametersOps[Self <: MouseWheelParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharTranslation(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaRotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTranslation(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTranslation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

