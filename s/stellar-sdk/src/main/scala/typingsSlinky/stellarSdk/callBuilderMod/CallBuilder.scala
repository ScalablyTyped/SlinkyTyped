package typingsSlinky.stellarSdk.callBuilderMod

import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.FeeStatsResponse
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typingsSlinky.stellarSdk.stellarSdkStrings.asc
import typingsSlinky.stellarSdk.stellarSdkStrings.desc
import typingsSlinky.stellarSdk.stellarSdkStrings.transactions
import typingsSlinky.urijs.mod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/call_builder", "CallBuilder")
@js.native
class CallBuilder[T /* <: FeeStatsResponse | BaseResponse[scala.Nothing] | CollectionPage[BaseResponse[scala.Nothing]] */] protected () extends js.Object {
  def this(serverUrl: URI) = this()
  
  var _handleNetworkError: js.Any = js.native
  
  var _parseRecord: js.Any = js.native
  
  var _parseResponse: js.Any = js.native
  
  var _requestFnForLink: js.Any = js.native
  
  var _sendNormalRequest: js.Any = js.native
  
  var _toCollectionPage: js.Any = js.native
  
  def call(): js.Promise[T] = js.native
  
  var checkFilter: js.Any = js.native
  
  def cursor(cursor: String): this.type = js.native
  
  var filter: js.Array[js.Array[String]] = js.native
  
  @JSName("join")
  def join_transactions(include: transactions): this.type = js.native
  
  def limit(recordsNumber: Double): this.type = js.native
  
  @JSName("order")
  def order_asc(direction: asc): this.type = js.native
  @JSName("order")
  def order_desc(direction: desc): this.type = js.native
  
  var originalSegments: js.Array[String] = js.native
  
  def stream(): js.Function0[Unit] = js.native
  def stream(options: EventSourceOptions[T]): js.Function0[Unit] = js.native
  
  var url: URI = js.native
}
