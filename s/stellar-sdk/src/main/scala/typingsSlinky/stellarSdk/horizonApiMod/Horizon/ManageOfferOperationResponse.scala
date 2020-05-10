package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageOffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageOfferOperationResponse
  extends BaseOperationResponse[
      manageOffer, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
    ] {
  var amount: String = js.native
  var buying_asset_code: js.UndefOr[String] = js.native
  var buying_asset_issuer: js.UndefOr[String] = js.native
  var buying_asset_type: AssetType = js.native
  var offer_id: Double | String = js.native
  var price: String = js.native
  var price_r: PriceR = js.native
  var selling_asset_code: js.UndefOr[String] = js.native
  var selling_asset_issuer: js.UndefOr[String] = js.native
  var selling_asset_type: AssetType = js.native
}

object ManageOfferOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    buying_asset_type: AssetType,
    created_at: String,
    id: String,
    offer_id: Double | String,
    paging_token: String,
    price: String,
    price_r: PriceR,
    selling_asset_type: AssetType,
    source_account: String,
    transaction_hash: String,
    `type`: manageOffer,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageOffer
  ): ManageOfferOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying_asset_type = buying_asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], offer_id = offer_id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], selling_asset_type = selling_asset_type.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageOfferOperationResponse]
  }
  @scala.inline
  implicit class ManageOfferOperationResponseOps[Self <: ManageOfferOperationResponse] (val x: Self) extends AnyVal {
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
    def withBuying_asset_type(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffer_id(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice_r(value: PriceR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price_r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelling_asset_type(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuying_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuying_asset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withBuying_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuying_asset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buying_asset_issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withSelling_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelling_asset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withSelling_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelling_asset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selling_asset_issuer")(js.undefined)
        ret
    }
  }
  
}

