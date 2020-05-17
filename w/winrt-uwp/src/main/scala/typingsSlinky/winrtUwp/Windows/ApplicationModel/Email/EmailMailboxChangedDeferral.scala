package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred process that will halt a thread until the deferral is complete. */
@js.native
trait EmailMailboxChangedDeferral extends js.Object {
  /** Indicates to waiting processes that the deferral is complete. */
  def complete(): Unit = js.native
}

object EmailMailboxChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): EmailMailboxChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[EmailMailboxChangedDeferral]
  }
  @scala.inline
  implicit class EmailMailboxChangedDeferralOps[Self <: EmailMailboxChangedDeferral] (val x: Self) extends AnyVal {
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

