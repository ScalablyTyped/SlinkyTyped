package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the [getCurrentPosition](Titanium.Geolocation.getCurrentPosition) callback.
  */
@js.native
trait LocationResults extends ErrorResponse {
  /**
  	 * If `success` is true, actual location data for this update.
  	 */
  var coords: js.UndefOr[LocationCoordinates] = js.native
  /**
  	 * If `success` is true, object describing the location provider generating this update.
  	 */
  var provider: js.UndefOr[LocationProviderDict] = js.native
}

object LocationResults {
  @scala.inline
  def apply(): LocationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationResults]
  }
  @scala.inline
  implicit class LocationResultsOps[Self <: LocationResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: LocationCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: LocationProviderDict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
  }
  
}

