package typingsSlinky.winrt.global.Windows.Devices

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.Devices.Input.KeyboardCapabilities")
  @js.native
  class KeyboardCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.KeyboardCapabilities
  
  @JSGlobal("Windows.Devices.Input.MouseCapabilities")
  @js.native
  class MouseCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseCapabilities
  
  @JSGlobal("Windows.Devices.Input.MouseDevice")
  @js.native
  class MouseDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseDevice
  /* static members */
  object MouseDevice {
    
    @JSGlobal("Windows.Devices.Input.MouseDevice.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrt.Windows.Devices.Input.MouseDevice = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.MouseEventArgs")
  @js.native
  class MouseEventArgs ()
    extends typingsSlinky.winrt.Windows.Devices.Input.MouseEventArgs
  
  @JSGlobal("Windows.Devices.Input.PointerDevice")
  @js.native
  class PointerDevice ()
    extends typingsSlinky.winrt.Windows.Devices.Input.PointerDevice
  /* static members */
  object PointerDevice {
    
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevice")
    @js.native
    def getPointerDevice(pointerId: Double): typingsSlinky.winrt.Windows.Devices.Input.PointerDevice = js.native
    
    @JSGlobal("Windows.Devices.Input.PointerDevice.getPointerDevices")
    @js.native
    def getPointerDevices(): IVectorView[typingsSlinky.winrt.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.PointerDeviceType")
  @js.native
  object PointerDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType with Double] = js.native
    
    /* 2 */ val mouse: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    
    /* 1 */ val pen: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    
    /* 0 */ val touch: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Input.TouchCapabilities")
  @js.native
  class TouchCapabilities ()
    extends typingsSlinky.winrt.Windows.Devices.Input.TouchCapabilities
}
