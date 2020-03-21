package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.PaymentOperationRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/payment_call_builder", JSImport.Namespace)
@js.native
object paymentCallBuilderMod extends js.Object {
  @js.native
  class PaymentCallBuilder protected () extends CallBuilder[CollectionPage[PaymentOperationRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
}

