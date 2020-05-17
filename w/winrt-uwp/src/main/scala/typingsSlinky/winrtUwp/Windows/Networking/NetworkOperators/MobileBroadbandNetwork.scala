package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband network and the current network state. */
@js.native
trait MobileBroadbandNetwork extends js.Object {
  /** The name of the currently connected access point. */
  var accessPointName: String = js.native
  /** Attempts to get the latest network activation error. */
  var activationNetworkError: Double = js.native
  /** Gets the unique network interface that identifies the mobile broadband network. */
  var networkAdapter: NetworkAdapter = js.native
  /** Gets the current network registration state. */
  var networkRegistrationState: NetworkRegistrationState = js.native
  /** Gets the latest packet attach network error. */
  var packetAttachNetworkError: Double = js.native
  /** Gets the data class of the current mobile network. */
  var registeredDataClass: DataClasses = js.native
  /** Gets the provider ID for the currently registered mobile network. */
  var registeredProviderId: String = js.native
  /** Gets the provider name for the currently registered mobile network. */
  var registeredProviderName: String = js.native
  /** Gets the latest network registration error. */
  var registrationNetworkError: Double = js.native
  /** Gets a list of all UICC apps available on the SIM card that can be used for registration on a mobile network. This list includes UICC apps that are not currently used for registration, but could potentially could be used for registration. */
  var registrationUiccApps: IVectorView[MobileBroadbandUiccApp] = js.native
  /**
    * Asynchronously retrieves a value indicating whether this network currently supports voice calls.
    * @return An asynchronous retrieval operation. On successful completion, contains a value indicating whether the network supports voice calls (if true) or not.
    */
  def getVoiceCallSupportAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Displays the connect UI for a specific mobile network. */
  def showConnectionUI(): Unit = js.native
}

object MobileBroadbandNetwork {
  @scala.inline
  def apply(
    accessPointName: String,
    activationNetworkError: Double,
    getVoiceCallSupportAsync: () => IPromiseWithIAsyncOperation[Boolean],
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    registrationUiccApps: IVectorView[MobileBroadbandUiccApp],
    showConnectionUI: () => Unit
  ): MobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], getVoiceCallSupportAsync = js.Any.fromFunction0(getVoiceCallSupportAsync), networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], registrationUiccApps = registrationUiccApps.asInstanceOf[js.Any], showConnectionUI = js.Any.fromFunction0(showConnectionUI))
    __obj.asInstanceOf[MobileBroadbandNetwork]
  }
  @scala.inline
  implicit class MobileBroadbandNetworkOps[Self <: MobileBroadbandNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPointName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPointName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivationNetworkError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationNetworkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVoiceCallSupportAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVoiceCallSupportAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNetworkAdapter(value: NetworkAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkRegistrationState(value: NetworkRegistrationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkRegistrationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPacketAttachNetworkError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetAttachNetworkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredDataClass(value: DataClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredDataClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisteredProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registeredProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationNetworkError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationNetworkError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationUiccApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowConnectionUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectionUI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

