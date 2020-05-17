package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about the mobile broadband modem configuration. */
@js.native
trait MobileBroadbandModemConfiguration extends js.Object {
  /** Gets the home provider ID associated with the mobile broadband modem. */
  var homeProviderId: String = js.native
  /** Gets the home provider name for the mobile broadband modem. */
  var homeProviderName: String = js.native
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  var uicc: MobileBroadbandUicc = js.native
}

object MobileBroadbandModemConfiguration {
  @scala.inline
  def apply(homeProviderId: String, homeProviderName: String, uicc: MobileBroadbandUicc): MobileBroadbandModemConfiguration = {
    val __obj = js.Dynamic.literal(homeProviderId = homeProviderId.asInstanceOf[js.Any], homeProviderName = homeProviderName.asInstanceOf[js.Any], uicc = uicc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandModemConfiguration]
  }
  @scala.inline
  implicit class MobileBroadbandModemConfigurationOps[Self <: MobileBroadbandModemConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHomeProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomeProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeProviderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUicc(value: MobileBroadbandUicc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uicc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

