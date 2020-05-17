package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Devices.Sms.CellularClass
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current state of the mobile broadband network device for the account. */
@js.native
trait MobileBroadbandDeviceInformation extends js.Object {
  /** Gets the cellular technology used by the mobile broadband network device. */
  var cellularClass: CellularClass = js.native
  /** Gets a value indicating the radio state of the device. */
  var currentRadioState: MobileBroadbandRadioState = js.native
  /** Gets the name of the data class when the DataClasses property returns Custom. */
  var customDataClass: String = js.native
  /** Gets the cellular data services supported by the mobile broadband network device. */
  var dataClasses: DataClasses = js.native
  /** Gets the DeviceInformation Id of the mobile broadband device. */
  var deviceId: String = js.native
  /** Gets a value indicating the type of Mobile Broadband device. */
  var deviceType: MobileBroadbandDeviceType = js.native
  /** Gets the device-specific firmware information for the mobile broadband network device. */
  var firmwareInformation: String = js.native
  /** Gets the name of the manufacturer of the mobile broadband network device. */
  var manufacturer: String = js.native
  /** Gets the value that uniquely identifies the mobile broadband device to the network provider. */
  var mobileEquipmentId: String = js.native
  /** Gets the name of the model of the mobile broadband network device. */
  var model: String = js.native
  /** Gets the readiness status of the mobile broadband network device. */
  var networkDeviceStatus: NetworkDeviceStatus = js.native
  /** Gets a MobileBroadbandPinManager object for the mobile broadband device. */
  var pinManager: MobileBroadbandPinManager = js.native
  /** Gets the revision of the mobile broadband device. */
  var revision: String = js.native
  /** Gets the serial number of the mobile broadband device. */
  var serialNumber: String = js.native
  /** Gets the SIM integrated circuit card identifier (ICCID) for the mobile broadband network device. */
  var simIccId: String = js.native
  /** Gets the subscriber identifier for the mobile broadband network device. */
  var subscriberId: String = js.native
  /** Gets the telephone numbers for the mobile broadband device. */
  var telephoneNumbers: IVectorView[String] = js.native
}

object MobileBroadbandDeviceInformation {
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
    pinManager: MobileBroadbandPinManager,
    revision: String,
    serialNumber: String,
    simIccId: String,
    subscriberId: String,
    telephoneNumbers: IVectorView[String]
  ): MobileBroadbandDeviceInformation = {
    val __obj = js.Dynamic.literal(cellularClass = cellularClass.asInstanceOf[js.Any], currentRadioState = currentRadioState.asInstanceOf[js.Any], customDataClass = customDataClass.asInstanceOf[js.Any], dataClasses = dataClasses.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any], firmwareInformation = firmwareInformation.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], mobileEquipmentId = mobileEquipmentId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], networkDeviceStatus = networkDeviceStatus.asInstanceOf[js.Any], pinManager = pinManager.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], simIccId = simIccId.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], telephoneNumbers = telephoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceInformation]
  }
  @scala.inline
  implicit class MobileBroadbandDeviceInformationOps[Self <: MobileBroadbandDeviceInformation] (val x: Self) extends AnyVal {
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
    def withPinManager(value: MobileBroadbandPinManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
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

