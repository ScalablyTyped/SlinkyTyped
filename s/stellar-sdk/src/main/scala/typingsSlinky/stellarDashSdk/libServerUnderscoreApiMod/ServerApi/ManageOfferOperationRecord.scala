package typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.manageOffer
import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.PriceR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BaseOperationResponse because Already inherited
- typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ManageOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
trait ManageOfferOperationRecord
  extends BaseOperationRecord[
      manageOffer, 
      typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.manageOffer
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

