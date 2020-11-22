package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/account_call_builder", JSImport.Namespace)
@js.native
object accountCallBuilderMod extends js.Object {
  
  @js.native
  class AccountCallBuilder protected () extends CallBuilder[CollectionPage[AccountRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def accountId(id: String): CallBuilder[AccountRecord] = js.native
    
    def forAsset(asset: Asset): this.type = js.native
    
    def forSigner(id: String): this.type = js.native
    
    def sponsor(id: String): this.type = js.native
  }
}
