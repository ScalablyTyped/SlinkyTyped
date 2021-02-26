package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.Claimant
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createClaimableBalance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.CreateClaimableBalanceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset, amount, sponsor, claimants */ @js.native
trait CreateClaimableBalanceOperationRecord
  extends BaseOperationRecord[
      createClaimableBalance, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createClaimableBalance
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var asset: String = js.native
  
  var claimants: js.Array[Claimant] = js.native
  
  var sponsor: String = js.native
}
