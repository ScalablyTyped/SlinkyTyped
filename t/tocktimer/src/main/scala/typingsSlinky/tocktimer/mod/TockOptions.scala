package typingsSlinky.tocktimer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TockOptions extends js.Object {
  /**
    * Defaults to false. If true, the clock will count down from a given time, otherwise it will count up from 0:00.
    */
  var countdown: js.UndefOr[Boolean] = js.native
  /**
    * Defaults to 10 milliseconds. How often, in milliseconds, that the clock will tick.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Callback function executed on each tick
    */
  def callback(): Unit = js.native
  /**
    * Callback function executed when the timer is complete
    */
  def complete(): Unit = js.native
}

object TockOptions {
  @scala.inline
  def apply(callback: () => Unit, complete: () => Unit): TockOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TockOptions]
  }
  @scala.inline
  implicit class TockOptionsOps[Self <: TockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCountdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countdown")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
  }
  
}

