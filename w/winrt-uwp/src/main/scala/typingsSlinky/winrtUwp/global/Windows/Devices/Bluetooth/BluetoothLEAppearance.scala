package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to determine the Bluetooth Low Energy (LE) Appearance information for a device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
abstract class BluetoothLEAppearance ()
  extends typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance
/* static members */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothLEAppearance")
@js.native
object BluetoothLEAppearance extends js.Object {
  
  /**
    * Creates a BluetoothLEAppearance object by supplying values for Category (see BluetoothLEAppearanceCategories ) and Subcategory (see BluetoothLEAppearanceSubcategories ) of the Bluetooth LE device.
    * @param appearanceCategory The Bluetooth LE appearance category. See BluetoothLEAppearanceSubcategories .
    * @param appearanceSubCategory The Bluetooth LE appearance subcategory. See BluetoothLEAppearanceSubcategories .
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromParts(appearanceCategory: Double, appearanceSubCategory: Double): typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
  
  /**
    * Creates a BluetoothLEAppearance object by supplying for raw integer values representing the Category and Subcategory of the Bluetooth LE device.
    * @param rawValue The raw integer value representing the appearance category and subcategory.
    * @return The Bluetooth LE appearance object that was created from the appearance category and subcategory.
    */
  def fromRawValue(rawValue: Double): typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothLEAppearance = js.native
}
