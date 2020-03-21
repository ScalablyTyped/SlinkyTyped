package typingsSlinky.socketclusterClient.clientsocketMod

import typingsSlinky.agChannel.mod.Client
import typingsSlinky.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsSlinky.scErrors.mod.SocketProtocolErrorStatuses_
import typingsSlinky.scErrors.mod.SocketProtocolIgnoreStatuses_
import typingsSlinky.socketclusterClient.AnonAckTimeout
import typingsSlinky.socketclusterClient.AnonChannel
import typingsSlinky.socketclusterClient.AnonError
import typingsSlinky.socketclusterClient.AnonOldAuthToken
import typingsSlinky.socketclusterClient.authMod.AGAuthEngine
import typingsSlinky.socketclusterClient.socketclusterClientStrings.authStateChange
import typingsSlinky.socketclusterClient.socketclusterClientStrings.authenticate
import typingsSlinky.socketclusterClient.socketclusterClientStrings.authenticated
import typingsSlinky.socketclusterClient.socketclusterClientStrings.close
import typingsSlinky.socketclusterClient.socketclusterClientStrings.closed
import typingsSlinky.socketclusterClient.socketclusterClientStrings.connect
import typingsSlinky.socketclusterClient.socketclusterClientStrings.connectAbort
import typingsSlinky.socketclusterClient.socketclusterClientStrings.connecting
import typingsSlinky.socketclusterClient.socketclusterClientStrings.deauthenticate
import typingsSlinky.socketclusterClient.socketclusterClientStrings.disconnect
import typingsSlinky.socketclusterClient.socketclusterClientStrings.error
import typingsSlinky.socketclusterClient.socketclusterClientStrings.kickOut
import typingsSlinky.socketclusterClient.socketclusterClientStrings.open
import typingsSlinky.socketclusterClient.socketclusterClientStrings.pending
import typingsSlinky.socketclusterClient.socketclusterClientStrings.removeAuthToken
import typingsSlinky.socketclusterClient.socketclusterClientStrings.subscribe
import typingsSlinky.socketclusterClient.socketclusterClientStrings.subscribeFail
import typingsSlinky.socketclusterClient.socketclusterClientStrings.subscribeRequest
import typingsSlinky.socketclusterClient.socketclusterClientStrings.subscribeStateChange
import typingsSlinky.socketclusterClient.socketclusterClientStrings.subscribed
import typingsSlinky.socketclusterClient.socketclusterClientStrings.unauthenticated
import typingsSlinky.socketclusterClient.socketclusterClientStrings.unsubscribe
import typingsSlinky.socketclusterClient.socketclusterClientStrings.unsubscribed
import typingsSlinky.socketclusterServer.serverMod.CodecEngine
import typingsSlinky.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGClientSocket
  extends AsyncStreamEmitter[js.Any]
     with Client {
  val AUTHENTICATED: authenticated = js.native
  val CLOSED: closed = js.native
  val CONNECTING: connecting = js.native
  val OPEN: open = js.native
  val PENDING: pending = js.native
  val SUBSCRIBED: subscribed = js.native
  val UNAUTHENTICATED: unauthenticated = js.native
  val UNSUBSCRIBED: unsubscribed = js.native
  var ackTimeout: Double = js.native
  var auth: AGAuthEngine = js.native
  var authState: AuthStates = js.native
  var authToken: js.Object | Null = js.native
  var authTokenName: String = js.native
  var batchOnHandshake: Boolean = js.native
  var batchOnHandshakeDuration: Double = js.native
  var channelPrefix: String | Null = js.native
  var clientId: js.UndefOr[String] = js.native
  var codec: CodecEngine = js.native
  var connectAttempts: Double = js.native
  var connectTimeout: Double = js.native
  var disconnectOnUnload: Boolean = js.native
  val errorStatuses: SocketProtocolErrorStatuses_ = js.native
  var id: String | Null = js.native
  val ignoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  var isBatching: Boolean = js.native
  var isBufferingBatch: Boolean = js.native
  var options: ClientOptions = js.native
  var pendingReconnect: Boolean = js.native
  var pendingReconnectTimeout: Double = js.native
  var pingTimeout: Double = js.native
  var pingTimeoutDisabled: Boolean = js.native
  var poolIndex: js.UndefOr[Double] = js.native
  var preparingPendingSubscriptions: Boolean = js.native
  var protocolVersion: ProtocolVersions = js.native
  var signedAuthToken: String | Null = js.native
  var state: States = js.native
  var transport: js.UndefOr[typingsSlinky.socketclusterClient.transportMod.^] = js.native
  var version: String | Null = js.native
  var wsOptions: js.UndefOr[typingsSlinky.ws.mod.ClientOptions] = js.native
  // Perform client-initiated authentication by providing an encrypted token string.
  def authenticate(signedAuthToken: String): js.Promise[AuthStatus] = js.native
  def cancelBatch(): Unit = js.native
  def cancelBatching(): Unit = js.native
  // ---- Channel logic ----
  def channel(channelName: String): typingsSlinky.agChannel.mod.^[_] = js.native
  def closeAllChannelListeners(): Unit = js.native
  def closeAllChannelOutputs(): Unit = js.native
  def closeAllChannels(): Unit = js.native
  def closeAllProcedures(): Unit = js.native
  def closeAllReceivers(): Unit = js.native
  def closeProcedure(procedureName: String): Unit = js.native
  def closeReceiver(receiverName: String): Unit = js.native
  def connect(): Unit = js.native
  def deauthenticate(): js.Promise[Unit] = js.native
  def decode(message: js.Any): js.Any = js.native
  def decodeBase64(encodedString: String): String = js.native
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange, data: AuthStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_authenticate(eventName: authenticate, data: AuthenticateData): Unit = js.native
  @JSName("emit")
  def emit_close(eventName: close, data: CloseData): Unit = js.native
  @JSName("emit")
  def emit_connect(eventName: connect, data: ConnectData): Unit = js.native
  @JSName("emit")
  def emit_connectAbort(eventName: connectAbort, data: CloseData): Unit = js.native
  @JSName("emit")
  def emit_connecting(eventName: connecting, data: js.Object): Unit = js.native
  @JSName("emit")
  def emit_deauthenticate(eventName: deauthenticate, data: DeauthenticateData): Unit = js.native
  @JSName("emit")
  def emit_disconnect(eventName: disconnect, data: CloseData): Unit = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_kickOut(eventName: kickOut, data: KickOutData): Unit = js.native
  @JSName("emit")
  def emit_removeAuthToken(eventName: removeAuthToken, data: AnonOldAuthToken): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(eventName: subscribeFail, data: SubscribeFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribeRequest(eventName: subscribeRequest, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeStateChange(eventName: subscribeStateChange, data: SubscribeStateChangeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def encodeBase64(decodedString: String): String = js.native
  def flushBatch(): Unit = js.native
  def getAllChannelListenersBackpressure(): Double = js.native
  def getAllChannelListenersConsumerStatsList(): js.Array[_] = js.native
  def getAllChannelOutputsBackpressure(): Double = js.native
  def getAllChannelOutputsConsumerStatsList(): js.Array[_] = js.native
  def getAllChannelsBackpressure(): Double = js.native
  def getAllProceduresBackpressure(): Double = js.native
  def getAllProceduresConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAllReceiversBackpressure(): Double = js.native
  def getAllReceiversConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def getAuthToken(): js.Object | Null = js.native
  /* AGChannel.Client end */
  def getBackpressure(): Double = js.native
  def getBytesReceived(): Double = js.native
  def getProcedureBackpressure(procedureName: String): Double = js.native
  def getProcedureConsumerBackpressure(consumerId: Double): Double = js.native
  def getProcedureConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getProcedureConsumerStatsList(procedureName: String): js.Array[ConsumerStats] = js.native
  def getReceiverBackpressure(receiverName: String): Double = js.native
  def getReceiverConsumerBackpressure(consumerId: Double): Double = js.native
  def getReceiverConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getReceiverConsumerStatsList(receiverName: String): js.Array[ConsumerStats] = js.native
  def getSignedAuthToken(): String | Null = js.native
  def getState(): States = js.native
  def hasAnyChannelListenerConsumer(consumerId: js.Any): Boolean = js.native
  def hasAnyChannelOutputConsumer(consumerId: js.Any): Boolean = js.native
  def hasAnyProcedureConsumer(consumerId: Double): Boolean = js.native
  def hasAnyReceiverConsumer(consumerId: Double): Boolean = js.native
  def hasProcedureConsumer(procedureName: String, consumerId: Double): Boolean = js.native
  def hasReceiverConsumer(receiverName: String, consumerId: Double): Boolean = js.native
  def invoke[T](event: String, data: T): js.Promise[T] = js.native
  def invoke[T](event: String, data: T, options: AnonAckTimeout): js.Promise[T] = js.native
  def invokePublish[T](channelName: String, data: T): js.Promise[AnonChannel[T]] = js.native
  def killAllChannelListeners(): Unit = js.native
  def killAllChannelOutputs(): Unit = js.native
  def killAllChannels(): Unit = js.native
  def killAllProcedures(): Unit = js.native
  def killAllReceivers(): Unit = js.native
  def killProcedure(procedureName: String): Unit = js.native
  def killProcedureConsumer(consumerId: Double): Unit = js.native
  def killReceiver(receiverName: String): Unit = js.native
  def killReceiverConsumer(consumerId: Double): Unit = js.native
  @JSName("listener")
  def listener_authStateChange(eventName: authStateChange): typingsSlinky.consumableStream.mod.^[AuthStateChangeData] = js.native
  @JSName("listener")
  def listener_authenticate(eventName: authenticate): typingsSlinky.consumableStream.mod.^[AuthenticateData] = js.native
  @JSName("listener")
  def listener_close(eventName: close): typingsSlinky.consumableStream.mod.^[CloseData] = js.native
  @JSName("listener")
  def listener_connect(eventName: connect): typingsSlinky.consumableStream.mod.^[ConnectData] = js.native
  @JSName("listener")
  def listener_connectAbort(eventName: connectAbort): typingsSlinky.consumableStream.mod.^[CloseData] = js.native
  @JSName("listener")
  def listener_connecting(eventName: connecting): typingsSlinky.consumableStream.mod.^[js.Object] = js.native
  @JSName("listener")
  def listener_deauthenticate(eventName: deauthenticate): typingsSlinky.consumableStream.mod.^[DeauthenticateData] = js.native
  @JSName("listener")
  def listener_disconnect(eventName: disconnect): typingsSlinky.consumableStream.mod.^[CloseData] = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[AnonError] = js.native
  @JSName("listener")
  def listener_kickOut(eventName: kickOut): typingsSlinky.consumableStream.mod.^[KickOutData] = js.native
  @JSName("listener")
  def listener_removeAuthToken(eventName: removeAuthToken): typingsSlinky.consumableStream.mod.^[AnonOldAuthToken] = js.native
  @JSName("listener")
  def listener_subscribe(eventName: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(eventName: subscribeFail): typingsSlinky.consumableStream.mod.^[SubscribeFailData] = js.native
  @JSName("listener")
  def listener_subscribeRequest(eventName: subscribeRequest): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeStateChange(eventName: subscribeStateChange): typingsSlinky.consumableStream.mod.^[SubscribeStateChangeData] = js.native
  @JSName("listener")
  def listener_unsubscribe(eventName: unsubscribe): typingsSlinky.consumableStream.mod.^[UnsubscribeData] = js.native
  // ---- Procedure logic ----
  def procedure(procedureName: String): typingsSlinky.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def processPendingSubscriptions(): Unit = js.native
  // ---- Receiver logic ----
  def receiver(receiverName: String): typingsSlinky.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def reconnect(): Unit = js.native
  def reconnect(code: Double): Unit = js.native
  def reconnect(code: Double, reason: String): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def startBatch(): Unit = js.native
  def startBatching(): Unit = js.native
  def stopBatching(): Unit = js.native
  def subscribe(channelName: String, options: SubscribeOptions): typingsSlinky.agChannel.mod.^[_] = js.native
  // ---- Subscriptions ----
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def transmit(event: String, data: js.Any): js.Promise[Unit] = js.native
  def transmit(event: String, data: js.Any, options: AnonAckTimeout): js.Promise[Unit] = js.native
}

