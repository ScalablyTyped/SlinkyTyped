package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Descriptor of a GATT Characteristic. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor")
@js.native
abstract class GattDescriptor ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor
/* static members */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor")
@js.native
object GattDescriptor extends js.Object {
  
  /**
    * Converts a Bluetooth SIG defined short Id to a full GATT UUID.
    * @param shortId A 16-bit Bluetooth GATT Descriptor UUID.
    * @return The corresponding 128-bit GATT Descriptor UUID, that uniquely identifies this descriptor.
    */
  def convertShortIdToUuid(shortId: Double): String = js.native
}
