package typingsSlinky.workboxRouting.registerRouteMod

import typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback
import typingsSlinky.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.workboxRouting.routeMatchCallbackMod.RouteMatchCallback[js.Any]
  - typingsSlinky.workboxRouting.routeMod.Route[js.Any]
*/
trait RegisterRouteCapture extends js.Object

object RegisterRouteCapture {
  @scala.inline
  implicit def apply(value: js.RegExp): RegisterRouteCapture = value.asInstanceOf[RegisterRouteCapture]
  @scala.inline
  implicit def apply(value: Route[js.Any]): RegisterRouteCapture = value.asInstanceOf[RegisterRouteCapture]
  @scala.inline
  implicit def apply(value: RouteMatchCallback[js.Any]): RegisterRouteCapture = value.asInstanceOf[RegisterRouteCapture]
  @scala.inline
  implicit def apply(value: String): RegisterRouteCapture = value.asInstanceOf[RegisterRouteCapture]
}

