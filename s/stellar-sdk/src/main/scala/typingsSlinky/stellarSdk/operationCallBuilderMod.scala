package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OperationRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/operation_call_builder", JSImport.Namespace)
@js.native
object operationCallBuilderMod extends js.Object {
  
  @js.native
  class OperationCallBuilder protected () extends CallBuilder[CollectionPage[OperationRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forAccount(accountId: String): this.type = js.native
    
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    
    def forTransaction(transactionId: String): this.type = js.native
    
    def includeFailed(value: Boolean): this.type = js.native
    
    def operation(operationId: String): CallBuilder[OperationRecord] = js.native
  }
}
