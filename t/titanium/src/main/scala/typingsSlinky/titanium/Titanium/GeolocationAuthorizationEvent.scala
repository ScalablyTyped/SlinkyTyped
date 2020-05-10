package typingsSlinky.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Fired when changes are made to the authorization status for location services.
	 */
@js.native
trait GeolocationAuthorizationEvent extends GeolocationBaseEvent {
  /**
  		 * New authorization status for the application.
  		 */
  var authorizationStatus: Double = js.native
}

object GeolocationAuthorizationEvent {
  @scala.inline
  def apply(authorizationStatus: Double, source: Geolocation): GeolocationAuthorizationEvent = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationAuthorizationEvent]
  }
  @scala.inline
  implicit class GeolocationAuthorizationEventOps[Self <: GeolocationAuthorizationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

