package typingsSlinky.workboxStreams

import typingsSlinky.std.HeadersInit
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
import typingsSlinky.workboxStreams.concatenateMod.ConcatenateReturn
import typingsSlinky.workboxStreams.concatenateToResponseMod.ConcatenateToResponseReturn
import typingsSlinky.workboxStreams.strategyMod.StreamsHandlerCallback
import typingsSlinky.workboxStreams.streamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-streams", "concatenate")
  @js.native
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateReturn = js.native
  
  @JSImport("workbox-streams", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = js.native
  @JSImport("workbox-streams", "concatenateToResponse")
  @js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = js.native
  
  @JSImport("workbox-streams", "isSupported")
  @js.native
  def isSupported(): Boolean = js.native
  
  @JSImport("workbox-streams", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback]): RouteHandlerCallback = js.native
  @JSImport("workbox-streams", "strategy")
  @js.native
  def strategy(sourceFunctions: js.Array[StreamsHandlerCallback], headersInit: HeadersInit): RouteHandlerCallback = js.native
}
