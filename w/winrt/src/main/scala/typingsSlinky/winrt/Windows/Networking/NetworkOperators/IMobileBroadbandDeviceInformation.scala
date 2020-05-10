package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Devices.Sms.CellularClass
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandDeviceInformation extends js.Object {
  var cellularClass: CellularClass = js.native
  var currentRadioState: MobileBroadbandRadioState = js.native
  var customDataClass: String = js.native
  var dataClasses: DataClasses = js.native
  var deviceId: String = js.native
  var deviceType: MobileBroadbandDeviceType = js.native
  var firmwareInformation: String = js.native
  var manufacturer: String = js.native
  var mobileEquipmentId: String = js.native
  var model: String = js.native
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  var simIccId: String = js.native
  var subscriberId: String = js.native
  var telephoneNumbers: IVectorView[String] = js.native
}

object IMobileBroadbandDeviceInformation {
  @scala.inline
  def apply(
    cellularClass: CellularClass,
    currentRadioState: MobileBroadbandRadioState,
    customDataClass: String,
    dataClasses: DataClasses,
    deviceId: String,
    deviceType: MobileBroadbandDeviceType,
    firmwareInformation: String,
    manufacturer: String,
    mobileEquipmentId: String,
    model: String,
    networkDeviceStatus: NetworkDeviceStatus,
    simIccId: String,
    subscriberId: String,
    telephoneNumbers: IVectorView[String]
  ): IMobileBroadbandDeviceInformation = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], currentRadioState = currentRadioState.asInstanceOf[js.Any], customDataClass = customDataClass.asInstanceOf[js.Any], dataClasses = dataClasses.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], firmwareInformation = firmwareInformation.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mobileEquipmentId = mobileEquipmentId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkDeviceStatus = networkDeviceStatus.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], telephoneNumbers = telephoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandDeviceInformation]
  }
  @scala.inline
  implicit class IMobileBroadbandDeviceInformationOps[Self <: IMobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellularClass(value: CellularClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellularClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentRadioState(value: MobileBroadbandRadioState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRadioState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomDataClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDataClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataClasses(value: DataClasses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceType(value: MobileBroadbandDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirmwareInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileEquipmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileEquipmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkDeviceStatus(value: NetworkDeviceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkDeviceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimIccId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simIccId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriberId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelephoneNumbers(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephoneNumbers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

