package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task. */
@js.native
trait PrintTaskRequestedDeferral extends js.Object {
  /** Indicates when the deferral for the print task request is over. */
  def complete(): Unit = js.native
}

object PrintTaskRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskRequestedDeferral]
  }
  @scala.inline
  implicit class PrintTaskRequestedDeferralOps[Self <: PrintTaskRequestedDeferral] (val x: Self) extends AnyVal {
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

