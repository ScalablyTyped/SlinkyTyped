package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webBluetooth.anon.Filters
  - typingsSlinky.webBluetooth.anon.AcceptAllDevices
*/
trait RequestDeviceOptions extends js.Object
object RequestDeviceOptions {
  
  @scala.inline
  def Filters(filters: js.Array[BluetoothRequestDeviceFilter]): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
  
  @scala.inline
  def AcceptAllDevices(acceptAllDevices: Boolean): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
}
