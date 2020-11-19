package typingsSlinky.winrt.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Printers")
@js.native
object Printers extends js.Object {
  
  @js.native
  object Extensions extends js.Object {
    
    @js.native
    class PrintExtensionContext ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintExtensionContext
    /* static members */
    @js.native
    object PrintExtensionContext extends js.Object {
      
      def fromDeviceId(deviceId: String): js.Any = js.native
    }
    
    @js.native
    class PrintNotificationEventDetails ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails
    
    @js.native
    class PrintTaskConfiguration ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
    
    @js.native
    class PrintTaskConfigurationSaveRequest ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest
    
    @js.native
    class PrintTaskConfigurationSaveRequestedDeferral ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral
    
    @js.native
    class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends typingsSlinky.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs
  }
}
