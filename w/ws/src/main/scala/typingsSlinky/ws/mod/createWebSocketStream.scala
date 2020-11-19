package typingsSlinky.ws.mod

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ws", "createWebSocketStream")
@js.native
object createWebSocketStream extends js.Object {
  
  // WebSocket stream
  def apply(websocket: WebSocket): Duplex = js.native
  def apply(websocket: WebSocket, options: DuplexOptions): Duplex = js.native
}
