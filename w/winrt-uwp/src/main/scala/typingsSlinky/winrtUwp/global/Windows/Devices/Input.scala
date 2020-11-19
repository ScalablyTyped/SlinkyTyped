package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for identifying the input devices available (pointer, touch, mouse, and keyboard) and retrieving information about those devices. */
@JSGlobal("Windows.Devices.Input")
@js.native
object Input extends js.Object {
  
  /** Supports the ability to determine the capabilities of any connected hardware keyboards. */
  @js.native
  /** Initializes a new instance of the KeyboardCapabilities class. */
  class KeyboardCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.KeyboardCapabilities
  
  /** Supports the ability to determine the capabilities of any connected mouse devices. */
  @js.native
  /** Initializes a new instance of the MouseCapabilities class. */
  class MouseCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.MouseCapabilities
  
  /** Supports the ability to identify and track connected mouse devices. */
  @js.native
  abstract class MouseDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.MouseDevice
  /* static members */
  @js.native
  object MouseDevice extends js.Object {
    
    /**
      * Retrieves the mouse device that is associated with the current view.
      * @return The mouse device.
      */
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.Devices.Input.MouseDevice = js.native
  }
  
  /** Contains event data for the MouseMoved event. */
  @js.native
  abstract class MouseEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.MouseEventArgs
  
  /** Supports the ability to identify the connected pointer devices and determine their capabilities. */
  @js.native
  abstract class PointerDevice ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDevice
  /* static members */
  @js.native
  object PointerDevice extends js.Object {
    
    /**
      * Gets information about the pointer device associated with the specified input pointer ID.
      * @param pointerId The ID of the pointer input.
      * @return The PointerDevice object that represents the associated pointer device.
      */
    def getPointerDevice(pointerId: Double): typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDevice = js.native
    
    /**
      * Gets information about the pointer devices attached to the system.
      * @return The collection of PointerDevice objects that represent the pointer devices attached to the system.
      */
    def getPointerDevices(): IVectorView[typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDevice] = js.native
  }
  
  /** Enumerates pointer device types. */
  @js.native
  object PointerDeviceType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType with Double] = js.native
    
    /* 2 */ val mouse: typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
    
    /* 1 */ val pen: typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
    
    /* 0 */ val touch: typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  }
  
  /** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
  @js.native
  /** Initializes a new instance of the TouchCapabilities class. */
  class TouchCapabilities ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Input.TouchCapabilities
}
