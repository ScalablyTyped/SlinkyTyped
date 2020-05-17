package typingsSlinky.trezorConnect.anon

import typingsSlinky.trezorConnect.mod.Device
import typingsSlinky.trezorConnect.mod.DeviceFirmwareStatus
import typingsSlinky.trezorConnect.mod.DeviceMode
import typingsSlinky.trezorConnect.mod.DeviceStatus
import typingsSlinky.trezorConnect.mod.FirmwareRelease
import typingsSlinky.trezorConnect.trezorConnectStrings.acquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends Device {
  var features: typingsSlinky.trezorConnect.mod.Features = js.native
  var firmware: DeviceFirmwareStatus = js.native
  var firmwareRelease: FirmwareRelease = js.native
  var label: String = js.native
  var mode: DeviceMode = js.native
  var path: String = js.native
  var state: String | Null = js.native
  var status: DeviceStatus = js.native
  var `type`: acquired = js.native
}

object Features {
  @scala.inline
  def apply(
    features: typingsSlinky.trezorConnect.mod.Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired
  ): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatures(value: typingsSlinky.trezorConnect.mod.Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmware(value: DeviceFirmwareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmwareRelease(value: FirmwareRelease): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: DeviceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: acquired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
  }
  
}

