package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.beginSponsoringFutureReserves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BeginSponsoringFutureReservesOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined sponsored_id */ @js.native
trait BeginSponsoringFutureReservesOperationRecord
  extends BaseOperationRecord[
      beginSponsoringFutureReserves, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.beginSponsoringFutureReserves
    ]
     with OperationRecord {
  
  var sponsored_id: String = js.native
}
