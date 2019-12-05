package typingsSlinky.workboxDashRouting

import typingsSlinky.std.RegExp
import typingsSlinky.workboxDashRouting.navigationRouteMod.NavigationRouteOptions
import typingsSlinky.workboxDashRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsSlinky.workboxDashRouting.registerRouteMod.RegisterRouteCapture
import typingsSlinky.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typingsSlinky.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing", JSImport.Namespace)
@js.native
object workboxDashRoutingMod extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typingsSlinky.workboxDashRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typingsSlinky.workboxDashRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @js.native
  class Router ()
    extends typingsSlinky.workboxDashRouting.routerMod.Router
  
  def registerNavigationRoute(cachedAssetUrl: String): typingsSlinky.workboxDashRouting.navigationRouteMod.NavigationRoute = js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typingsSlinky.workboxDashRouting.navigationRouteMod.NavigationRoute = js.native
  def registerRoute(capture: String): typingsSlinky.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler): typingsSlinky.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: String, handler: RouteHandler, method: HTTPMethod): typingsSlinky.workboxDashRouting.routeMod.Route[Boolean] = js.native
  def registerRoute(capture: RegExp): typingsSlinky.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler): typingsSlinky.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegExp, handler: RouteHandler, method: HTTPMethod): typingsSlinky.workboxDashRouting.regExpRouteMod.RegExpRoute = js.native
  def registerRoute(capture: RegisterRouteCapture): typingsSlinky.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typingsSlinky.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): typingsSlinky.workboxDashRouting.routeMod.Route[_] = js.native
  def registerRoute[MatchReturn](capture: typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn]): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](
    capture: typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn],
    handler: RouteHandler,
    method: HTTPMethod
  ): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): typingsSlinky.workboxDashRouting.routeMod.Route[MatchReturn] = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
}

