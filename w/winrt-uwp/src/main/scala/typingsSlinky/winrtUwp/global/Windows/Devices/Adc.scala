package typingsSlinky.winrtUwp.global.Windows.Devices

import typingsSlinky.winrtUwp.Windows.Devices.Adc.Provider.IAdcProvider
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Analog-Digital Converter, or ADC, is an electrical component that converts an analog electrical signal (usually voltage) to a digital representation. ADCs usually interface a digital circuit that processes signals from analog world. */
@JSGlobal("Windows.Devices.Adc")
@js.native
object Adc extends js.Object {
  
  /** Represents a single ADC channel. */
  @js.native
  abstract class AdcChannel ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcChannel
  
  /** Describes the channel modes that the ADC controller can use for input. */
  @js.native
  object AdcChannelMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcChannelMode with Double] = js.native
    
    /* 1 */ val differential: typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcChannelMode.differential with Double = js.native
    
    /* 0 */ val singleEnded: typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcChannelMode.singleEnded with Double = js.native
  }
  
  /** Represents an ADC controller on the system */
  @js.native
  abstract class AdcController ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcController
  /* static members */
  @js.native
  object AdcController extends js.Object {
    
    /**
      * Gets all the controllers that are connected to the system asynchronously .
      * @param provider The ADC provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the controllers available on the system.
      */
    def getControllersAsync(provider: IAdcProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets the default ADC controller on the system.
      * @return The default ADC controller on the system, or null if the system has no ADC controller.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.Adc.AdcController] = js.native
  }
  
  /** This API exposes a Provider interface for the user to implement for a specific controller. The ADC API needs a ADC Provider implementation to talk to the ADC controller. */
  @js.native
  object Provider extends js.Object {
    
    /** Determines how the pin value is represented. Implementation of specifics are decided by the provider, so differential may be fully or pseudo differential. */
    @js.native
    object ProviderAdcChannelMode extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode with Double
          ] = js.native
      
      /* 1 */ val differential: typingsSlinky.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.differential with Double = js.native
      
      /* 0 */ val singleEnded: typingsSlinky.winrtUwp.Windows.Devices.Adc.Provider.ProviderAdcChannelMode.singleEnded with Double = js.native
    }
  }
}
