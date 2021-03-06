package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OfferRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offerCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/offer_call_builder", "OfferCallBuilder")
  @js.native
  class OfferCallBuilder protected () extends CallBuilder[CollectionPage[OfferRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def buying(asset: Asset): this.type = js.native
    
    def forAccount(id: String): this.type = js.native
    
    def offer(offerId: String): CallBuilder[OfferRecord] = js.native
    
    def selling(asset: Asset): this.type = js.native
    
    def sponsor(id: String): this.type = js.native
  }
}
