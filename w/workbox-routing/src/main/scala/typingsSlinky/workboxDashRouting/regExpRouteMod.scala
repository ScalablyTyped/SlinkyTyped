package typingsSlinky.workboxDashRouting

import typingsSlinky.workboxDashRouting.routeMod.Route
import typingsSlinky.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/RegExpRoute", JSImport.Namespace)
@js.native
object regExpRouteMod extends js.Object {
  @js.native
  class RegExpRoute protected ()
    extends Route[js.Array[String]] {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
}

