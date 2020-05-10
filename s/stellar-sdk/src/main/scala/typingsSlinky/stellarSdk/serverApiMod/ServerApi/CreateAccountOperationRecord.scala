package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.CreateAccountOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined account, funder, starting_balance */ @js.native
trait CreateAccountOperationRecord
  extends BaseOperationRecord[
      createAccount, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
    ]
     with OperationRecord {
  var account: String = js.native
  var funder: String = js.native
  var starting_balance: String = js.native
}

