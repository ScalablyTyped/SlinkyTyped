package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.anon.Assetcode
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPaymentStrictSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathPaymentStrictSendOperationResponse
  extends BaseOperationResponse[
      pathPaymentStrictSend, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPaymentStrictSend
    ] {
  
  var amount: String = js.native
  
  var asset_code: js.UndefOr[String] = js.native
  
  var asset_issuer: js.UndefOr[String] = js.native
  
  var asset_type: AssetType = js.native
  
  var destination_min: String = js.native
  
  var from: String = js.native
  
  var path: js.Array[Assetcode] = js.native
  
  var source_amount: String = js.native
  
  var source_asset_code: js.UndefOr[String] = js.native
  
  var source_asset_issuer: js.UndefOr[String] = js.native
  
  var source_asset_type: AssetType = js.native
  
  var to: String = js.native
}
object PathPaymentStrictSendOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    asset_type: AssetType,
    created_at: String,
    destination_min: String,
    from: String,
    id: String,
    paging_token: String,
    path: js.Array[Assetcode],
    source_account: String,
    source_amount: String,
    source_asset_type: AssetType,
    to: String,
    transaction_hash: String,
    `type`: pathPaymentStrictSend,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPaymentStrictSend
  ): PathPaymentStrictSendOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], destination_min = destination_min.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSendOperationResponse]
  }
  
  @scala.inline
  implicit class PathPaymentStrictSendOperationResponseMutableBuilder[Self <: PathPaymentStrictSendOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_codeUndefined: Self = StObject.set(x, "asset_code", js.undefined)
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuerUndefined: Self = StObject.set(x, "asset_issuer", js.undefined)
    
    @scala.inline
    def setAsset_type(value: AssetType): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_min(value: String): Self = StObject.set(x, "destination_min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Assetcode]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Assetcode*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSource_amount(value: String): Self = StObject.set(x, "source_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_code(value: String): Self = StObject.set(x, "source_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_codeUndefined: Self = StObject.set(x, "source_asset_code", js.undefined)
    
    @scala.inline
    def setSource_asset_issuer(value: String): Self = StObject.set(x, "source_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_issuerUndefined: Self = StObject.set(x, "source_asset_issuer", js.undefined)
    
    @scala.inline
    def setSource_asset_type(value: AssetType): Self = StObject.set(x, "source_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
