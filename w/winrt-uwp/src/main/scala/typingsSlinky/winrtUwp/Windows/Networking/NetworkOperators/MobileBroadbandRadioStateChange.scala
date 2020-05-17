package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a radio state change notification. */
@js.native
trait MobileBroadbandRadioStateChange extends js.Object {
  /** Gets the device ID of the device whose radio state changed. */
  var deviceId: String = js.native
  /** Gets the new state of the radio. */
  var radioState: MobileBroadbandRadioState = js.native
}

object MobileBroadbandRadioStateChange {
  @scala.inline
  def apply(deviceId: String, radioState: MobileBroadbandRadioState): MobileBroadbandRadioStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], radioState = radioState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChange]
  }
  @scala.inline
  implicit class MobileBroadbandRadioStateChangeOps[Self <: MobileBroadbandRadioStateChange] (val x: Self) extends AnyVal {
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
    def withRadioState(value: MobileBroadbandRadioState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

