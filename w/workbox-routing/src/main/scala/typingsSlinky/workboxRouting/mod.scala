package typingsSlinky.workboxRouting

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.navigationRouteMod.NavigationRouteOptions
import typingsSlinky.workboxRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsSlinky.workboxRouting.registerRouteMod.RegisterRouteCapture
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-routing", "NavigationRoute")
  @js.native
  class NavigationRoute protected ()
    extends typingsSlinky.workboxRouting.navigationRouteMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
    def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
  }
  
  @JSImport("workbox-routing", "RegExpRoute")
  @js.native
  class RegExpRoute protected ()
    extends typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
    def this(regExp: js.RegExp, handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Route")
  @js.native
  class Route[MatchReturn] protected ()
    extends typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] {
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler) = this()
    def this(`match`: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod) = this()
  }
  
  @JSImport("workbox-routing", "Router")
  @js.native
  class Router ()
    extends typingsSlinky.workboxRouting.routerMod.Router
  
  @JSImport("workbox-routing", "registerNavigationRoute")
  @js.native
  def registerNavigationRoute(cachedAssetUrl: String): typingsSlinky.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  @JSImport("workbox-routing", "registerNavigationRoute")
  @js.native
  def registerNavigationRoute(cachedAssetUrl: String, options: RegisterNavigationRouteOptions): typingsSlinky.workboxRouting.navigationRouteMod.NavigationRoute = js.native
  
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: String): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: String, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: String, handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[Boolean] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp, handler: RouteHandler): typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture, handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[_] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn]): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](
    capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn],
    handler: js.UndefOr[RouteHandler],
    method: HTTPMethod
  ): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  @JSImport("workbox-routing", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: typingsSlinky.workboxRouting.routeMod.Route[MatchReturn], handler: RouteHandler): typingsSlinky.workboxRouting.routeMod.Route[MatchReturn] = js.native
  
  @JSImport("workbox-routing", "setCatchHandler")
  @js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  
  @JSImport("workbox-routing", "setDefaultHandler")
  @js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
}
