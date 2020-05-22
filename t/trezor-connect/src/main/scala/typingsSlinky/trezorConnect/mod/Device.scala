package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.trezorConnectStrings.acquired
import typingsSlinky.trezorConnect.trezorConnectStrings.unacquired
import typingsSlinky.trezorConnect.trezorConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.anon.Features
  - typingsSlinky.trezorConnect.anon.Label
  - typingsSlinky.trezorConnect.anon.Path
*/
trait Device extends js.Object

object Device {
  @scala.inline
  def Features(
    features: typingsSlinky.trezorConnect.mod.Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired,
    state: String = null
  ): Device = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  def Label(label: String, path: String, `type`: unacquired): Device = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  def Path(label: String, path: String, `type`: unreadable): Device = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

