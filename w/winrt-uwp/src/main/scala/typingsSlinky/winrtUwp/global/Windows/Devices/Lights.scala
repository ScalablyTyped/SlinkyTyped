package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for accessing and controlling lamp devices. */
@JSGlobal("Windows.Devices.Lights")
@js.native
object Lights extends js.Object {
  
  /** Represents a lamp device. */
  @js.native
  abstract class Lamp ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Lights.Lamp
  /* static members */
  @js.native
  object Lamp extends js.Object {
    
    /**
      * Gets a Lamp object representing the lamp device with the specified ID.
      * @param deviceId The ID of the requested lamp device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    
    /**
      * Gets a Lamp object representing the default lamp for the device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    
    /**
      * Returns the class selection string that you can use to enumerate lamp devices.
      * @return The class selection string for lamp devices.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides data for the AvailabilityChanged event. */
  @js.native
  abstract class LampAvailabilityChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Lights.LampAvailabilityChangedEventArgs
}
