package typingsSlinky.winrtUwp.global.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an app to override the system processing of raw keyboard input, including key combinations such as shortcut keys, access keys (or hot keys), accelerator keys, and application keys. */
@JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor")
@js.native
abstract class KeyboardDeliveryInterceptor ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor
/* static members */
@JSGlobal("Windows.UI.Input.KeyboardDeliveryInterceptor")
@js.native
object KeyboardDeliveryInterceptor extends js.Object {
  
  /**
    * Retrieves a KeyboardDeliveryInterceptor object associated with the current app view.
    * @return The KeyboardDeliveryInterceptor object associated with the current app.
    */
  def getForCurrentView(): typingsSlinky.winrtUwp.Windows.UI.Input.KeyboardDeliveryInterceptor = js.native
}
