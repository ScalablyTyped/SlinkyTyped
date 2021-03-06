package typingsSlinky.workboxRouting

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerRouteMod {
  
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: String): Route[Boolean] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: String, handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[Boolean] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: String, handler: RouteHandler): Route[Boolean] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp): RegExpRoute = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp, handler: js.UndefOr[RouteHandler], method: HTTPMethod): RegExpRoute = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: js.RegExp, handler: RouteHandler): RegExpRoute = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture): Route[_] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture, handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[_] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute(capture: RegisterRouteCapture, handler: RouteHandler): Route[_] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn]): Route[MatchReturn] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[MatchReturn] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn]): Route[MatchReturn] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: js.UndefOr[RouteHandler], method: HTTPMethod): Route[MatchReturn] = js.native
  @JSImport("workbox-routing/registerRoute", "registerRoute")
  @js.native
  def registerRoute[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  
  type RegisterRouteCapture = String | js.RegExp | RouteMatchCallback[js.Any] | Route[js.Any]
}
