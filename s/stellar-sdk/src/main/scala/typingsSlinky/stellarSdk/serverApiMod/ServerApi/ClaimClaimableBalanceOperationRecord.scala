package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.claimClaimableBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.ClaimClaimableBalanceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined balance_id, claimant */ @js.native
trait ClaimClaimableBalanceOperationRecord
  extends BaseOperationRecord[
      claimClaimableBalance, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.claimClaimableBalance
    ]
     with OperationRecord {
  
  var balance_id: String = js.native
  
  var claimant: String = js.native
}
