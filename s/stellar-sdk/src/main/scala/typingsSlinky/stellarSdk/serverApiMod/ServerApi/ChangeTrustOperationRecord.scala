package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType.credit12
import typingsSlinky.stellarBase.mod.AssetType.credit4
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.changeTrust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.ChangeTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, trustee, trustor, limit */ @js.native
trait ChangeTrustOperationRecord
  extends BaseOperationRecord[
      changeTrust, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.changeTrust
    ]
     with OperationRecord {
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: credit4 | credit12 = js.native
  
  var limit: String = js.native
  
  var trustee: String = js.native
  
  var trustor: String = js.native
}
