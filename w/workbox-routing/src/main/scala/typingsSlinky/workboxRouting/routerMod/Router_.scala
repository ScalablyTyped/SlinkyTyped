package typingsSlinky.workboxRouting.routerMod

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Map
import typingsSlinky.workboxRouting.httpmethodMod.HTTPMethod
import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMod.Route
import typingsSlinky.workboxRouting.routerMod.Router.FindMatchingRouteOptions
import typingsSlinky.workboxRouting.routerMod.Router.FindMatchingRouteReturn
import typingsSlinky.workboxRouting.routerMod.Router.HandleRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-routing/Router", "Router")
@js.native
class Router_ () extends js.Object {
  
  def addCacheListener(): Unit = js.native
  
  def addFetchListener(): Unit = js.native
  
  def findMatchingRoute(options: FindMatchingRouteOptions): js.Object | FindMatchingRouteReturn[_] = js.native
  
  def handleRequest(options: HandleRequestOptions): js.Promise[js.UndefOr[Response]] = js.native
  
  def registerRoute(route: Route[_]): Unit = js.native
  
  val routes: Map[HTTPMethod, js.Array[Route[_]]] = js.native
  
  def setCatchHandler(handler: RouteHandler): Unit = js.native
  
  def setDefaultHandler(handler: RouteHandler): Unit = js.native
  
  def unregisterRoute(route: Route[_]): Unit = js.native
}
