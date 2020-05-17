package typingsSlinky.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an app suspending operation. */
@js.native
trait SuspendingOperation extends js.Object {
  /** Gets the time remaining before a delayed app suspending operation continues. */
  var deadline: js.Date = js.native
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): SuspendingDeferral = js.native
}

object SuspendingOperation {
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => SuspendingDeferral): SuspendingOperation = {
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
    def withGetDeferral(value: () => SuspendingDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

