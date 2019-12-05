package typingsSlinky.socketclusterDashServer.scserverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.scDashAuth.scDashAuthMod.SCAuthEngine
import typingsSlinky.scDashBrokerDashCluster.scDashBrokerDashClusterMod.Client
import typingsSlinky.scDashBrokerDashCluster.scDashBrokerDashClusterMod.SCExchange
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.authenticate
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.badSocketAuthToken
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.closure
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.connection
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.connectionAbort
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.disconnection
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.emit
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.error
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.handshake
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.handshakeSC
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.handshakeWS
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.publishIn
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.publishOut
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.ready
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.subscribe
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.subscription
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.unsubscription
import typingsSlinky.socketclusterDashServer.socketclusterDashServerStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServer extends EventEmitter {
  val MIDDLEWARE_AUTHENTICATE: authenticate = js.native
  val MIDDLEWARE_EMIT: emit = js.native
  val MIDDLEWARE_HANDSHAKE_SC: handshakeSC = js.native
  val MIDDLEWARE_HANDSHAKE_WS: handshakeWS = js.native
  val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
  val MIDDLEWARE_PUBLISH_OUT: publishOut = js.native
  val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
  var auth: SCAuthEngine = js.native
  var brokerEngine: Client = js.native
  var clients: StringDictionary[typingsSlinky.socketclusterDashServer.scserversocketMod.^] = js.native
  var clientsCount: Double = js.native
  var codec: SCCodecEngine = js.native
  var exchange: SCExchange = js.native
  var options: SCServerOptions = js.native
  var pendingClients: StringDictionary[typingsSlinky.socketclusterDashServer.scserversocketMod.^] = js.native
  var pendingClientsCount: Double = js.native
  @JSName("addMiddleware")
  def addMiddleware_authenticate(
    `type`: authenticate,
    middlewareFn: js.Function2[/* req */ AuthenticateRequest, /* next */ nextAuthenticateMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_emit(
    `type`: emit,
    middlewareFn: js.Function2[/* req */ EmitRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeSC(
    `type`: handshakeSC,
    middlewareFn: js.Function2[/* req */ HandshakeSCRequest, /* next */ nextHandshakeSCMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeWS(
    `type`: handshakeWS,
    middlewareFn: js.Function2[/* req */ IncomingMessage, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishIn(
    `type`: publishIn,
    middlewareFn: js.Function2[/* req */ PublishInRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishOut(
    `type`: publishOut,
    middlewareFn: js.Function2[/* req */ PublishOutRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_subscribe(
    `type`: subscribe,
    middlewareFn: js.Function2[/* req */ SubscribeRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def generateId(): String = js.native
  def getPath(): String = js.native
  def isAuthTokenExpired(token: AuthToken): Boolean = js.native
  @JSName("on")
  def on_badSocketAuthToken(event: badSocketAuthToken, listener: badSocketAuthTokenListenerFunction): this.type = js.native
  @JSName("on")
  def on_closure(event: closure, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: connectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_connectionAbort(event: connectionAbort, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_disconnection(event: disconnection, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_handshake(event: handshake, listener: handshakeListenerFunction): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_subscription(event: subscription, listener: subscriptionListenerFunction): this.type = js.native
  @JSName("on")
  def on_unsubscription(event: unsubscription, listener: unsubscriptionListenerFunction): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_authenticate(
    `type`: authenticate,
    middlewareFn: js.Function2[/* req */ AuthenticateRequest, /* next */ nextAuthenticateMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_emit(
    `type`: emit,
    middlewareFn: js.Function2[/* req */ EmitRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_handshakeSC(
    `type`: handshakeSC,
    middlewareFn: js.Function2[/* req */ HandshakeSCRequest, /* next */ nextHandshakeSCMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_handshakeWS(
    `type`: handshakeWS,
    middlewareFn: js.Function2[/* req */ IncomingMessage, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_publishIn(
    `type`: publishIn,
    middlewareFn: js.Function2[/* req */ PublishInRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_publishOut(
    `type`: publishOut,
    middlewareFn: js.Function2[/* req */ PublishOutRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_subscribe(
    `type`: subscribe,
    middlewareFn: js.Function2[/* req */ SubscribeRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(codecEngine: SCCodecEngine): Unit = js.native
  def verifyHandshake(info: VerifyHandshakeInfo, cb: verifyHandshakeFunction): Unit = js.native
  def verifyInboundEvent(
    socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    cb: js.Function3[/* err */ js.Error, /* eventData */ js.Any, /* ackData */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def verifyOutboundEvent(
    socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    options: js.Object,
    cb: js.Function2[/* err */ js.Error | Null, /* eventData */ js.Any, Unit]
  ): Unit = js.native
  def verifyOutboundEvent(
    socket: typingsSlinky.socketclusterDashServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    options: Null,
    cb: js.Function2[/* err */ js.Error | Null, /* eventData */ js.Any, Unit]
  ): Unit = js.native
}

