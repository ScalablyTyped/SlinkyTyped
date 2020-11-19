package typingsSlinky.workboxStreams

import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typingsSlinky.workboxStreams.streamSourceMod.StreamSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-streams/strategy", JSImport.Namespace)
@js.native
object strategyMod extends js.Object {
  
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
  
  type StreamsHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackContext, js.Promise[StreamSource] | StreamSource]
}
