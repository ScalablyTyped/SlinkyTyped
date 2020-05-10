package typingsSlinky.winrt.Windows.Devices.Input

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
class PointerDevice () extends IPointerDevice

/* static members */
@JSGlobal("Windows.Devices.Input.PointerDevice")
@js.native
object PointerDevice extends js.Object {
  def getPointerDevice(pointerId: Double): PointerDevice = js.native
  def getPointerDevices(): IVectorView[PointerDevice] = js.native
}

