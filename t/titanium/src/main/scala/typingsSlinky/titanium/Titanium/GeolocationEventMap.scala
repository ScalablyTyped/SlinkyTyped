package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationEventMap extends ProxyEventMap {
  var authorization: GeolocationAuthorizationEvent = js.native
  var calibration: GeolocationCalibrationEvent = js.native
  var heading: GeolocationHeadingEvent = js.native
  var location: GeolocationLocationEvent = js.native
  var locationupdatepaused: GeolocationLocationupdatepausedEvent = js.native
  var locationupdateresumed: GeolocationLocationupdateresumedEvent = js.native
}

object GeolocationEventMap {
  @scala.inline
  def apply(
    authorization: GeolocationAuthorizationEvent,
    calibration: GeolocationCalibrationEvent,
    heading: GeolocationHeadingEvent,
    location: GeolocationLocationEvent,
    locationupdatepaused: GeolocationLocationupdatepausedEvent,
    locationupdateresumed: GeolocationLocationupdateresumedEvent
  ): GeolocationEventMap = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], calibration = calibration.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationupdatepaused = locationupdatepaused.asInstanceOf[js.Any], locationupdateresumed = locationupdateresumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationEventMap]
  }
  @scala.inline
  implicit class GeolocationEventMapOps[Self <: GeolocationEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: GeolocationAuthorizationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalibration(value: GeolocationCalibrationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calibration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading(value: GeolocationHeadingEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: GeolocationLocationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationupdatepaused(value: GeolocationLocationupdatepausedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationupdatepaused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationupdateresumed(value: GeolocationLocationupdateresumedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationupdateresumed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

