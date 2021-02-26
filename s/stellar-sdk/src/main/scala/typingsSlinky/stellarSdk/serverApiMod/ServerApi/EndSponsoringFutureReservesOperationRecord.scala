package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.endSponsoringFutureReserves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.EndSponsoringFutureReservesOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined begin_sponsor */ @js.native
trait EndSponsoringFutureReservesOperationRecord
  extends BaseOperationRecord[
      endSponsoringFutureReserves, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.endSponsoringFutureReserves
    ]
     with OperationRecord {
  
  var begin_sponsor: String = js.native
}
