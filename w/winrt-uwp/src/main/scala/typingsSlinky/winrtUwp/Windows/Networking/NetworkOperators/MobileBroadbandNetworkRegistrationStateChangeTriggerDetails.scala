package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details for a network registration state change notification. */
@js.native
trait MobileBroadbandNetworkRegistrationStateChangeTriggerDetails extends js.Object {
  /** Gets the collection of network registration state changes associated with this notification. */
  var networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange] = js.native
}

object MobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
  @scala.inline
  def apply(networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange]): MobileBroadbandNetworkRegistrationStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(networkRegistrationStateChanges = networkRegistrationStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChangeTriggerDetails]
  }
  @scala.inline
  implicit class MobileBroadbandNetworkRegistrationStateChangeTriggerDetailsOps[Self <: MobileBroadbandNetworkRegistrationStateChangeTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkRegistrationStateChanges(value: IVectorView[MobileBroadbandNetworkRegistrationStateChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkRegistrationStateChanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

