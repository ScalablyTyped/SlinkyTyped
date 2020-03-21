package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_call_builder", JSImport.Namespace)
@js.native
object accountCallBuilderMod extends js.Object {
  @js.native
  class AccountCallBuilder protected () extends CallBuilder[AccountRecord] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any) = this()
    def accountId(id: String): this.type = js.native
  }
  
}

