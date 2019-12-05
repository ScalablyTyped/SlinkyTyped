package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OrderbookRecord
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/orderbook_call_builder", JSImport.Namespace)
@js.native
object libOrderbookUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class OrderbookCallBuilder protected () extends CallBuilder[OrderbookRecord] {
    def this(serverUrl: URI, selling: Asset, buying: Asset) = this()
  }
  
}

