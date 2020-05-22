package typingsSlinky.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an app suspending operation. */
trait SuspendingOperation extends js.Object {
  /** Gets the time remaining before a delayed app suspending operation continues. */
  var deadline: js.Date
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): SuspendingDeferral
}

object SuspendingOperation {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
}

