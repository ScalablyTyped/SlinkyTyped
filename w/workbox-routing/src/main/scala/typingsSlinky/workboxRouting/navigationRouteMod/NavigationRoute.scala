package typingsSlinky.workboxRouting.navigationRouteMod

import typingsSlinky.workboxRouting.routeHandlerMod.RouteHandler
import typingsSlinky.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-routing/NavigationRoute", "NavigationRoute")
@js.native
class NavigationRoute protected () extends Route[Boolean] {
  def this(handler: RouteHandler) = this()
  def this(handler: RouteHandler, options: NavigationRouteOptions) = this()
}

