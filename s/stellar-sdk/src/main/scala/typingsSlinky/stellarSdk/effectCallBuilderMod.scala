package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.EffectRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/effect_call_builder", "EffectCallBuilder")
  @js.native
  class EffectCallBuilder protected () extends CallBuilder[CollectionPage[EffectRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forAccount(accountId: String): this.type = js.native
    
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    
    def forOperation(operationId: String): this.type = js.native
    
    def forTransaction(transactionId: String): this.type = js.native
  }
}
