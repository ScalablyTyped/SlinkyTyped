package typingsSlinky.stellarSdk.tradeAggregationCallBuilderMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TradeAggregationRecord
  extends BaseResponse[scala.Nothing] {
  var avg: String = js.native
  var base_volume: String = js.native
  var close: String = js.native
  var counter_volume: String = js.native
  var high: String = js.native
  var low: String = js.native
  var open: String = js.native
  var timestamp: Double | String = js.native
  var trade_count: Double | String = js.native
}

object TradeAggregationRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    avg: String,
    base_volume: String,
    close: String,
    counter_volume: String,
    high: String,
    low: String,
    open: String,
    timestamp: Double | String,
    trade_count: Double | String
  ): TradeAggregationRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], base_volume = base_volume.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], counter_volume = counter_volume.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trade_count = trade_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TradeAggregationRecord]
  }
  @scala.inline
  implicit class TradeAggregationRecordOps[Self <: TradeAggregationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_volume(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounter_volume(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter_volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHigh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrade_count(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trade_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

