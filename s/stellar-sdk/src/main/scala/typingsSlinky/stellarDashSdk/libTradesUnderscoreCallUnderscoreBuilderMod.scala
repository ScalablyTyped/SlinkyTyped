package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.TradeRecord
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/trades_call_builder", JSImport.Namespace)
@js.native
object libTradesUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class TradesCallBuilder protected () extends CallBuilder[CollectionPage[TradeRecord]] {
    def this(serverUrl: URI) = this()
    def forAccount(accountId: String): this.type = js.native
    def forAssetPair(base: Asset, counter: Asset): this.type = js.native
    def forOffer(offerId: String): this.type = js.native
  }
  
}

