package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AssetRecord
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/assets_call_builder", JSImport.Namespace)
@js.native
object libAssetsUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: URI) = this()
    def forCode(value: String): AssetsCallBuilder = js.native
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
  
}

