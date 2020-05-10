package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object returned in the callback from the
  * [forwardGeocoder](Titanium.Geolocation.forwardGeocoder) method.
  * Note that Android includes a number of extra fields.
  */
@js.native
trait ForwardGeocodeResponse extends ErrorResponse {
  /**
  	 * Estimated accuracy of the geocoding, in meters.
  	 */
  var accuracy: js.UndefOr[Double] = js.native
  /**
  	 * Full address.
  	 */
  var address: js.UndefOr[java.lang.String] = js.native
  /**
  	 * City name.
  	 */
  var city: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Country name.
  	 */
  var country: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Country code.
  	 */
  var countryCode: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Country code. Same as `countryCode`.
  	 */
  var country_code: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Display address. Identical to `address`.
  	 */
  var displayAddress: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Latitude of the geocoded address.
  	 */
  var latitude: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Longitude of the geocoded address.
  	 */
  var longitude: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Postal code.
  	 */
  var postalCode: js.UndefOr[java.lang.String] = js.native
  /**
  	 * First line of region.
  	 */
  var region1: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Not used.
  	 */
  var region2: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Street name, without street address.
  	 */
  var street: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Street name.
  	 */
  var street1: js.UndefOr[java.lang.String] = js.native
}

object ForwardGeocodeResponse {
  @scala.inline
  def apply(): ForwardGeocodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardGeocodeResponse]
  }
  @scala.inline
  implicit class ForwardGeocodeResponseOps[Self <: ForwardGeocodeResponse] (val x: Self) extends AnyVal {
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
    def withAddress(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_code(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAddress(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: java.lang.String): Self = {
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
    def withLongitude(value: java.lang.String): Self = {
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
    def withPostalCode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion1(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region1")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion2(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region2")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet1(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street1")(js.undefined)
        ret
    }
  }
  
}

