package typingsSlinky.socketclusterServer.serverMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agSimpleBroker.mod.SimpleExchange
import typingsSlinky.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.Server
import typingsSlinky.scAuth.mod.SCAuthEngine
import typingsSlinky.socketclusterServer.anon.Algorithm
import typingsSlinky.socketclusterServer.anon.Algorithms
import typingsSlinky.socketclusterServer.anon.Error
import typingsSlinky.socketclusterServer.anon.Socket
import typingsSlinky.socketclusterServer.anon.Warning
import typingsSlinky.socketclusterServer.socketclusterServerNumbers.`1`
import typingsSlinky.socketclusterServer.socketclusterServerNumbers.`2`
import typingsSlinky.socketclusterServer.socketclusterServerStrings.authentication
import typingsSlinky.socketclusterServer.socketclusterServerStrings.authenticationStateChange
import typingsSlinky.socketclusterServer.socketclusterServerStrings.badSocketAuthToken
import typingsSlinky.socketclusterServer.socketclusterServerStrings.closure
import typingsSlinky.socketclusterServer.socketclusterServerStrings.connection
import typingsSlinky.socketclusterServer.socketclusterServerStrings.connectionAbort
import typingsSlinky.socketclusterServer.socketclusterServerStrings.deauthentication
import typingsSlinky.socketclusterServer.socketclusterServerStrings.disconnection
import typingsSlinky.socketclusterServer.socketclusterServerStrings.error
import typingsSlinky.socketclusterServer.socketclusterServerStrings.handshake
import typingsSlinky.socketclusterServer.socketclusterServerStrings.inbound
import typingsSlinky.socketclusterServer.socketclusterServerStrings.inboundRaw
import typingsSlinky.socketclusterServer.socketclusterServerStrings.outbound
import typingsSlinky.socketclusterServer.socketclusterServerStrings.subscription
import typingsSlinky.socketclusterServer.socketclusterServerStrings.unsubscription
import typingsSlinky.socketclusterServer.socketclusterServerStrings.warning
import typingsSlinky.ws.anon.Origin
import typingsSlinky.ws.mod.VerifyClientCallbackAsync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGServer
  extends AsyncStreamEmitter[js.Any] {
  val MIDDLEWARE_HANDSHAKE: handshake = js.native
  val MIDDLEWARE_INBOUND: inbound = js.native
  val MIDDLEWARE_INBOUND_RAW: inboundRaw = js.native
  val MIDDLEWARE_OUTBOUND: outbound = js.native
  val SYMBOL_MIDDLEWARE_HANDSHAKE_STREAM: js.Symbol = js.native
  var ackTimeout: Double = js.native
  var allowClientPublish: Boolean = js.native
  var auth: SCAuthEngine = js.native
  var brokerEngine: typingsSlinky.agSimpleBroker.mod.^ = js.native
  var clients: StringDictionary[typingsSlinky.socketclusterServer.serversocketMod.^] = js.native
  var clientsCount: Double = js.native
  var codec: CodecEngine = js.native
  var defaultSignatureOptions: Algorithm = js.native
  var defaultVerificationOptions: Algorithms = js.native
  var exchange: SimpleExchange = js.native
  var handshakeTimeout: Double = js.native
  var httpServer: Server = js.native
  var isReady: Boolean = js.native
  var middlewareEmitFailures: Boolean = js.native
  var options: AGServerOptions = js.native
  var origins: String = js.native
  var pendingClients: StringDictionary[typingsSlinky.socketclusterServer.serversocketMod.^] = js.native
  var pendingClientsCount: Double = js.native
  var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.native
  var pingInterval: Double = js.native
  var pingTimeout: Double = js.native
  var pingTimeoutDisabled: Boolean = js.native
  var protocolVersion: `1` | `2` = js.native
  var signatureKey: js.UndefOr[Secret] = js.native
  var socketChannelLimit: js.UndefOr[Double] = js.native
  var strictHandshake: Boolean = js.native
  var verificationKey: js.UndefOr[Secret] = js.native
  @JSName("verifyHandshake")
  var verifyHandshake_Original: VerifyClientCallbackAsync = js.native
  var wsServer: typingsSlinky.ws.mod.Server = js.native
  def close(): js.Promise[Unit] = js.native
  def emitError(error: js.Error): Unit = js.native
  def emitWarning(warning: js.Error): Unit = js.native
  @JSName("emit")
  def emit_authentication(eventName: authentication, data: AuthenticationData): Unit = js.native
  @JSName("emit")
  def emit_authenticationStateChange(eventName: authenticationStateChange, data: AuthStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_badSocketAuthToken(eventName: badSocketAuthToken, data: BadSocketAuthTokenData): Unit = js.native
  @JSName("emit")
  def emit_closure(eventName: closure, data: ClosureData): Unit = js.native
  @JSName("emit")
  def emit_connection(eventName: connection, data: ConnectionData): Unit = js.native
  @JSName("emit")
  def emit_connectionAbort(eventName: connectionAbort, data: ConnectionAbortData): Unit = js.native
  @JSName("emit")
  def emit_deauthentication(eventName: deauthentication, data: DeauthenticationData): Unit = js.native
  @JSName("emit")
  def emit_disconnection(eventName: disconnection, data: DisconnectionData): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_handshake(eventName: handshake, data: Socket): Unit = js.native
  @JSName("emit")
  def emit_subscription(eventName: subscription, data: SubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_unsubscription(eventName: unsubscription, data: UnsubscriptionData): Unit = js.native
  @JSName("emit")
  def emit_warning(eventName: warning, data: Warning): Unit = js.native
  def generateId(): String = js.native
  def getPath(): String = js.native
  def hasMiddleware(`type`: Middlewares): Boolean = js.native
  @JSName("listener")
  def listener_authentication(eventName: authentication): typingsSlinky.consumableStream.mod.^[AuthenticationData] = js.native
  @JSName("listener")
  def listener_authenticationStateChange(eventName: authenticationStateChange): typingsSlinky.consumableStream.mod.^[AuthStateChangeData] = js.native
  @JSName("listener")
  def listener_badSocketAuthToken(eventName: badSocketAuthToken): typingsSlinky.consumableStream.mod.^[BadSocketAuthTokenData] = js.native
  @JSName("listener")
  def listener_closure(eventName: closure): typingsSlinky.consumableStream.mod.^[ClosureData] = js.native
  @JSName("listener")
  def listener_connection(eventName: connection): typingsSlinky.consumableStream.mod.^[ConnectionData] = js.native
  @JSName("listener")
  def listener_connectionAbort(eventName: connectionAbort): typingsSlinky.consumableStream.mod.^[ConnectionAbortData] = js.native
  @JSName("listener")
  def listener_deauthentication(eventName: deauthentication): typingsSlinky.consumableStream.mod.^[DeauthenticationData] = js.native
  @JSName("listener")
  def listener_disconnection(eventName: disconnection): typingsSlinky.consumableStream.mod.^[DisconnectionData] = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_handshake(eventName: handshake): typingsSlinky.consumableStream.mod.^[Socket] = js.native
  @JSName("listener")
  def listener_subscription(eventName: subscription): typingsSlinky.consumableStream.mod.^[SubscriptionData] = js.native
  @JSName("listener")
  def listener_unsubscription(eventName: unsubscription): typingsSlinky.consumableStream.mod.^[UnsubscriptionData] = js.native
  @JSName("listener")
  def listener_warning(eventName: warning): typingsSlinky.consumableStream.mod.^[Warning] = js.native
  def removeMiddleware(`type`: Middlewares): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(codecEngine: CodecEngine): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_handshake(`type`: handshake, middleware: handshakeMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_inbound(`type`: inbound, middleware: inboundMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_inboundRaw(`type`: inboundRaw, middleware: inboundRawMiddlewareFunction): Unit = js.native
  @JSName("setMiddleware")
  def setMiddleware_outbound(`type`: outbound, middleware: outboundMiddlewareFunction): Unit = js.native
  def verifyHandshake(
    info: Origin,
    callback: js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ]
  ): Unit = js.native
}

