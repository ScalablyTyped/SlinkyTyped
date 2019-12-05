package typingsSlinky.subscriptionsDashTransportDashWs

import typingsSlinky.subscriptionsDashTransportDashWs.distClientMod.ClientOptions
import typingsSlinky.subscriptionsDashTransportDashWs.distServerMod.ServerOptions
import typingsSlinky.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsStrings.`graphql-subscriptions`
import typingsSlinky.subscriptionsDashTransportDashWs.subscriptionsDashTransportDashWsStrings.`graphql-ws`
import typingsSlinky.ws.wsMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", JSImport.Namespace)
@js.native
object subscriptionsDashTransportDashWsMod extends js.Object {
  @js.native
  class SubscriptionClient protected ()
    extends typingsSlinky.subscriptionsDashTransportDashWs.distClientMod.SubscriptionClient {
    def this(url: String) = this()
    def this(url: String, options: ClientOptions) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: String) = this()
    def this(url: String, options: ClientOptions, webSocketImpl: js.Any, webSocketProtocols: js.Array[String]) = this()
  }
  
  @js.native
  class SubscriptionServer protected ()
    extends typingsSlinky.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer {
    def this(options: ServerOptions, socketOptionsOrServer: Server) = this()
    def this(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.wsMod.ServerOptions) = this()
  }
  
  val GRAPHQL_SUBSCRIPTIONS: `graphql-subscriptions` = js.native
  val GRAPHQL_WS: `graphql-ws` = js.native
  /* static members */
  @js.native
  object SubscriptionServer extends js.Object {
    def create(options: ServerOptions, socketOptionsOrServer: Server): typingsSlinky.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
    def create(options: ServerOptions, socketOptionsOrServer: typingsSlinky.ws.wsMod.ServerOptions): typingsSlinky.subscriptionsDashTransportDashWs.distServerMod.SubscriptionServer = js.native
  }
  
}

