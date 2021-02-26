package typingsSlinky.workboxStreams

import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext
import typingsSlinky.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyMod {
  
  @JSImport("workbox-streams/strategy", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  @JSImport("workbox-streams/strategy", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
  
  type StreamsHandlerCallback = js.Function1[/* options */ RouteHandlerCallbackContext, js.Promise[StreamSource] | StreamSource]
}
