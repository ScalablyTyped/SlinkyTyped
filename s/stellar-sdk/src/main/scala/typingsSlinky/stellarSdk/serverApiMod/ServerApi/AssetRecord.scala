package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType.credit12
import typingsSlinky.stellarBase.mod.AssetType.credit4
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetRecord
  extends BaseResponse[scala.Nothing] {
  var amount: String = js.native
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: credit4 | credit12 = js.native
  var flags: Flags = js.native
  var num_accounts: Double = js.native
  var paging_token: String = js.native
}

object AssetRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    asset_code: String,
    asset_issuer: String,
    asset_type: credit4 | credit12,
    flags: Flags,
    num_accounts: Double,
    paging_token: String
  ): AssetRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], num_accounts = num_accounts.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetRecord]
  }
  @scala.inline
  implicit class AssetRecordOps[Self <: AssetRecord] (val x: Self) extends AnyVal {
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
    def withAsset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_type(value: credit4 | credit12): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Flags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_accounts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

