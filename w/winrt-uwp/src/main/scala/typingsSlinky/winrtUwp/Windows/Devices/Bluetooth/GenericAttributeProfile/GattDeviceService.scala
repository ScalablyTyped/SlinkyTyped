package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEDevice
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GATT Primary Service on a Bluetooth device. */
@js.native
trait GattDeviceService extends js.Object {
  /** Gets the handle used to uniquely identify GATT-based service attributes as declared on the Bluetooth LE device. */
  var attributeHandle: Double = js.native
  /** Gets the BluetoothLEDevice object describing the device associated with the current GattDeviceService object. */
  var device: BluetoothLEDevice = js.native
  /** Get the string that represents the GATT service instance path used to instantiate the GattDeviceService. */
  var deviceId: String = js.native
  /** Gets the read-only list of parent services for this service. */
  var parentServices: IVectorView[GattDeviceService] = js.native
  /** The GATT Service UUID associated with this GattDeviceService. */
  var uuid: String = js.native
  /** Releases the resources associated with the GattDeviceService class. This allows other apps to access the resources of the GattDeviceService in question. A GattDeviceService object should not be used after Close is invoked, instead a new GattDeviceService object should be instantiated using the FromIdAsync method. */
  def close(): Unit = js.native
  /**
    * Gets the collection of all characteristics belonging to this GattDeviceService instance.
    * @return The collection of all characteristics belonging to this GattDeviceService instance.
    */
  def getAllCharacteristics(): IVectorView[GattCharacteristic] = js.native
  /**
    * Gets the collection of all included services belonging to this GattDeviceService instance.
    * @return The collection of all included services belonging to this GattDeviceService instance.
    */
  def getAllIncludedServices(): IVectorView[GattDeviceService] = js.native
  /**
    * Returns a vector of characteristics, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param characteristicUuid The UUID for the characteristics to be retrieved.
    * @return A vector of GattCharacteristic objects whose UUIDs match characteristicUuid.
    */
  def getCharacteristics(characteristicUuid: String): IVectorView[GattCharacteristic] = js.native
  /**
    * Returns a vector of included services, that are identified by the specified UUID and belong to this GattDeviceService instance.
    * @param serviceUuid The UUID for the included services to be retrieved.
    * @return A vector of included services whose UUIDs match serviceUuid.
    */
  def getIncludedServices(serviceUuid: String): IVectorView[GattDeviceService] = js.native
}

object GattDeviceService {
  @scala.inline
  def apply(
    attributeHandle: Double,
    close: () => Unit,
    device: BluetoothLEDevice,
    deviceId: String,
    getAllCharacteristics: () => IVectorView[GattCharacteristic],
    getAllIncludedServices: () => IVectorView[GattDeviceService],
    getCharacteristics: String => IVectorView[GattCharacteristic],
    getIncludedServices: String => IVectorView[GattDeviceService],
    parentServices: IVectorView[GattDeviceService],
    uuid: String
  ): GattDeviceService = {
    val __obj = js.Dynamic.literal(attributeHandle = attributeHandle.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), device = device.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], getAllCharacteristics = js.Any.fromFunction0(getAllCharacteristics), getAllIncludedServices = js.Any.fromFunction0(getAllIncludedServices), getCharacteristics = js.Any.fromFunction1(getCharacteristics), getIncludedServices = js.Any.fromFunction1(getIncludedServices), parentServices = parentServices.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattDeviceService]
  }
  @scala.inline
  implicit class GattDeviceServiceOps[Self <: GattDeviceService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeHandle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDevice(value: BluetoothLEDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllCharacteristics(value: () => IVectorView[GattCharacteristic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllCharacteristics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllIncludedServices(value: () => IVectorView[GattDeviceService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllIncludedServices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCharacteristics(value: String => IVectorView[GattCharacteristic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCharacteristics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIncludedServices(value: String => IVectorView[GattDeviceService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncludedServices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParentServices(value: IVectorView[GattDeviceService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

