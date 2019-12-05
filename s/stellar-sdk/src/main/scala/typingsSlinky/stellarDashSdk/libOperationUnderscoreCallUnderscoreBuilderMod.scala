package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OperationRecord
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/operation_call_builder", JSImport.Namespace)
@js.native
object libOperationUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class OperationCallBuilder protected () extends CallBuilder[CollectionPage[OperationRecord]] {
    def this(serverUrl: URI) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
    def includeFailed(value: Boolean): this.type = js.native
    def operation(operationId: String): this.type = js.native
  }
  
}

