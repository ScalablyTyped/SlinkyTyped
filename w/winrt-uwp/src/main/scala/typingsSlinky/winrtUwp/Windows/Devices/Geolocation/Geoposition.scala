package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location that may contain latitude and longitude data or venue data. */
@js.native
trait Geoposition extends js.Object {
  /** Unsupported API. */
  var civicAddress: CivicAddress = js.native
  /** The latitude and longitude associated with a geographic location. */
  var coordinate: Geocoordinate = js.native
  /** Represents the venue associated with a geographic location. */
  var venueData: VenueData = js.native
}

object Geoposition {
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate, venueData: VenueData): Geoposition = {
    val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], venueData = venueData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geoposition]
  }
  @scala.inline
  implicit class GeopositionOps[Self <: Geoposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCivicAddress(value: CivicAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("civicAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoordinate(value: Geocoordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVenueData(value: VenueData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("venueData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

