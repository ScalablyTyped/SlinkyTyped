package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeeStatsResponse extends js.Object {
  var last_ledger: String = js.native
  var last_ledger_base_fee: String = js.native
  var ledger_capacity_usage: String = js.native
  var min_accepted_fee: String = js.native
  var mode_accepted_fee: String = js.native
  var p10_accepted_fee: String = js.native
  var p20_accepted_fee: String = js.native
  var p30_accepted_fee: String = js.native
  var p40_accepted_fee: String = js.native
  var p50_accepted_fee: String = js.native
  var p60_accepted_fee: String = js.native
  var p70_accepted_fee: String = js.native
  var p80_accepted_fee: String = js.native
  var p90_accepted_fee: String = js.native
  var p95_accepted_fee: String = js.native
  var p99_accepted_fee: String = js.native
}

object FeeStatsResponse {
  @scala.inline
  def apply(
    last_ledger: String,
    last_ledger_base_fee: String,
    ledger_capacity_usage: String,
    min_accepted_fee: String,
    mode_accepted_fee: String,
    p10_accepted_fee: String,
    p20_accepted_fee: String,
    p30_accepted_fee: String,
    p40_accepted_fee: String,
    p50_accepted_fee: String,
    p60_accepted_fee: String,
    p70_accepted_fee: String,
    p80_accepted_fee: String,
    p90_accepted_fee: String,
    p95_accepted_fee: String,
    p99_accepted_fee: String
  ): FeeStatsResponse = {
    val __obj = js.Dynamic.literal(last_ledger = last_ledger.asInstanceOf[js.Any], last_ledger_base_fee = last_ledger_base_fee.asInstanceOf[js.Any], ledger_capacity_usage = ledger_capacity_usage.asInstanceOf[js.Any], min_accepted_fee = min_accepted_fee.asInstanceOf[js.Any], mode_accepted_fee = mode_accepted_fee.asInstanceOf[js.Any], p10_accepted_fee = p10_accepted_fee.asInstanceOf[js.Any], p20_accepted_fee = p20_accepted_fee.asInstanceOf[js.Any], p30_accepted_fee = p30_accepted_fee.asInstanceOf[js.Any], p40_accepted_fee = p40_accepted_fee.asInstanceOf[js.Any], p50_accepted_fee = p50_accepted_fee.asInstanceOf[js.Any], p60_accepted_fee = p60_accepted_fee.asInstanceOf[js.Any], p70_accepted_fee = p70_accepted_fee.asInstanceOf[js.Any], p80_accepted_fee = p80_accepted_fee.asInstanceOf[js.Any], p90_accepted_fee = p90_accepted_fee.asInstanceOf[js.Any], p95_accepted_fee = p95_accepted_fee.asInstanceOf[js.Any], p99_accepted_fee = p99_accepted_fee.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeStatsResponse]
  }
  @scala.inline
  implicit class FeeStatsResponseOps[Self <: FeeStatsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLast_ledger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_ledger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_ledger_base_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_ledger_base_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLedger_capacity_usage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledger_capacity_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP10_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p10_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP20_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p20_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP30_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p30_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP40_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p40_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP50_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p50_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP60_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p60_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP70_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p70_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP80_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p80_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP90_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p90_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP95_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p95_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP99_accepted_fee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99_accepted_fee")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

