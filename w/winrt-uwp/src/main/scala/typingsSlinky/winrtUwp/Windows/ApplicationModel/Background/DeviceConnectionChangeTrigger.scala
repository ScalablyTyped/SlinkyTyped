package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@js.native
trait DeviceConnectionChangeTrigger extends js.Object {
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean = js.native
  /** Gets the device Id associated with the device. */
  var deviceId: String = js.native
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean = js.native
}

object DeviceConnectionChangeTrigger {
  @scala.inline
  def apply(canMaintainConnection: Boolean, deviceId: String, maintainConnection: Boolean): DeviceConnectionChangeTrigger = {
    val __obj = js.Dynamic.literal(canMaintainConnection = canMaintainConnection.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maintainConnection = maintainConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTrigger]
  }
  @scala.inline
  implicit class DeviceConnectionChangeTriggerOps[Self <: DeviceConnectionChangeTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanMaintainConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMaintainConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainConnection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

