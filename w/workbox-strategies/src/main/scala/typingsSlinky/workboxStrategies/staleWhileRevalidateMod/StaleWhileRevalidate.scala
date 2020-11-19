package typingsSlinky.workboxStrategies.staleWhileRevalidateMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerObject
import typingsSlinky.workboxStrategies.makeRequestCallbackMod.MakeRequestCallback
import typingsSlinky.workboxStrategies.makeRequestCallbackMod.MakeRequestCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-strategies/StaleWhileRevalidate", "StaleWhileRevalidate")
@js.native
class StaleWhileRevalidate () extends RouteHandlerObject {
  def this(options: StaleWhileRevalidateOptions) = this()
  
  def makeRequest(options: MakeRequestCallbackOptions): js.Promise[Response] = js.native
  @JSName("makeRequest")
  var makeRequest_Original: MakeRequestCallback = js.native
}
