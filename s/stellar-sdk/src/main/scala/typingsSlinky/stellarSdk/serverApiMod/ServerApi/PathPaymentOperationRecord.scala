package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.anon.Assetcode
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined amount, asset_code, asset_issuer, asset_type, from, path, source_amount, source_asset_code, source_asset_issuer, source_asset_type, source_max, to */ @js.native
trait PathPaymentOperationRecord
  extends BaseOperationRecord[
      pathPayment, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPayment
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var asset_code: js.UndefOr[String] = js.native
  
  var asset_issuer: js.UndefOr[String] = js.native
  
  var asset_type: AssetType = js.native
  
  var from: String = js.native
  
  var path: js.Array[Assetcode] = js.native
  
  var source_amount: String = js.native
  
  var source_asset_code: js.UndefOr[String] = js.native
  
  var source_asset_issuer: js.UndefOr[String] = js.native
  
  var source_asset_type: AssetType = js.native
  
  var source_max: String = js.native
  
  var to: String = js.native
}
