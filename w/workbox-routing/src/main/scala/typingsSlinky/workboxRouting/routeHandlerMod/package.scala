package typingsSlinky.workboxRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routeHandlerMod {
  
  type RouteHandler = typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallback | typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerObject
  
  type RouteHandlerCallback = js.Function1[
    /* context */ typingsSlinky.workboxRouting.routeHandlerMod.RouteHandlerCallbackContext, 
    js.Promise[org.scalajs.dom.experimental.Response]
  ]
}
