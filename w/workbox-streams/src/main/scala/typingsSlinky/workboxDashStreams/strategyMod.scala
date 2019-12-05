package typingsSlinky.workboxDashStreams

import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandlerCallbackContext
import typingsSlinky.workboxDashStreams.strategyMod.StreamsHandlerCallback
import typingsSlinky.workboxDashStreams.typesStreamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/strategy", JSImport.Namespace)
@js.native
object strategyMod extends js.Object {
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
  type StreamsHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackContext, js.Promise[StreamSource] | StreamSource]
}

