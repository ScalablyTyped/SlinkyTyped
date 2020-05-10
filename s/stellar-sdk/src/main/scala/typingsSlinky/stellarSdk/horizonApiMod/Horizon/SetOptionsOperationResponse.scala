package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.setOptions
import typingsSlinky.stellarSdk.stellarSdkNumbers.`1`
import typingsSlinky.stellarSdk.stellarSdkNumbers.`2`
import typingsSlinky.stellarSdk.stellarSdkStrings.auth_required_flag
import typingsSlinky.stellarSdk.stellarSdkStrings.auth_revocable_flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptionsOperationResponse
  extends BaseOperationResponse[
      setOptions, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
    ] {
  var clear_flags: js.Array[`1` | `2`] = js.native
  var clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
  var high_threshold: js.UndefOr[Double] = js.native
  var home_domain: js.UndefOr[String] = js.native
  var low_threshold: js.UndefOr[Double] = js.native
  var master_key_weight: js.UndefOr[Double] = js.native
  var med_threshold: js.UndefOr[Double] = js.native
  var set_flags: js.Array[`1` | `2`] = js.native
  var set_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
  var signer_key: js.UndefOr[String] = js.native
  var signer_weight: js.UndefOr[Double] = js.native
}

object SetOptionsOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    clear_flags: js.Array[`1` | `2`],
    clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    created_at: String,
    id: String,
    paging_token: String,
    set_flags: js.Array[`1` | `2`],
    set_flags_s: js.Array[auth_required_flag | auth_revocable_flag],
    source_account: String,
    transaction_hash: String,
    `type`: setOptions,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.setOptions
  ): SetOptionsOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], clear_flags = clear_flags.asInstanceOf[js.Any], clear_flags_s = clear_flags_s.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], set_flags = set_flags.asInstanceOf[js.Any], set_flags_s = set_flags_s.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptionsOperationResponse]
  }
  @scala.inline
  implicit class SetOptionsOperationResponseOps[Self <: SetOptionsOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear_flags(value: js.Array[`1` | `2`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear_flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear_flags_s(value: js.Array[auth_required_flag | auth_revocable_flag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear_flags_s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet_flags(value: js.Array[`1` | `2`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet_flags_s(value: js.Array[auth_required_flag | auth_revocable_flag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_flags_s")(value.asInstanceOf[js.Any])
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
    def withMaster_key_weight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_key_weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster_key_weight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_key_weight")(js.undefined)
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
    def withSigner_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_key")(js.undefined)
        ret
    }
    @scala.inline
    def withSigner_weight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner_weight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_weight")(js.undefined)
        ret
    }
  }
  
}

