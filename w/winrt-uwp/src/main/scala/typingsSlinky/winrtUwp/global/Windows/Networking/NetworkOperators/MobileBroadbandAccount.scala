package typingsSlinky.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband account and related information about the network provider for the account. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
abstract class MobileBroadbandAccount ()
  extends typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount {
  /** Gets the mobile broadband device information associated with this account. */
  /* CompleteClass */
  override var currentDeviceInformation: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
  /** Gets the Mobile Broadband network object for this account. */
  /* CompleteClass */
  override var currentNetwork: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
  /** Gets a unique identifier for the mobile broadband account. */
  /* CompleteClass */
  override var networkAccountId: String = js.native
  /** A unique identifier for the network provider for the mobile broadband account. */
  /* CompleteClass */
  override var serviceProviderGuid: String = js.native
  /** The name of the network provider for the mobile broadband account. */
  /* CompleteClass */
  override var serviceProviderName: String = js.native
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  /* CompleteClass */
  override def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
}

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
@js.native
object MobileBroadbandAccount extends js.Object {
  /** A list of all network account IDs for the network service provider. */
  var availableNetworkAccountIds: IVectorView[String] = js.native
  /**
    * Creates a mobile broadband account for the mobile device associated with the supplied network account ID.
    * @param networkAccountId The network account ID to use to select the corresponding mobile broadband device to use for the account.
    * @return A mobile broadband account for the mobile device associated with the supplied network account ID.
    */
  def createFromNetworkAccountId(networkAccountId: String): typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccount = js.native
}

