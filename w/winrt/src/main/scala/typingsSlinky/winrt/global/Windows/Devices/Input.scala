package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input")
@js.native
object Input extends js.Object {
  @js.native
  class KeyboardCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.KeyboardCapabilities
  
  @js.native
  class MouseCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseCapabilities
  
  @js.native
  class MouseDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseDevice
  
  @js.native
  class MouseEventArgs ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseEventArgs
  
  @js.native
  class PointerDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.PointerDevice
  
  @js.native
  class TouchCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.TouchCapabilities
  
  /* static members */
  @js.native
  object MouseDevice extends js.Object {
    def getForCurrentView(): typingsSlinky.winrt.Windows.Devices.Input.MouseDevice = js.native
  }
  
  /* static members */
  @js.native
  object PointerDevice extends js.Object {
    def getPointerDevice(pointerId: Double): typingsSlinky.winrt.Windows.Devices.Input.PointerDevice = js.native
    def getPointerDevices(): IVectorView[typingsSlinky.winrt.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  @js.native
  object PointerDeviceType extends js.Object {
    /* 2 */ val mouse: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    /* 1 */ val pen: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    /* 0 */ val touch: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType with Double] = js.native
  }
  
}

