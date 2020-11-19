package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.accountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
trait AccountMergeOperationRecord
  extends BaseOperationRecord[
      accountMerge, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.accountMerge
    ]
     with OperationRecord {
  
  var into: String = js.native
}
