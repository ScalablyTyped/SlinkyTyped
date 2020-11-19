package typingsSlinky.winrtUwp.global.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.UI.WebUI.IWebUIBackgroundTaskInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an instance of a background task that has been triggered to run. */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
abstract class WebUIBackgroundTaskInstance ()
  extends typingsSlinky.winrtUwp.Windows.UI.WebUI.WebUIBackgroundTaskInstance
/* static members */
@JSGlobal("Windows.UI.WebUI.WebUIBackgroundTaskInstance")
@js.native
object WebUIBackgroundTaskInstance extends js.Object {
  
  /** Gets the current background task. */
  var current: IWebUIBackgroundTaskInstance = js.native
}
