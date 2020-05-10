package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.PriceRShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String = js.native
  var buying: OfferAsset = js.native
  var id: Double | String = js.native
  var last_modified_ledger: Double = js.native
  var last_modified_time: String = js.native
  var paging_token: String = js.native
  var price: String = js.native
  var price_r: PriceRShorthand = js.native
  var seller: String = js.native
  var selling: OfferAsset = js.native
}

object OfferRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    buying: OfferAsset,
    id: Double | String,
    last_modified_ledger: Double,
    last_modified_time: String,
    paging_token: String,
    price: String,
    price_r: PriceRShorthand,
    seller: String,
    selling: OfferAsset
  ): OfferRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], last_modified_time = last_modified_time.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferRecord]
  }
  @scala.inline
  implicit class OfferRecordOps[Self <: OfferRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuying(value: OfferAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_modified_ledger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_modified_ledger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_modified_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_modified_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice_r(value: PriceRShorthand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeller(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling(value: OfferAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

