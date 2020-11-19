package typingsSlinky.subscriptionsTransportWs.serverMod

import typingsSlinky.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
class SubscriptionServer protected () extends js.Object {
  def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
  def this(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.mod.ServerOptions) = this()
  
  def close(): Unit = js.native
  
  var closeHandler: js.Any = js.native
  
  var execute: js.Any = js.native
  
  var keepAlive: js.Any = js.native
  
  var loadExecutor: js.Any = js.native
  
  var onClose: js.Any = js.native
  
  var onConnect: js.Any = js.native
  
  var onDisconnect: js.Any = js.native
  
  var onMessage: js.Any = js.native
  
  var onOperation: js.Any = js.native
  
  var onOperationComplete: js.Any = js.native
  
  var rootValue: js.Any = js.native
  
  var schema: js.Any = js.native
  
  var sendError: js.Any = js.native
  
  var sendKeepAlive: js.Any = js.native
  
  var sendMessage: js.Any = js.native
  
  def server: Server = js.native
  
  var specifiedRules: js.Any = js.native
  
  var subscribe: js.Any = js.native
  
  var unsubscribe: js.Any = js.native
  
  var wsServer: js.Any = js.native
}
/* static members */
@JSImport("subscriptions-transport-ws/dist/server", "SubscriptionServer")
@js.native
object SubscriptionServer extends js.Object {
  
  def create(options: ServerOptions, socketOptionsOrServer: Server): SubscriptionServer = js.native
  def create(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.mod.ServerOptions): SubscriptionServer = js.native
}
