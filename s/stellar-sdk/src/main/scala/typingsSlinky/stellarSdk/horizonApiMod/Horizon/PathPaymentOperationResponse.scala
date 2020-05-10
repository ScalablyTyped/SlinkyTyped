package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentOperationResponse
  extends BaseOperationResponse[
      pathPayment, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPayment
    ] {
  var amount: String = js.native
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: AssetType = js.native
  var from: String = js.native
  var source_amount: String = js.native
  var source_asset_code: js.UndefOr[String] = js.native
  var source_asset_issuer: js.UndefOr[String] = js.native
  var source_asset_type: AssetType = js.native
  var source_max: String = js.native
  var to: String = js.native
}

object PathPaymentOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    asset_type: AssetType,
    created_at: String,
    from: String,
    id: String,
    paging_token: String,
    source_account: String,
    source_amount: String,
    source_asset_type: AssetType,
    source_max: String,
    to: String,
    transaction_hash: String,
    `type`: pathPayment,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPayment
  ): PathPaymentOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any], source_max = source_max.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentOperationResponse]
  }
  @scala.inline
  implicit class PathPaymentOperationResponseOps[Self <: PathPaymentOperationResponse] (val x: Self) extends AnyVal {
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
    def withAsset_type(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_asset_type(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_max(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withAsset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_asset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_asset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_issuer")(js.undefined)
        ret
    }
  }
  
}

