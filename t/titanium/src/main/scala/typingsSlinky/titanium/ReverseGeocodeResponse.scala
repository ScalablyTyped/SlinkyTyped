package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
@js.native
trait ReverseGeocodeResponse extends ErrorResponse {
  /**
  	 * An array of reverse-geocoded addresses matching the requested location.
  	 */
  var places: js.UndefOr[js.Array[GeocodedAddress]] = js.native
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
  @scala.inline
  implicit class ReverseGeocodeResponseOps[Self <: ReverseGeocodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaces(value: js.Array[GeocodedAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(js.undefined)
        ret
    }
  }
  
}

