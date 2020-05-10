package typingsSlinky.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolTimer extends js.Object {
  var delay: Double = js.native
  var period: Double = js.native
  def cancel(): Unit = js.native
}

object IThreadPoolTimer {
  @scala.inline
  def apply(cancel: () => Unit, delay: Double, period: Double): IThreadPoolTimer = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThreadPoolTimer]
  }
  @scala.inline
  implicit class IThreadPoolTimerOps[Self <: IThreadPoolTimer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

