package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.stellarSdkStrings.effects
import typingsSlinky.stellarSdk.stellarSdkStrings.precedes
import typingsSlinky.stellarSdk.stellarSdkStrings.succeeds
import typingsSlinky.stellarSdk.stellarSdkStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseResponse[succeeds | precedes | effects | transaction] {
  var created_at: String = js.native
  var id: String = js.native
  var paging_token: String = js.native
  var source_account: String = js.native
  var transaction_hash: String = js.native
  var `type`: T = js.native
  var type_i: TI = js.native
}

object BaseOperationResponse {
  @scala.inline
  def apply[T, TI](
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: T,
    type_i: TI
  ): BaseOperationResponse[T, TI] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperationResponse[T, TI]]
  }
  @scala.inline
  implicit class BaseOperationResponseOps[Self[t, ti] <: BaseOperationResponse[t, ti], T, TI] (val x: Self[T, TI]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TI] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TI]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TI]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TI]) with Other]
    @scala.inline
    def withCreated_at(value: String): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaging_token(value: String): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_account(value: String): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransaction_hash(value: String): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType_i(value: TI): Self[T, TI] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_i")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

