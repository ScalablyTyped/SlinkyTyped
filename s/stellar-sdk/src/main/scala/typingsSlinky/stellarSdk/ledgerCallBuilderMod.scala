package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.LedgerRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/ledger_call_builder", JSImport.Namespace)
@js.native
object ledgerCallBuilderMod extends js.Object {
  @js.native
  class LedgerCallBuilder protected () extends CallBuilder[CollectionPage[LedgerRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def ledger(sequence: String): this.type = js.native
    def ledger(sequence: Double): this.type = js.native
  }
  
}

