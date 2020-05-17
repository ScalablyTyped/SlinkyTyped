package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband account and related information about the network provider for the account. */
@js.native
trait MobileBroadbandAccount extends js.Object {
  /** Gets the mobile broadband device information associated with this account. */
  var currentDeviceInformation: MobileBroadbandDeviceInformation = js.native
  /** Gets the Mobile Broadband network object for this account. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  /** Gets a unique identifier for the mobile broadband account. */
  var networkAccountId: String = js.native
  /** A unique identifier for the network provider for the mobile broadband account. */
  var serviceProviderGuid: String = js.native
  /** The name of the network provider for the mobile broadband account. */
  var serviceProviderName: String = js.native
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
}

object MobileBroadbandAccount {
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    getConnectionProfiles: () => IVectorView[ConnectionProfile],
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): MobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccount]
  }
  @scala.inline
  implicit class MobileBroadbandAccountOps[Self <: MobileBroadbandAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDeviceInformation(value: MobileBroadbandDeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDeviceInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNetwork(value: MobileBroadbandNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConnectionProfiles(value: () => IVectorView[ConnectionProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectionProfiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNetworkAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceProviderGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProviderGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProviderName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

