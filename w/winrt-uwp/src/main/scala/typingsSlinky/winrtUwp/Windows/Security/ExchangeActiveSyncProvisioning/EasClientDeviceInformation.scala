package typingsSlinky.winrtUwp.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the app the ability to retrieve device information from the local device. */
@js.native
trait EasClientDeviceInformation extends js.Object {
  /** Returns the friendly name of the local device. */
  var friendlyName: String = js.native
  /** Returns the identifier of the local device. */
  var id: String = js.native
  /** Returns the operating system of the local device. */
  var operatingSystem: String = js.native
  /** Returns the system firmware version of the local device. */
  var systemFirmwareVersion: String = js.native
  /** Returns the system hardware version of the local device. */
  var systemHardwareVersion: String = js.native
  /** Returns the system manufacturer of the local device. Use this only if the SystemSku is empty. */
  var systemManufacturer: String = js.native
  /** Returns the system product name of the local device. */
  var systemProductName: String = js.native
  /** Returns the system SKU of the local device. */
  var systemSku: String = js.native
}

object EasClientDeviceInformation {
  @scala.inline
  def apply(
    friendlyName: String,
    id: String,
    operatingSystem: String,
    systemFirmwareVersion: String,
    systemHardwareVersion: String,
    systemManufacturer: String,
    systemProductName: String,
    systemSku: String
  ): EasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], systemFirmwareVersion = systemFirmwareVersion.asInstanceOf[js.Any], systemHardwareVersion = systemHardwareVersion.asInstanceOf[js.Any], systemManufacturer = systemManufacturer.asInstanceOf[js.Any], systemProductName = systemProductName.asInstanceOf[js.Any], systemSku = systemSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[EasClientDeviceInformation]
  }
  @scala.inline
  implicit class EasClientDeviceInformationOps[Self <: EasClientDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperatingSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemFirmwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemFirmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemHardwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemHardwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemManufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemProductName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSku(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSku")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

