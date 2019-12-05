package typingsSlinky.workboxDashSw.workboxDashSwMod._Global_.workbox

import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxDashStreams.concatenateMod.ConcatenateReturn
import typingsSlinky.workboxDashStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typingsSlinky.workboxDashStreams.strategyMod.StreamsHandlerCallback
import typingsSlinky.workboxDashStreams.typesStreamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.streams")
@js.native
object streams extends js.Object {
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  def isSupported(): Boolean = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
}

