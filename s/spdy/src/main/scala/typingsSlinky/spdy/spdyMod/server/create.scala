package typingsSlinky.spdy.spdyMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spdy", "server.create")
@js.native
object create extends js.Object {
  def apply(
    base: js.Any,
    options: typingsSlinky.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typingsSlinky.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typingsSlinky.spdy.spdyMod.server.ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typingsSlinky.spdy.spdyMod.server.Server = js.native
  def apply(
    handler: js.Function2[
      /* request */ typingsSlinky.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typingsSlinky.spdy.spdyMod.server.ServerResponse | typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typingsSlinky.spdy.spdyMod.server.Server = js.native
  def apply(
    options: typingsSlinky.node.httpsMod.ServerOptions,
    handler: js.Function2[
      /* request */ typingsSlinky.spdy.spdyMod.server.IncomingMessage, 
      /* response */ typingsSlinky.node.httpMod.ServerResponse, 
      Unit
    ]
  ): typingsSlinky.spdy.spdyMod.server.Server = js.native
}

