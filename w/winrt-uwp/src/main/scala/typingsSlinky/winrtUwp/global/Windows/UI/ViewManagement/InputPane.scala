package typingsSlinky.winrtUwp.global.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to register to receive notifications when the input pane is about to be displayed or hidden, and to determine which portion of the application's window is being obscured by the input pane. */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
abstract class InputPane ()
  extends typingsSlinky.winrtUwp.Windows.UI.ViewManagement.InputPane

/* static members */
@JSGlobal("Windows.UI.ViewManagement.InputPane")
@js.native
object InputPane extends js.Object {
  /**
    * Gets the InputPane object associated with the application window that is currently visible.
    * @return The input pane.
    */
  def getForCurrentView(): typingsSlinky.winrtUwp.Windows.UI.ViewManagement.InputPane = js.native
}

