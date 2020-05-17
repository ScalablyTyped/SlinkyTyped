package typingsSlinky.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed app suspending operation. */
@js.native
trait SuspendingDeferral extends js.Object {
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit = js.native
}

object SuspendingDeferral {
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
  @scala.inline
  implicit class SuspendingDeferralOps[Self <: SuspendingDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

