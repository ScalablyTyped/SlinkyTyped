package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information for identifying a geographic location. */
@js.native
trait Geocoordinate extends js.Object {
  /** The accuracy of the location in meters. */
  var accuracy: Double = js.native
  /** The altitude of the location, in meters. */
  var altitude: Double = js.native
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: Double = js.native
  /** The current heading in degrees relative to true north. */
  var heading: Double = js.native
  /** The latitude in degrees. */
  var latitude: Double = js.native
  /** The longitude in degrees. */
  var longitude: Double = js.native
  /** The location of the Geocoordinate. */
  var point: Geopoint = js.native
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource = js.native
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: js.Date = js.native
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData = js.native
  /** The speed in meters per second. */
  var speed: Double = js.native
  /** The system time at which the location was determined. */
  var timestamp: js.Date = js.native
}

object Geocoordinate {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    point: Geopoint,
    positionSource: PositionSource,
    positionSourceTimestamp: js.Date,
    satelliteData: GeocoordinateSatelliteData,
    speed: Double,
    timestamp: js.Date
  ): Geocoordinate = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], positionSource = positionSource.asInstanceOf[js.Any], positionSourceTimestamp = positionSourceTimestamp.asInstanceOf[js.Any], satelliteData = satelliteData.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoordinate]
  }
  @scala.inline
  implicit class GeocoordinateOps[Self <: Geocoordinate] (val x: Self) extends AnyVal {
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
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltitudeAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitudeAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPoint(value: Geopoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionSource(value: PositionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionSourceTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSourceTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSatelliteData(value: GeocoordinateSatelliteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satelliteData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

