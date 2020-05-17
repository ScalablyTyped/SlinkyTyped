package typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
@js.native
trait TargetFileRequestDeferral extends js.Object {
  /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
  def complete(): Unit = js.native
}

object TargetFileRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): TargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TargetFileRequestDeferral]
  }
  @scala.inline
  implicit class TargetFileRequestDeferralOps[Self <: TargetFileRequestDeferral] (val x: Self) extends AnyVal {
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

