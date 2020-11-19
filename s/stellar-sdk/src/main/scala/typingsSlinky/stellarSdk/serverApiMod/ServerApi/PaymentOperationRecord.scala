package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.payment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.PaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount */ @js.native
trait PaymentOperationRecord
  extends BaseOperationRecord[
      payment, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.payment
    ]
     with OperationRecord {
  
  var amount: String = js.native
  
  var asset_code: js.UndefOr[String] = js.native
  
  var asset_issuer: js.UndefOr[String] = js.native
  
  var asset_type: AssetType = js.native
  
  var from: String = js.native
  
  def receiver(): js.Promise[AccountRecord] = js.native
  @JSName("receiver")
  var receiver_Original: CallFunction[AccountRecord] = js.native
  
  def sender(): js.Promise[AccountRecord] = js.native
  @JSName("sender")
  var sender_Original: CallFunction[AccountRecord] = js.native
  
  var to: String = js.native
}
