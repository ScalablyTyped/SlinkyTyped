package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.PaymentPathRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_receive_path_call_builder", JSImport.Namespace)
@js.native
object strictReceivePathCallBuilderMod extends js.Object {
  @js.native
  class StrictReceivePathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      source: String,
      destinationAsset: Asset,
      destinationAmount: String
    ) = this()
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      source: js.Array[Asset],
      destinationAsset: Asset,
      destinationAmount: String
    ) = this()
  }
  
}

