package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createPassiveOffer
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.PriceR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.PassiveOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
trait PassiveOfferOperationRecord
  extends BaseOperationRecord[
      createPassiveOffer, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createPassiveOffer
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var buying_asset_code: js.UndefOr[String] = js.native
  
  var buying_asset_issuer: js.UndefOr[String] = js.native
  
  var buying_asset_type: AssetType = js.native
  
  var offer_id: Double | String = js.native
  
  var price: String = js.native
  
  var price_r: PriceR = js.native
  
  var selling_asset_code: js.UndefOr[String] = js.native
  
  var selling_asset_issuer: js.UndefOr[String] = js.native
  
  var selling_asset_type: AssetType = js.native
}
