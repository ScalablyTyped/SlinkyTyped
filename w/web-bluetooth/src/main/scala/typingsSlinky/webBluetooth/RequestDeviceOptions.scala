package typingsSlinky.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webBluetooth.anon.Filters
  - typingsSlinky.webBluetooth.anon.AcceptAllDevices
*/
trait RequestDeviceOptions extends StObject
object RequestDeviceOptions {
  
  @scala.inline
  def AcceptAllDevices(acceptAllDevices: Boolean): typingsSlinky.webBluetooth.anon.AcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webBluetooth.anon.AcceptAllDevices]
  }
  
  @scala.inline
  def Filters(filters: js.Array[BluetoothRequestDeviceFilter]): typingsSlinky.webBluetooth.anon.Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.webBluetooth.anon.Filters]
  }
}
