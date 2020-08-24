package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webBluetooth {
  type BluetoothCharacteristicUUID = scala.Double | java.lang.String
  type BluetoothDescriptorUUID = scala.Double | java.lang.String
  type BluetoothManufacturerData = typingsSlinky.std.Map[scala.Double, js.typedarray.DataView]
  type BluetoothManufacturerDataFilter = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.webBluetooth.BluetoothDataFilter]
  type BluetoothServiceData = typingsSlinky.std.Map[typingsSlinky.webBluetooth.BluetoothServiceUUID, js.typedarray.DataView]
  type BluetoothServiceDataFilter = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ serviceUUID in web-bluetooth.BluetoothServiceUUID ]: web-bluetooth.BluetoothDataFilter}
    */ typingsSlinky.webBluetooth.webBluetoothStrings.BluetoothServiceDataFilter with org.scalablytyped.runtime.TopLevel[js.Any]
  type BluetoothServiceUUID = scala.Double | java.lang.String
}
