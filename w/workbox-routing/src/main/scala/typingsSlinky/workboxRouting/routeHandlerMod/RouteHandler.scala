package typingsSlinky.workboxRouting.routeHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback
  - typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerObject
*/
trait RouteHandler extends js.Object

object RouteHandler {
  @scala.inline
  implicit def apply(value: RouteHandlerCallback): RouteHandler = value.asInstanceOf[RouteHandler]
  @scala.inline
  implicit def apply(value: RouteHandlerObject): RouteHandler = value.asInstanceOf[RouteHandler]
}

