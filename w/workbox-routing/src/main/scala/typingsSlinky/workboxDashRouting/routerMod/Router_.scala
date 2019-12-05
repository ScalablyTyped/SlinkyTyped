package typingsSlinky.workboxDashRouting.routerMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Map
import typingsSlinky.workboxDashRouting.routeMod.Route
import typingsSlinky.workboxDashRouting.routerMod.Router.FindMatchingRouteOptions
import typingsSlinky.workboxDashRouting.routerMod.Router.FindMatchingRouteReturn
import typingsSlinky.workboxDashRouting.routerMod.Router.HandleRequestOptions
import typingsSlinky.workboxDashRouting.typesHTTPMethodMod.HTTPMethod
import typingsSlinky.workboxDashRouting.typesRouteHandlerMod.RouteHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/Router", "Router")
@js.native
class Router_ () extends js.Object {
  val routes: Map[HTTPMethod, js.Array[Route[_]]] = js.native
  def addCacheListener(): Unit = js.native
  def addFetchListener(): Unit = js.native
  def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[_] = js.native
  def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
  def registerRoute(route: Route[_]): Unit = js.native
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
  def unregisterRoute(route: Route[_]): Unit = js.native
}

