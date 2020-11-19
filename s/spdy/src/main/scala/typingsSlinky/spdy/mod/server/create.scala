package typingsSlinky.spdy.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("spdy", "server.create")
@js.native
object create extends js.Object {
  
  def apply(
    base: js.Any,
    options: typingsSlinky.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
  def apply(
    options: typingsSlinky.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ IncomingMessage, 
      /* response */ typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): Server = js.native
}
