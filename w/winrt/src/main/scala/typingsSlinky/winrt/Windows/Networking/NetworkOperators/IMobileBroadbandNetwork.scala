package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandNetwork extends js.Object {
  var accessPointName: String = js.native
  var activationNetworkError: Double = js.native
  var networkAdapter: NetworkAdapter = js.native
  var networkRegistrationState: NetworkRegistrationState = js.native
  var packetAttachNetworkError: Double = js.native
  var registeredDataClass: DataClasses = js.native
  var registeredProviderId: String = js.native
  var registeredProviderName: String = js.native
  var registrationNetworkError: Double = js.native
  def showConnectionUI(): Unit = js.native
}

object IMobileBroadbandNetwork {
  @scala.inline
  def apply(
    accessPointName: String,
    activationNetworkError: Double,
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    showConnectionUI: () => Unit
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], showConnectionUI = js.Any.fromFunction0(showConnectionUI))
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
  @scala.inline
  implicit class IMobileBroadbandNetworkOps[Self <: IMobileBroadbandNetwork] (val x: Self) extends AnyVal {
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
    def withShowConnectionUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConnectionUI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

