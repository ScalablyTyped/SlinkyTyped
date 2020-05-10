package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object representing a place, returned in the callback from the
  * [reverseGeocoder](Titanium.Geolocation.reverseGeocoder) method.
  */
@js.native
trait GeocodedAddress extends js.Object {
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
  	 * Latitude of the geocoded point.
  	 */
  var latitude: js.UndefOr[Double] = js.native
  /**
  	 * Longitude of the geocoded point.
  	 */
  var longitude: js.UndefOr[Double] = js.native
  /**
  	 * Postal code
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

object GeocodedAddress {
  @scala.inline
  def apply(): GeocodedAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodedAddress]
  }
  @scala.inline
  implicit class GeocodedAddressOps[Self <: GeocodedAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

