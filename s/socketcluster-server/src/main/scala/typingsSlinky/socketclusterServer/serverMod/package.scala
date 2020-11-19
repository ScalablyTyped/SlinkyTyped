package typingsSlinky.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverMod {
  
  type handshakeMiddlewareFunction = js.Function1[/* stream */ typingsSlinky.writableConsumableStream.mod.^[js.Any], scala.Unit]
  
  type inboundMiddlewareFunction = js.Function1[/* stream */ typingsSlinky.writableConsumableStream.mod.^[js.Any], scala.Unit]
  
  type inboundRawMiddlewareFunction = js.Function1[/* stream */ typingsSlinky.writableConsumableStream.mod.^[js.Any], scala.Unit]
  
  type outboundMiddlewareFunction = js.Function1[/* stream */ typingsSlinky.writableConsumableStream.mod.^[js.Any], scala.Unit]
}
