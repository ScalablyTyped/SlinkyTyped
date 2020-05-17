package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred operation when you're supplying a source media element for Play To. */
@js.native
trait PlayToSourceDeferral extends js.Object {
  /** Ends the deferral. */
  def complete(): Unit = js.native
}

object PlayToSourceDeferral {
  @scala.inline
  def apply(complete: () => Unit): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
  @scala.inline
  implicit class PlayToSourceDeferralOps[Self <: PlayToSourceDeferral] (val x: Self) extends AnyVal {
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

