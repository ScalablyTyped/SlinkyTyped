package typingsSlinky.winrtUwp.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Devices.Pwm")
@js.native
object Pwm extends js.Object {
  
  @js.native
  abstract class PwmController ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Pwm.PwmController
  /* static members */
  @js.native
  object PwmController extends js.Object {
    
    var getControllersAsync: js.Any = js.native
    
     /* unmapped type */ var getDefaultAsync: js.Any = js.native
  }
  
  @js.native
  abstract class PwmPin ()
    extends typingsSlinky.winrtUwp.Windows.Devices.Pwm.PwmPin
  
  @js.native
  object PwmPulsePolarity extends js.Object {
    
    var activeHigh: js.Any = js.native
    
    var activeLow: js.Any = js.native
  }
}
