package typingsSlinky.workboxDashSw.workboxDashSwMod._Global_.workbox

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.RegExp
import typingsSlinky.workboxDashRouting.registerNavigationRouteMod.RegisterNavigationRouteOptions
import typingsSlinky.workboxDashRouting.registerRouteMod.RegisterRouteCapture
import typingsSlinky.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import typingsSlinky.workboxDashRouting.typesRouteMatchCallbackMod.RouteMatchCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("workbox.routing")
@js.native
object routing extends js.Object {
  @js.native
  class NavigationRoute protected ()
    extends typingsSlinky.workboxDashRouting.workboxDashRoutingMod.NavigationRoute {
    def this(handler: RouteHandler) = this()
  }
  
  @js.native
  class RegExpRoute protected ()
    extends typingsSlinky.workboxDashRouting.workboxDashRoutingMod.RegExpRoute {
    def this(regExp: js.RegExp, handler: RouteHandler) = this()
  }
  
  @js.native
  class Route[MatchReturn] protected ()
    extends typingsSlinky.workboxDashRouting.workboxDashRoutingMod.Route[MatchReturn] {
    def this(
      `match`: RouteMatchCallback[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam MatchReturn */ _
          ],
      handler: RouteHandler
    ) = this()
  }
  
  @js.native
  class Router ()
    extends typingsSlinky.workboxDashRouting.workboxDashRoutingMod.Router
  
  var NavigationRoute: Instantiable1[
    /* handler */ RouteHandler, 
    typingsSlinky.workboxDashRouting.workboxDashRoutingMod.NavigationRoute
  ] = js.native
  var RegExpRoute: Instantiable2[
    /* regExp */ js.RegExp, 
    /* handler */ RouteHandler, 
    typingsSlinky.workboxDashRouting.workboxDashRoutingMod.RegExpRoute
  ] = js.native
  var Route: Instantiable2[
    /* match */ RouteMatchCallback[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam MatchReturn */ js.Any
    ], 
    /* handler */ RouteHandler, 
    typingsSlinky.workboxDashRouting.workboxDashRoutingMod.Route[js.Object]
  ] = js.native
  var Router: js.Any | Instantiable0[typingsSlinky.workboxDashRouting.workboxDashRoutingMod.Router] = js.native
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

