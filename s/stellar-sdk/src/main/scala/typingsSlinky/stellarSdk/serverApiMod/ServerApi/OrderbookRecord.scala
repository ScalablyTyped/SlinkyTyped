package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarSdk.anon.Amount
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderbookRecord
  extends BaseResponse[scala.Nothing] {
  var asks: js.Array[Amount] = js.native
  var base: Asset = js.native
  var bids: js.Array[Amount] = js.native
  var counter: Asset = js.native
}

object OrderbookRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    asks: js.Array[Amount],
    base: Asset,
    bids: js.Array[Amount],
    counter: Asset
  ): OrderbookRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asks = asks.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bids = bids.asInstanceOf[js.Any], counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderbookRecord]
  }
  @scala.inline
  implicit class OrderbookRecordOps[Self <: OrderbookRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsks(value: js.Array[Amount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBids(value: js.Array[Amount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounter(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

