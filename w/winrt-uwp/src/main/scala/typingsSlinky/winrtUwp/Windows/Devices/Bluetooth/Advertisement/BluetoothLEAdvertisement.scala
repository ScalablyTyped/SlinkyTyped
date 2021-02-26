package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A representation of a Bluetooth LE advertisement payload. */
@js.native
trait BluetoothLEAdvertisement extends StObject {
  
  /** Gets the list of raw data sections. */
  var dataSections: IVector[BluetoothLEAdvertisementDataSection] = js.native
  
  /** Bluetooth LE advertisement flags. */
  var flags: BluetoothLEAdvertisementFlags = js.native
  
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
  
  /** The local name contained within the advertisement. */
  var localName: String = js.native
  
  /** Gets the list of manufacturer-specific data sections in a BluetoothLEAdvertisement . */
  var manufacturerData: IVector[BluetoothLEManufacturerData] = js.native
  
  /** The list of service UUIDs in 128-bit GUID format in a BluetoothLEAdvertisement . */
  var serviceUuids: IVector[String] = js.native
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
  implicit class BluetoothLEAdvertisementMutableBuilder[Self <: BluetoothLEAdvertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSections(value: IVector[BluetoothLEAdvertisementDataSection]): Self = StObject.set(x, "dataSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: BluetoothLEAdvertisementFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetManufacturerDataByCompanyId(value: Double => IVectorView[BluetoothLEManufacturerData]): Self = StObject.set(x, "getManufacturerDataByCompanyId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSectionsByType(value: Double => IVectorView[BluetoothLEAdvertisementDataSection]): Self = StObject.set(x, "getSectionsByType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerData(value: IVector[BluetoothLEManufacturerData]): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUuids(value: IVector[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
  }
}
