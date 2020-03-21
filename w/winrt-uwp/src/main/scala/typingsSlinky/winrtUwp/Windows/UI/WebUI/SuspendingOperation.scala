package typingsSlinky.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app suspension operation. */
@JSGlobal("Windows.UI.WebUI.SuspendingOperation")
@js.native
abstract class SuspendingOperation () extends js.Object {
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: js.Date = js.native
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
}

