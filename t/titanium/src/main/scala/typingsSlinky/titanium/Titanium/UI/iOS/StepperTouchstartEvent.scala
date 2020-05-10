package typingsSlinky.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired as soon as the device detects a touch gesture.
			 */
@js.native
trait StepperTouchstartEvent extends StepperBaseEvent {
  /**
  				 * A value which indicates the stylus angle on the screen. If the stylus is perpendicular to the screen or no stylus is
  				 * being used, the value will be Pi/2. If the stylus is parallel to the screen, the value will be 0.
  				 * Note: This property is only available for iOS devices that support 3D-Touch and are 9.1 or later.
  				 */
  var altitudeAngle: Double = js.native
  /**
  				 * The x value of the unit vector that points in the direction of the azimuth of the stylus.
  				 * Note: This property is only available for iOS devices that support the Apple Pencil and are 9.1 or later.
  				 */
  var azimuthUnitVectorInViewX: Double = js.native
  /**
  				 * The y value of the unit vector that points in the direction of the azimuth of the stylus.
  				 * Note: This property is only available for iOS devices that support the Apple Pencil and are 9.1 or later.
  				 */
  var azimuthUnitVectorInViewY: Double = js.native
  /**
  				 * The current force value of the touch event.
  				 * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later and on some Android devices.
  				 */
  var force: Double = js.native
  /**
  				 * Maximum possible value of the force property.
  				 * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
  				 */
  var maximumPossibleForce: Double = js.native
  /**
  				 * The current size of the touch area. Note: This property is only available on some Android devices.
  				 */
  var size: Double = js.native
  /**
  				 * The time (in seconds) when the touch was used in correlation with the system start up.
  				 * Note: This property is only available for iOS devices that support 3D-Touch and run 9.0 or later.
  				 */
  var timestamp: Double = js.native
  /**
  				 * X coordinate of the event from the `source` view's coordinate system.
  				 */
  var x: Double = js.native
  /**
  				 * Y coordinate of the event from the `source` view's coordinate system.
  				 */
  var y: Double = js.native
}

object StepperTouchstartEvent {
  @scala.inline
  def apply(
    altitudeAngle: Double,
    azimuthUnitVectorInViewX: Double,
    azimuthUnitVectorInViewY: Double,
    force: Double,
    maximumPossibleForce: Double,
    size: Double,
    source: Stepper,
    timestamp: Double,
    x: Double,
    y: Double
  ): StepperTouchstartEvent = {
    val __obj = js.Dynamic.literal(altitudeAngle = altitudeAngle.asInstanceOf[js.Any], azimuthUnitVectorInViewX = azimuthUnitVectorInViewX.asInstanceOf[js.Any], azimuthUnitVectorInViewY = azimuthUnitVectorInViewY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], maximumPossibleForce = maximumPossibleForce.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperTouchstartEvent]
  }
  @scala.inline
  implicit class StepperTouchstartEventOps[Self <: StepperTouchstartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitudeAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzimuthUnitVectorInViewX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuthUnitVectorInViewX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzimuthUnitVectorInViewY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuthUnitVectorInViewY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumPossibleForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumPossibleForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

