package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.stellarSdkStrings.effects
import typingsSlinky.stellarSdk.stellarSdkStrings.precedes
import typingsSlinky.stellarSdk.stellarSdkStrings.succeeds
import typingsSlinky.stellarSdk.stellarSdkStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseResponse[succeeds | precedes | effects | transaction] {
  var created_at: String
  var id: String
  var paging_token: String
  var source_account: String
  var transaction_hash: String
  var `type`: T
  var type_i: TI
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
}

