package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.TransactionRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/transaction_call_builder", "TransactionCallBuilder")
  @js.native
  class TransactionCallBuilder protected () extends CallBuilder[CollectionPage[TransactionRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forAccount(accountId: String): this.type = js.native
    
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    
    def includeFailed(value: Boolean): this.type = js.native
    
    def transaction(transactionId: String): CallBuilder[TransactionRecord] = js.native
  }
}
