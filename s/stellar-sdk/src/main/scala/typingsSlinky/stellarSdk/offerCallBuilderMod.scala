package typingsSlinky.stellarSdk

import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OfferRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/offer_call_builder", JSImport.Namespace)
@js.native
object offerCallBuilderMod extends js.Object {
  @js.native
  class OfferCallBuilder protected () extends CallBuilder[CollectionPage[OfferRecord]] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify uri.URI */ js.Any,
      resource: String,
      resourceParams: String*
    ) = this()
  }
  
}

