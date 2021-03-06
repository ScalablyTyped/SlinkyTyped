package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.claimClaimableBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimClaimableBalanceOperationResponse
  extends BaseOperationResponse[
      claimClaimableBalance, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.claimClaimableBalance
    ] {
  
  var balance_id: String = js.native
  
  var claimant: String = js.native
}
object ClaimClaimableBalanceOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    balance_id: String,
    claimant: String,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: claimClaimableBalance,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.claimClaimableBalance
  ): ClaimClaimableBalanceOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], balance_id = balance_id.asInstanceOf[js.Any], claimant = claimant.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimClaimableBalanceOperationResponse]
  }
  
  @scala.inline
  implicit class ClaimClaimableBalanceOperationResponseMutableBuilder[Self <: ClaimClaimableBalanceOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalance_id(value: String): Self = StObject.set(x, "balance_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimant(value: String): Self = StObject.set(x, "claimant", value.asInstanceOf[js.Any])
  }
}
