package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the content of the event that is raised for background task handlers for the hotspot authentication event. */
@js.native
trait HotspotAuthenticationEventDetails extends js.Object {
  /** Gets a GUID that uniquely identifies the authentication attempt for which this event was raised. */
  var eventToken: String = js.native
}

object HotspotAuthenticationEventDetails {
  @scala.inline
  def apply(eventToken: String): HotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationEventDetails]
  }
  @scala.inline
  implicit class HotspotAuthenticationEventDetailsOps[Self <: HotspotAuthenticationEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

