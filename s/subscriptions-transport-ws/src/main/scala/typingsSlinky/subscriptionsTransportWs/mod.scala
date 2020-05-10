package typingsSlinky.subscriptionsTransportWs

import typingsSlinky.subscriptionsTransportWs.clientMod.ClientOptions
import typingsSlinky.subscriptionsTransportWs.serverMod.ServerOptions
import typingsSlinky.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SubscriptionClient protected ()
    extends typingsSlinky.subscriptionsTransportWs.clientMod.SubscriptionClient {
    def this(url: String) = this()
    def this(url: String, options: ClientOptions) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: String) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: js.Array[String]) = this()
  }
  
  @js.native
  class SubscriptionServer protected ()
    extends typingsSlinky.subscriptionsTransportWs.serverMod.SubscriptionServer {
    def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
    def this(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.mod.ServerOptions) = this()
  }
  
  val GRAPHQL_SUBSCRIPTIONS: /* "graphql-subscriptions" */ String = js.native
  val GRAPHQL_WS: /* "graphql-ws" */ String = js.native
  /* static members */
  @js.native
  object SubscriptionServer extends js.Object {
    def create(options: ServerOptions, socketOptionsOrServer: Server): typingsSlinky.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
    def create(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.mod.ServerOptions): typingsSlinky.subscriptionsTransportWs.serverMod.SubscriptionServer = js.native
  }
  
}

