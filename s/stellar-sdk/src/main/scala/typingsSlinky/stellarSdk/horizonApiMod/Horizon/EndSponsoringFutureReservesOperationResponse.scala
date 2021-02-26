package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.endSponsoringFutureReserves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndSponsoringFutureReservesOperationResponse
  extends BaseOperationResponse[
      endSponsoringFutureReserves, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.endSponsoringFutureReserves
    ] {
  
  var begin_sponsor: String = js.native
}
object EndSponsoringFutureReservesOperationResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    begin_sponsor: String,
    created_at: String,
    id: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: endSponsoringFutureReserves,
    type_i: typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.endSponsoringFutureReserves
  ): EndSponsoringFutureReservesOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], begin_sponsor = begin_sponsor.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSponsoringFutureReservesOperationResponse]
  }
  
  @scala.inline
  implicit class EndSponsoringFutureReservesOperationResponseMutableBuilder[Self <: EndSponsoringFutureReservesOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin_sponsor(value: String): Self = StObject.set(x, "begin_sponsor", value.asInstanceOf[js.Any])
  }
}
