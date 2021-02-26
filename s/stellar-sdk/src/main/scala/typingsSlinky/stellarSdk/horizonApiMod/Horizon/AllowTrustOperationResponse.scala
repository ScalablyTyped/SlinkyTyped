package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.allowTrust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowTrustOperationResponse
  extends BaseOperationResponse[
      allowTrust, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.allowTrust
    ] {
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: AssetType = js.native
  
  var authorize: Boolean = js.native
  
  var authorize_to_maintain_liabilities: Boolean = js.native
  
  var trustee: String = js.native
  
  var trustor: String = js.native
}
object AllowTrustOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    asset_code: String,
    asset_issuer: String,
    asset_type: AssetType,
    authorize: Boolean,
    authorize_to_maintain_liabilities: Boolean,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    trustee: String,
    trustor: String,
    `type`: allowTrust,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.allowTrust
  ): AllowTrustOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], authorize = authorize.asInstanceOf[js.Any], authorize_to_maintain_liabilities = authorize_to_maintain_liabilities.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], trustee = trustee.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrustOperationResponse]
  }
  
  @scala.inline
  implicit class AllowTrustOperationResponseMutableBuilder[Self <: AllowTrustOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_type(value: AssetType): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize(value: Boolean): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize_to_maintain_liabilities(value: Boolean): Self = StObject.set(x, "authorize_to_maintain_liabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustee(value: String): Self = StObject.set(x, "trustee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrustor(value: String): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
  }
}
