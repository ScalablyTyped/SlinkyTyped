package typingsSlinky.winrtUwp.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.UI.Color
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.availabilitychanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for accessing and controlling lamp devices. */
object Lights {
  
  /** Represents a lamp device. */
  @js.native
  trait Lamp extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_availabilitychanged(`type`: availabilitychanged, listener: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]): Unit = js.native
    
    /** Gets or sets a value indicating the current brightness level of the lamp, where 0.0 is completely off and 1.0 is maximum brightness. */
    var brightnessLevel: Double = js.native
    
    /** Releases the lamp device. */
    def close(): Unit = js.native
    
    /** Gets or sets the color of the lamp. */
    var color: Color = js.native
    
    /** Gets the DeviceInformation Id for a lamp device. */
    var deviceId: String = js.native
    
    /** Gets a value indicating whether you can set the Color property of the lamp device. */
    var isColorSettable: Boolean = js.native
    
    /** Gets a value indicating whether the lamp device is enabled. */
    var isEnabled: Boolean = js.native
    
    /** Occurs when the availability of the lamp device changes. */
    def onavailabilitychanged(ev: LampAvailabilityChangedEventArgs with WinRTEvent[Lamp]): Unit = js.native
    /** Occurs when the availability of the lamp device changes. */
    @JSName("onavailabilitychanged")
    var onavailabilitychanged_Original: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_availabilitychanged(`type`: availabilitychanged, listener: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]): Unit = js.native
  }
  
  /** Provides data for the AvailabilityChanged event. */
  @js.native
  trait LampAvailabilityChangedEventArgs extends StObject {
    
    /** Gets a value indicating whether the lamp device that triggered the event is available. */
    var isAvailable: Boolean = js.native
  }
  object LampAvailabilityChangedEventArgs {
    
    @scala.inline
    def apply(isAvailable: Boolean): LampAvailabilityChangedEventArgs = {
      val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[LampAvailabilityChangedEventArgs]
    }
    
    @scala.inline
    implicit class LampAvailabilityChangedEventArgsMutableBuilder[Self <: LampAvailabilityChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    }
  }
}
