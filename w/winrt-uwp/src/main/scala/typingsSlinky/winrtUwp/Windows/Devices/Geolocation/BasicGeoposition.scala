package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The basic information to describe a geographic position. */
@js.native
trait BasicGeoposition extends js.Object {
  /** The altitude of the geographic position in meters. */
  var altitude: Double = js.native
  /** The latitude of the geographic position. The valid range of latitude values is from -90.0 to 90.0 degrees. */
  var latitude: Double = js.native
  /** The longitude of the geographic position. This can be any value. For values less than or equal to-180.0 or values greater than 180.0, the value may be wrapped and stored appropriately before it is used. For example, a longitude of 183.0 degrees would become -177.0 degrees. */
  var longitude: Double = js.native
}

object BasicGeoposition {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): BasicGeoposition = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicGeoposition]
  }
  @scala.inline
  implicit class BasicGeopositionOps[Self <: BasicGeoposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

