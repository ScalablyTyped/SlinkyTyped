package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding the data for a logical cpu execution times.
  */
@js.native
trait CPUTimes extends js.Object {
  /**
  	 * The number of milliseconds the CPU has spent in idle mode.
  	 */
  var idle: js.UndefOr[Double] = js.native
  /**
  	 * The number of milliseconds the CPU has spent in irq mode.
  	 */
  var irq: js.UndefOr[Double] = js.native
  /**
  	 * The number of milliseconds the CPU has spent in nice mode.
  	 */
  var nice: js.UndefOr[Double] = js.native
  /**
  	 * The number of milliseconds the CPU has spent in sys mode.
  	 */
  var sys: js.UndefOr[Double] = js.native
  /**
  	 * The number of milliseconds the CPU has spent in user mode.
  	 */
  var user: js.UndefOr[Double] = js.native
}

object CPUTimes {
  @scala.inline
  def apply(): CPUTimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUTimes]
  }
  @scala.inline
  implicit class CPUTimesOps[Self <: CPUTimes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle")(js.undefined)
        ret
    }
    @scala.inline
    def withIrq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIrq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("irq")(js.undefined)
        ret
    }
    @scala.inline
    def withNice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(js.undefined)
        ret
    }
    @scala.inline
    def withSys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

