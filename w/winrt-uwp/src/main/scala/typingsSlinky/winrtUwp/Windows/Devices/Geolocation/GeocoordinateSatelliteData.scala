package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
@js.native
trait GeocoordinateSatelliteData extends js.Object {
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  var horizontalDilutionOfPrecision: Double = js.native
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  var positionDilutionOfPrecision: Double = js.native
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  var verticalDilutionOfPrecision: Double = js.native
}

object GeocoordinateSatelliteData {
  @scala.inline
  def apply(
    horizontalDilutionOfPrecision: Double,
    positionDilutionOfPrecision: Double,
    verticalDilutionOfPrecision: Double
  ): GeocoordinateSatelliteData = {
    val __obj = js.Dynamic.literal(horizontalDilutionOfPrecision = horizontalDilutionOfPrecision.asInstanceOf[js.Any], positionDilutionOfPrecision = positionDilutionOfPrecision.asInstanceOf[js.Any], verticalDilutionOfPrecision = verticalDilutionOfPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoordinateSatelliteData]
  }
  @scala.inline
  implicit class GeocoordinateSatelliteDataOps[Self <: GeocoordinateSatelliteData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalDilutionOfPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDilutionOfPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionDilutionOfPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionDilutionOfPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalDilutionOfPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDilutionOfPrecision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

