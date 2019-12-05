package typingsSlinky.stellarDashSdk

import typingsSlinky.stellarDashBase.stellarDashBaseMod.Asset
import typingsSlinky.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentPathRecord
import typingsSlinky.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_receive_path_call_builder", JSImport.Namespace)
@js.native
object libStrictUnderscoreReceiveUnderscorePathUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class StrictReceivePathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(serverUrl: URI, source: String, destinationAsset: Asset, destinationAmount: String) = this()
    def this(serverUrl: URI, source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String) = this()
  }
  
}

