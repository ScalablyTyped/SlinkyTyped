package typingsSlinky.workboxRouting

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regExpRouteMod {
  
  @JSImport("workbox-routing/RegExpRoute", "RegExpRoute")
  @js.native
  class RegExpRoute protected ()
    extends Route[js.Array[String]] {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
}
