package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A representation of a Bluetooth LE advertisement payload. */
@js.native
trait BluetoothLEAdvertisement extends js.Object {
  /** Gets the list of raw data sections. */
  var dataSections: IVector[BluetoothLEAdvertisementDataSection] = js.native
  /** Bluetooth LE advertisement flags. */
  var flags: BluetoothLEAdvertisementFlags = js.native
  /** The local name contained within the advertisement. */
  var localName: String = js.native
  /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
  var manufacturerData: IVector[BluetoothLEManufacturerData] = js.native
  /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
  var serviceUuids: IVector[String] = js.native
  /**
    * Return a list of all manufacturer data sections in the BluetoothLEAdvertisement payload matching the specified company ID.
    * @param companyId The company identifier code defined by the Bluetooth Special Interest Group (SIG).
    * @return A vector of BluetoothLEManufacturerData contained within the payload.
    */
  def getManufacturerDataByCompanyId(companyId: Double): IVectorView[BluetoothLEManufacturerData] = js.native
  /**
    * Return a list of advertisement data sections that matches a given advertisement section type in a BluetoothLEAdvertisement .
    * @param type The advertisement section type
    * @return A vector of all the BluetoothLEAdvertisementDataSection matching the given advertisement type.
    */
  def getSectionsByType(`type`: Double): IVectorView[BluetoothLEAdvertisementDataSection] = js.native
}

object BluetoothLEAdvertisement {
  @scala.inline
  def apply(
    dataSections: IVector[BluetoothLEAdvertisementDataSection],
    flags: BluetoothLEAdvertisementFlags,
    getManufacturerDataByCompanyId: Double => IVectorView[BluetoothLEManufacturerData],
    getSectionsByType: Double => IVectorView[BluetoothLEAdvertisementDataSection],
    localName: String,
    manufacturerData: IVector[BluetoothLEManufacturerData],
    serviceUuids: IVector[String]
  ): BluetoothLEAdvertisement = {
    val __obj = js.Dynamic.literal(dataSections = dataSections.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getManufacturerDataByCompanyId = js.Any.fromFunction1(getManufacturerDataByCompanyId), getSectionsByType = js.Any.fromFunction1(getSectionsByType), localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], serviceUuids = serviceUuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisement]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementOps[Self <: BluetoothLEAdvertisement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSections(value: IVector[BluetoothLEAdvertisementDataSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: BluetoothLEAdvertisementFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetManufacturerDataByCompanyId(value: Double => IVectorView[BluetoothLEManufacturerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getManufacturerDataByCompanyId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSectionsByType(value: Double => IVectorView[BluetoothLEAdvertisementDataSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSectionsByType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerData(value: IVector[BluetoothLEManufacturerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUuids(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUuids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

