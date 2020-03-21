package typingsSlinky.workboxRouting

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMod.Route
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

