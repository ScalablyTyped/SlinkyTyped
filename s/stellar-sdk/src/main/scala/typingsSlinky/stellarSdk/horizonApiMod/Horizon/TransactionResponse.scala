package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarSdk.stellarSdkStrings.account
import typingsSlinky.stellarSdk.stellarSdkStrings.effects
import typingsSlinky.stellarSdk.stellarSdkStrings.ledger
import typingsSlinky.stellarSdk.stellarSdkStrings.operations
import typingsSlinky.stellarSdk.stellarSdkStrings.precedes
import typingsSlinky.stellarSdk.stellarSdkStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionResponse
  extends SubmitTransactionResponse
     with BaseResponse[account | ledger | operations | effects | succeeds | precedes] {
  var created_at: String = js.native
  var fee_charged: Double = js.native
  var fee_meta_xdr: String = js.native
  var fee_paid: Double = js.native
  var id: String = js.native
  var max_fee: Double = js.native
  var memo: js.UndefOr[String] = js.native
  var memo_type: MemoType = js.native
  var operation_count: Double = js.native
  var paging_token: String = js.native
  var signatures: js.Array[String] = js.native
  var source_account: String = js.native
  var source_account_sequence: String = js.native
}

object TransactionResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    envelope_xdr: String,
    fee_charged: Double,
    fee_meta_xdr: String,
    fee_paid: Double,
    hash: String,
    id: String,
    ledger: Double,
    max_fee: Double,
    memo_type: MemoType,
    operation_count: Double,
    paging_token: String,
    result_meta_xdr: String,
    result_xdr: String,
    signatures: js.Array[String],
    source_account: String,
    source_account_sequence: String
  ): TransactionResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], envelope_xdr = envelope_xdr.asInstanceOf[js.Any], fee_charged = fee_charged.asInstanceOf[js.Any], fee_meta_xdr = fee_meta_xdr.asInstanceOf[js.Any], fee_paid = fee_paid.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any], memo_type = memo_type.asInstanceOf[js.Any], operation_count = operation_count.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_account_sequence = source_account_sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionResponse]
  }
  @scala.inline
  implicit class TransactionResponseOps[Self <: TransactionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFee_charged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee_charged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFee_meta_xdr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee_meta_xdr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFee_paid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee_paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_fee(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemo_type(value: MemoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_account(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_account_sequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_account_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memo")(js.undefined)
        ret
    }
  }
  
}

