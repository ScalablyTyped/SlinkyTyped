package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsSlinky.stellarSdk.horizonApiMod.Horizon.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
trait ManageDataOperationRecord
  extends BaseOperationRecord[
      manageData, 
      typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData
    ]
     with OperationRecord {
  
  var name: String = js.native
  
  var value: Buffer = js.native
}
