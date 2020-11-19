package typingsSlinky.webpackHotClient.mod

import typingsSlinky.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketServer extends Server {
  
  /** Forwards a message to each open client on the WebSocketServer */
  def broadcast(data: js.Any): Unit = js.native
  
  /** Processes stats and sends messages through broadcast() */
  def send(
    stats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
  ): Unit = js.native
}
