package typingsSlinky.workboxRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routeHandlerMod {
  type RouteHandlerCallback = js.Function1[
    /* context */ typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext, 
    js.Promise[org.scalajs.dom.experimental.Response]
  ]
}
