package typingsSlinky.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webBluetooth.AnonFilters
  - typingsSlinky.webBluetooth.AnonAcceptAllDevices
*/
trait RequestDeviceOptions extends js.Object

object RequestDeviceOptions {
  @scala.inline
  def AnonFilters(filters: js.Array[BluetoothRequestDeviceFilter]): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
  @scala.inline
  def AnonAcceptAllDevices(acceptAllDevices: Boolean): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
}

