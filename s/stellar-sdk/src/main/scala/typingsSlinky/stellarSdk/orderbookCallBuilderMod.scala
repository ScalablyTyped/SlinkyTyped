package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarSdk.callBuilderMod.CallBuilder
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.OrderbookRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderbookCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/orderbook_call_builder", "OrderbookCallBuilder")
  @js.native
  class OrderbookCallBuilder protected () extends CallBuilder[OrderbookRecord] {
    def this(
      serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any,
      selling: Asset,
      buying: Asset
    ) = this()
  }
}
