package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Devices.Input.MouseDelta
import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceUsage
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Input")
@js.native
object Input extends js.Object {
  @js.native
  class KeyboardCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.KeyboardCapabilities {
    /* CompleteClass */
    override var keyboardPresent: Double = js.native
  }
  
  @js.native
  class MouseCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseCapabilities {
    /* CompleteClass */
    override var horizontalWheelPresent: Double = js.native
    /* CompleteClass */
    override var mousePresent: Double = js.native
    /* CompleteClass */
    override var numberOfButtons: Double = js.native
    /* CompleteClass */
    override var swapButtons: Double = js.native
    /* CompleteClass */
    override var verticalWheelPresent: Double = js.native
  }
  
  @js.native
  class MouseDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseDevice {
    /* CompleteClass */
    override var onmousemoved: js.Any = js.native
  }
  
  @js.native
  class MouseEventArgs ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseEventArgs {
    /* CompleteClass */
    override var mouseDelta: MouseDelta = js.native
  }
  
  @js.native
  class PointerDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.PointerDevice {
    /* CompleteClass */
    override var isIntegrated: Boolean = js.native
    /* CompleteClass */
    override var maxContacts: Double = js.native
    /* CompleteClass */
    override var physicalDeviceRect: Rect = js.native
    /* CompleteClass */
    override var pointerDeviceType: PointerDeviceType = js.native
    /* CompleteClass */
    override var screenRect: Rect = js.native
    /* CompleteClass */
    override var supportedUsages: IVectorView[PointerDeviceUsage] = js.native
  }
  
  @js.native
  class TouchCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.TouchCapabilities {
    /* CompleteClass */
    override var contacts: Double = js.native
    /* CompleteClass */
    override var touchPresent: Double = js.native
  }
  
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

