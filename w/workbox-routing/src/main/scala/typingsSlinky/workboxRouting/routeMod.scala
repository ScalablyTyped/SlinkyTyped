package typingsSlinky.workboxRouting

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-routing/Route", JSImport.Namespace)
@js.native
object routeMod extends js.Object {
  
  @js.native
  class Route[MatchReturn] protected () extends js.Object {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
    
    val handler: RouteHandler = js.native
    
    def `match`(options: RouteMatchCallbackOptions): MatchReturn = js.native
    
    val method: HTTPMethod = js.native
  }
}
