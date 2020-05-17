package typingsSlinky.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Stores a DeferralCompletedHandler to be invoked upon completion of the deferral and manipulates the state of the deferral. */
@js.native
trait Deferral extends js.Object {
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def close(): Unit = js.native
  /** If the DeferralCompletedHandler has not yet been invoked, this will call it and drop the reference to the delegate. */
  def complete(): Unit = js.native
}

object Deferral {
  @scala.inline
  def apply(close: () => Unit, complete: () => Unit): Deferral = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Deferral]
  }
  @scala.inline
  implicit class DeferralOps[Self <: Deferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

