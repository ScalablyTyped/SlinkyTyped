package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about one network registration state change. */
@js.native
trait MobileBroadbandNetworkRegistrationStateChange extends js.Object {
  /** Gets the unique identifier of the device associated with a network registration state change. */
  var deviceId: String = js.native
  /** Gets an object which contains details about the network associated with this network state change. */
  var network: MobileBroadbandNetwork = js.native
}

object MobileBroadbandNetworkRegistrationStateChange {
  @scala.inline
  def apply(deviceId: String, network: MobileBroadbandNetwork): MobileBroadbandNetworkRegistrationStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChange]
  }
  @scala.inline
  implicit class MobileBroadbandNetworkRegistrationStateChangeOps[Self <: MobileBroadbandNetworkRegistrationStateChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetwork(value: MobileBroadbandNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

