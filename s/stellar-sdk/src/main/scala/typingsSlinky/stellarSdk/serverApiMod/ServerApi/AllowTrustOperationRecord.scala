package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.allowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.AllowTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, authorize, authorize_to_maintain_liabilities, trustee, trustor */ @js.native
trait AllowTrustOperationRecord
  extends BaseOperationRecord[
      allowTrust, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.allowTrust
    ]
     with OperationRecord {
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: AssetType = js.native
  
  var authorize: Boolean = js.native
  
  var authorize_to_maintain_liabilities: Boolean = js.native
  
  var trustee: String = js.native
  
  var trustor: String = js.native
}
