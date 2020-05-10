package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectRecord
  extends BaseResponse[scala.Nothing] {
  var account: String = js.native
  var amount: js.UndefOr[js.Any] = js.native
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: js.UndefOr[String] = js.native
  var auth_required_flag: js.UndefOr[Boolean] = js.native
  var auth_revokable_flag: js.UndefOr[Boolean] = js.native
  var bought_amount: js.UndefOr[String] = js.native
  var bought_asset_code: js.UndefOr[String] = js.native
  var bought_asset_issuer: js.UndefOr[String] = js.native
  var bought_asset_type: js.UndefOr[String] = js.native
  var created_at: String = js.native
  var high_threshold: js.UndefOr[Double] = js.native
  var home_domain: js.UndefOr[String] = js.native
  var id: String = js.native
  var key: js.UndefOr[String] = js.native
  var limit: js.UndefOr[String] = js.native
  var low_threshold: js.UndefOr[Double] = js.native
  var med_threshold: js.UndefOr[Double] = js.native
  var new_seq: js.UndefOr[Double | String] = js.native
  var offer_id: js.UndefOr[Double | String] = js.native
  var operation: js.UndefOr[CallFunction[OperationRecord]] = js.native
  var paging_token: String = js.native
  var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.native
  var public_key: js.UndefOr[String] = js.native
  var sold_amount: js.UndefOr[String] = js.native
  var sold_asset_code: js.UndefOr[String] = js.native
  var sold_asset_issuer: js.UndefOr[String] = js.native
  var sold_asset_type: js.UndefOr[String] = js.native
  var starting_balance: js.UndefOr[String] = js.native
  var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.native
  var trustor: js.UndefOr[String] = js.native
  var `type`: String = js.native
  var type_i: String = js.native
  var weight: js.UndefOr[Double] = js.native
}

object EffectRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    account: String,
    created_at: String,
    id: String,
    paging_token: String,
    `type`: String,
    type_i: String
  ): EffectRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectRecord]
  }
  @scala.inline
  implicit class EffectRecordOps[Self <: EffectRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType_i(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
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
    def withAsset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_required_flag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_required_flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_required_flag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_required_flag")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth_revokable_flag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_revokable_flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth_revokable_flag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_revokable_flag")(js.undefined)
        ret
    }
    @scala.inline
    def withBought_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBought_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withBought_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBought_asset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withBought_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBought_asset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withBought_asset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBought_asset_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bought_asset_type")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHome_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHome_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("home_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLow_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMed_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("med_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMed_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("med_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_seq(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_seq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_seq")(js.undefined)
        ret
    }
    @scala.inline
    def withOffer_id(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offer_id")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: () => js.Promise[OperationRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecedes(value: () => js.Promise[EffectRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPrecedes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedes")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key")(js.undefined)
        ret
    }
    @scala.inline
    def withSold_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSold_amount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_amount")(js.undefined)
        ret
    }
    @scala.inline
    def withSold_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSold_asset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withSold_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSold_asset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withSold_asset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSold_asset_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sold_asset_type")(js.undefined)
        ret
    }
    @scala.inline
    def withStarting_balance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarting_balance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starting_balance")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceeds(value: () => js.Promise[EffectRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSucceeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeds")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustor")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

