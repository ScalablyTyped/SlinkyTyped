package typingsSlinky.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app suspension operation. */
@js.native
trait SuspendingOperation extends js.Object {
  /** Gets the time remaining before a delayed app suspension operation continues. */
  var deadline: js.Date = js.native
  /**
    * Requests that the app suspension operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral = js.native
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
  @scala.inline
  implicit class SuspendingOperationOps[Self <: SuspendingOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => typingsSlinky.winrtUwp.Windows.ApplicationModel.SuspendingDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

