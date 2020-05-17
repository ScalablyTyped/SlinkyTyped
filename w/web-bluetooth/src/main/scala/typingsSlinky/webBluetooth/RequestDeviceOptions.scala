package typingsSlinky.webBluetooth

import typingsSlinky.webBluetooth.anon.AcceptAllDevices
import typingsSlinky.webBluetooth.anon.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webBluetooth.anon.Filters
  - typingsSlinky.webBluetooth.anon.AcceptAllDevices
*/
trait RequestDeviceOptions extends js.Object

object RequestDeviceOptions {
  @scala.inline
  implicit def apply(value: AcceptAllDevices): RequestDeviceOptions = value.asInstanceOf[RequestDeviceOptions]
  @scala.inline
  implicit def apply(value: Filters): RequestDeviceOptions = value.asInstanceOf[RequestDeviceOptions]
}

