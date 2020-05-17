package typingsSlinky.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
abstract class DeviceAccessInformation ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation

/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
object DeviceAccessInformation extends js.Object {
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  def createFromDeviceClass(deviceClass: typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  def createFromDeviceClassId(deviceClassId: String): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  def createFromId(deviceId: String): typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
}

