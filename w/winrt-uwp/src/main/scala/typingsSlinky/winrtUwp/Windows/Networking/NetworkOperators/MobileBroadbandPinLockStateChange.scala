package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a PIN lock state change notification. */
@js.native
trait MobileBroadbandPinLockStateChange extends js.Object {
  /** Gets the device identifier associated with a PIN lock state change. */
  var deviceId: String = js.native
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  var pinLockState: MobileBroadbandPinLockState = js.native
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  var pinType: MobileBroadbandPinType = js.native
}

object MobileBroadbandPinLockStateChange {
  @scala.inline
  def apply(deviceId: String, pinLockState: MobileBroadbandPinLockState, pinType: MobileBroadbandPinType): MobileBroadbandPinLockStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], pinLockState = pinLockState.asInstanceOf[js.Any], pinType = pinType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChange]
  }
  @scala.inline
  implicit class MobileBroadbandPinLockStateChangeOps[Self <: MobileBroadbandPinLockStateChange] (val x: Self) extends AnyVal {
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
    def withPinLockState(value: MobileBroadbandPinLockState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinLockState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinType(value: MobileBroadbandPinType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

