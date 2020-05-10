package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding compass heading data.
  */
@js.native
trait HeadingData extends js.Object {
  /**
  	 * Accuracy of the compass heading, in platform-specific units.
  	 */
  var accuracy: js.UndefOr[Double] = js.native
  /**
  	 * Declination in degrees from magnetic North.
  	 */
  var magneticHeading: js.UndefOr[Double] = js.native
  /**
  	 * Timestamp for the heading data, in milliseconds.
  	 */
  var timestamp: js.UndefOr[Double] = js.native
  /**
  	 * Declination in degrees from true North.
  	 */
  var trueHeading: js.UndefOr[Double] = js.native
  /**
  	 * Raw geomagnetic data for the X axis.
  	 */
  var x: js.UndefOr[Double] = js.native
  /**
  	 * Raw geomagnetic data for the Y axis.
  	 */
  var y: js.UndefOr[Double] = js.native
  /**
  	 * Raw geomagnetic data for the Z axis.
  	 */
  var z: js.UndefOr[Double] = js.native
}

object HeadingData {
  @scala.inline
  def apply(): HeadingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingData]
  }
  @scala.inline
  implicit class HeadingDataOps[Self <: HeadingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withMagneticHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagneticHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

