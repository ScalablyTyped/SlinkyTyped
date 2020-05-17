package typingsSlinky.workboxRouting.registerRouteMod

import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.regExpRouteMod.RegExpRoute
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/registerRoute", "registerRoute")
@js.native
object registerRoute extends js.Object {
  def apply(capture: String): Route[Boolean] = js.native
  def apply(capture: String, handler: RouteHandler): Route[Boolean] = js.native
  def apply(capture: String, handler: RouteHandler, method: HTTPMethod): Route[Boolean] = js.native
  def apply(capture: js.RegExp): RegExpRoute = js.native
  def apply(capture: js.RegExp, handler: RouteHandler): RegExpRoute = js.native
  def apply(capture: js.RegExp, handler: RouteHandler, method: HTTPMethod): RegExpRoute = js.native
  def apply(capture: RegisterRouteCapture): Route[_] = js.native
  def apply(capture: RegisterRouteCapture, handler: RouteHandler): Route[_] = js.native
  def apply(capture: RegisterRouteCapture, handler: RouteHandler, method: HTTPMethod): Route[_] = js.native
  def apply[MatchReturn](capture: RouteMatchCallback[MatchReturn]): Route[MatchReturn] = js.native
  def apply[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  def apply[MatchReturn](capture: RouteMatchCallback[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = js.native
  def apply[MatchReturn](capture: Route[MatchReturn]): Route[MatchReturn] = js.native
  def apply[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler): Route[MatchReturn] = js.native
  def apply[MatchReturn](capture: Route[MatchReturn], handler: RouteHandler, method: HTTPMethod): Route[MatchReturn] = js.native
}

