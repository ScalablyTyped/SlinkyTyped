package typingsSlinky.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app suspension operation. */
trait SuspendingOperation extends js.Object {
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: js.Date
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral
}

object SuspendingOperation {
  @scala.inline
  def apply(
    deadline: js.Date,
    getDeferral: () => typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral
  ): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
}

