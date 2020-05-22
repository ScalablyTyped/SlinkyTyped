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

trait Features extends Device {
  var features: typingsSlinky.trezorConnect.mod.Features
  var firmware: DeviceFirmwareStatus
  var firmwareRelease: FirmwareRelease
  var label: String
  var mode: DeviceMode
  var path: String
  var state: String | Null
  var status: DeviceStatus
  var `type`: acquired
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
    `type`: acquired,
    state: String = null
  ): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

