package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a location update.
  */
@js.native
trait LocationCoordinates extends js.Object {
  /**
  	 * Accuracy of the location update, in meters.
  	 */
  var accuracy: js.UndefOr[Double] = js.native
  /**
  	 * Altitude of the location update, in meters.
  	 */
  var altitude: js.UndefOr[Double] = js.native
  /**
  	 * Vertical accuracy of the location update, in meters.
  	 */
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  /**
  	 * The floor of the building on which the user is located.
  	 */
  var floor: js.UndefOr[LocationCoordinatesFloor] = js.native
  /**
  	 * Compass heading, in degrees. May be unknown if device is not moving. On
  	 * iOS, a negative value indicates that the heading data is not valid.
  	 */
  var heading: js.UndefOr[Double] = js.native
  /**
  	 * Latitude of the location update, in decimal degrees.
  	 */
  var latitude: js.UndefOr[Double] = js.native
  /**
  	 * Longitude of the location update, in decimal degrees.
  	 */
  var longitude: js.UndefOr[Double] = js.native
  /**
  	 * Current speed in meters/second. On iOS, a negative value indicates that the
  	 * heading data is not valid or the accuracy is configured incorrectly.
  	 * Note: Due to the Apple Geolocation API, set the <Titanium.Geolocation.accuracy>
  	 * property to <Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION> in order to properly
  	 * measure speed changes and prevent the app from returning negative values.
  	 */
  var speed: js.UndefOr[Double] = js.native
  /**
  	 * Timestamp for this location update, in milliseconds.
  	 */
  var timestamp: js.UndefOr[Double] = js.native
}

object LocationCoordinates {
  @scala.inline
  def apply(): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationCoordinates]
  }
  @scala.inline
  implicit class LocationCoordinatesOps[Self <: LocationCoordinates] (val x: Self) extends AnyVal {
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
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withAltitudeAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitudeAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withFloor(value: LocationCoordinatesFloor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
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
  }
  
}

