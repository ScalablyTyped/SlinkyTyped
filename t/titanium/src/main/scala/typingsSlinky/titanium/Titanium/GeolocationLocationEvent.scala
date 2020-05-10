package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.LocationCoordinates
import typingsSlinky.titanium.LocationProviderDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when a location update is received.
	 */
@js.native
trait GeolocationLocationEvent extends GeolocationBaseEvent {
  /**
  		 * if `success` is false, the error code if available.
  		 */
  var code: Double = js.native
  /**
  		 * If `success` is true, actual location data for this update.
  		 */
  var coords: LocationCoordinates = js.native
  /**
  		 * If `success` is false, a string describing the error.
  		 */
  var error: String = js.native
  /**
  		 * If `success` is true, object describing the location provider generating this update.
  		 */
  var provider: LocationProviderDict = js.native
  /**
  		 * Indicates if location data was successfully retrieved.
  		 */
  var success: Boolean = js.native
}

object GeolocationLocationEvent {
  @scala.inline
  def apply(
    code: Double,
    coords: LocationCoordinates,
    error: String,
    provider: LocationProviderDict,
    source: Geolocation,
    success: Boolean
  ): GeolocationLocationEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationLocationEvent]
  }
  @scala.inline
  implicit class GeolocationLocationEventOps[Self <: GeolocationLocationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoords(value: LocationCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: LocationProviderDict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

