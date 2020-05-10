package typingsSlinky.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalReport extends js.Object {
  var counters: js.UndefOr[js.Array[SignalMetric]] = js.native
  var cumulative_counters: js.UndefOr[js.Array[SignalMetric]] = js.native
  var gauges: js.UndefOr[js.Array[SignalMetric]] = js.native
}

object SignalReport {
  @scala.inline
  def apply(): SignalReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalReport]
  }
  @scala.inline
  implicit class SignalReportOps[Self <: SignalReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounters(value: js.Array[SignalMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counters")(js.undefined)
        ret
    }
    @scala.inline
    def withCumulative_counters(value: js.Array[SignalMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative_counters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCumulative_counters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative_counters")(js.undefined)
        ret
    }
    @scala.inline
    def withGauges(value: js.Array[SignalMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGauges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gauges")(js.undefined)
        ret
    }
  }
  
}

