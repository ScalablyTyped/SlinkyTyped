package typingsSlinky.workboxDashRouting

import typingsSlinky.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typingsSlinky.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallbackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/Route", JSImport.Namespace)
@js.native
object routeMod extends js.Object {
  @js.native
  class Route[MatchReturn] protected () extends js.Object {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
    val handler: RouteHandler = js.native
    val method: HTTPMethod = js.native
    def `match`(options: RouteMatchCallbackOptions): MatchReturn = js.native
  }
  
}

