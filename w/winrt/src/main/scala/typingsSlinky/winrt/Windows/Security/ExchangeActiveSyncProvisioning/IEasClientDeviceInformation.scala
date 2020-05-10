package typingsSlinky.winrt.Windows.Security.ExchangeActiveSyncProvisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEasClientDeviceInformation extends js.Object {
  var friendlyName: String = js.native
  var id: String = js.native
  var operatingSystem: String = js.native
  var systemManufacturer: String = js.native
  var systemProductName: String = js.native
  var systemSku: String = js.native
}

object IEasClientDeviceInformation {
  @scala.inline
  def apply(
    friendlyName: String,
    id: String,
    operatingSystem: String,
    systemManufacturer: String,
    systemProductName: String,
    systemSku: String
  ): IEasClientDeviceInformation = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operatingSystem = operatingSystem.asInstanceOf[js.Any], systemManufacturer = systemManufacturer.asInstanceOf[js.Any], systemProductName = systemProductName.asInstanceOf[js.Any], systemSku = systemSku.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEasClientDeviceInformation]
  }
  @scala.inline
  implicit class IEasClientDeviceInformationOps[Self <: IEasClientDeviceInformation] (val x: Self) extends AnyVal {
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

