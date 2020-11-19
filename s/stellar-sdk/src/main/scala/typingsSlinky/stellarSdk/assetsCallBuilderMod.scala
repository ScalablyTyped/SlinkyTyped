package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AssetRecord
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/assets_call_builder", JSImport.Namespace)
@js.native
object assetsCallBuilderMod extends js.Object {
  
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forCode(value: String): AssetsCallBuilder = js.native
    
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
}
