package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of reading a GATT Client CharacteristicConfigurationClientDescriptor value. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult")
@js.native
abstract class GattReadClientCharacteristicConfigurationDescriptorResult ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadClientCharacteristicConfigurationDescriptorResult {
  /** Gets the result of an asynchronous read operation. */
  /* CompleteClass */
  override var clientCharacteristicConfigurationDescriptor: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue = js.native
  /** Gets the status of an asynchronous operation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus = js.native
}

