package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates which properties of a network have changed after a network state change background trigger. */
@js.native
trait NetworkStateChangeEventDetails extends js.Object {
  /** Indicates if a connected network has a new connection cost. */
  var hasNewConnectionCost: Boolean = js.native
  /** Indicates a connected network has a new domain connectivity level. */
  var hasNewDomainConnectivityLevel: Boolean = js.native
  /** Indicates if the list of host names returned by GetHostNames has changed. */
  var hasNewHostNameList: Boolean = js.native
  /** Indicates if the local machine has a new connection profile associated with the current internet connection. */
  var hasNewInternetConnectionProfile: Boolean = js.native
  /** Indicates if the network connectivity level for any connection profiles has changed. */
  var hasNewNetworkConnectivityLevel: Boolean = js.native
  /** Gets a value indicating whether the network state change event shows a new tethering client count. */
  var hasNewTetheringClientCount: Boolean = js.native
  /** Gets a value that indicates whether the tethering operational state has changed. */
  var hasNewTetheringOperationalState: Boolean = js.native
  /** Indicates if the network state change event represents a change to the registration state of a WWAN connection. The current registration state can be retrieved from WwanConnectionProfileDetails.GetNetworkRegistrationState . */
  var hasNewWwanRegistrationState: Boolean = js.native
}

object NetworkStateChangeEventDetails {
  @scala.inline
  def apply(
    hasNewConnectionCost: Boolean,
    hasNewDomainConnectivityLevel: Boolean,
    hasNewHostNameList: Boolean,
    hasNewInternetConnectionProfile: Boolean,
    hasNewNetworkConnectivityLevel: Boolean,
    hasNewTetheringClientCount: Boolean,
    hasNewTetheringOperationalState: Boolean,
    hasNewWwanRegistrationState: Boolean
  ): NetworkStateChangeEventDetails = {
    val __obj = js.Dynamic.literal(hasNewConnectionCost = hasNewConnectionCost.asInstanceOf[js.Any], hasNewDomainConnectivityLevel = hasNewDomainConnectivityLevel.asInstanceOf[js.Any], hasNewHostNameList = hasNewHostNameList.asInstanceOf[js.Any], hasNewInternetConnectionProfile = hasNewInternetConnectionProfile.asInstanceOf[js.Any], hasNewNetworkConnectivityLevel = hasNewNetworkConnectivityLevel.asInstanceOf[js.Any], hasNewTetheringClientCount = hasNewTetheringClientCount.asInstanceOf[js.Any], hasNewTetheringOperationalState = hasNewTetheringOperationalState.asInstanceOf[js.Any], hasNewWwanRegistrationState = hasNewWwanRegistrationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStateChangeEventDetails]
  }
  @scala.inline
  implicit class NetworkStateChangeEventDetailsOps[Self <: NetworkStateChangeEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNewConnectionCost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewConnectionCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewDomainConnectivityLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewDomainConnectivityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewHostNameList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewHostNameList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewInternetConnectionProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewInternetConnectionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewNetworkConnectivityLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewNetworkConnectivityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewTetheringClientCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewTetheringClientCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewTetheringOperationalState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewTetheringOperationalState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasNewWwanRegistrationState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNewWwanRegistrationState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

