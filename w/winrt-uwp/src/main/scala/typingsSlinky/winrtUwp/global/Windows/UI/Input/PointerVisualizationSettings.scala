package typingsSlinky.winrtUwp.global.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the visual feedback settings for pointer input. */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
abstract class PointerVisualizationSettings ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.PointerVisualizationSettings
/* static members */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
object PointerVisualizationSettings extends js.Object {
  
  /**
    * Gets a PointerVisualizationSettings object associated with the current app.
    * @return The PointerVisualizationSettings object associated with the current app.
    */
  def getForCurrentView(): typingsSlinky.winrtUwp.Windows.UI.Input.PointerVisualizationSettings = js.native
}
