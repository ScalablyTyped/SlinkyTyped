package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.bumpSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpSequenceOperationResponse
  extends BaseOperationResponse[
      bumpSequence, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.bumpSequence
    ] {
  
  var bump_to: String = js.native
}
object BumpSequenceOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    bump_to: String,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: bumpSequence,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.bumpSequence
  ): BumpSequenceOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], bump_to = bump_to.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpSequenceOperationResponse]
  }
  
  @scala.inline
  implicit class BumpSequenceOperationResponseMutableBuilder[Self <: BumpSequenceOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBump_to(value: String): Self = StObject.set(x, "bump_to", value.asInstanceOf[js.Any])
  }
}
