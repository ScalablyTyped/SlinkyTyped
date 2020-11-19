package typingsSlinky.socketclusterClient.transportMod

import typingsSlinky.socketclusterClient.authMod.AGAuthEngine
import typingsSlinky.socketclusterClient.clientsocketMod.CallIdGenerator
import typingsSlinky.socketclusterClient.clientsocketMod.ClientOptions
import typingsSlinky.socketclusterClient.clientsocketMod.ProtocolVersions
import typingsSlinky.socketclusterClient.clientsocketMod.States
import typingsSlinky.socketclusterClient.socketclusterClientStrings.closed
import typingsSlinky.socketclusterClient.socketclusterClientStrings.connecting
import typingsSlinky.socketclusterClient.socketclusterClientStrings.open
import typingsSlinky.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGTransport extends js.Object {
  
  val CLOSED: closed = js.native
  
  val CONNECTING: connecting = js.native
  
  val OPEN: open = js.native
  
  var auth: AGAuthEngine = js.native
  
  var authTokenName: String = js.native
  
  def callIdGenerator(): Double = js.native
  @JSName("callIdGenerator")
  var callIdGenerator_Original: CallIdGenerator = js.native
  
  def cancelBatch(): Unit = js.native
  
  def cancelPendingResponse(cid: Double): Unit = js.native
  
  def clearAllListeners(): Unit = js.native
  
  def close(): Unit = js.native
  def close(code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  
  var codec: CodecEngine = js.native
  
  var connectTimeout: Double = js.native
  
  def decode(message: js.Any): js.Any = js.native
  
  def encode(`object`: js.Any): js.Any = js.native
  
  def flushBatch(): Unit = js.native
  
  def invoke[T](event: String, data: T, options: InvokeOptions): js.Promise[T] = js.native
  
  def invokeRaw(event: String, data: js.Any, options: InvokeOptions): Double | Null = js.native
  def invokeRaw(event: String, data: js.Any, options: InvokeOptions, callback: EventObjectCallback): Double | Null = js.native
  
  var isBufferingBatch: Boolean = js.native
  
  var options: ClientOptions = js.native
  
  var pingTimeout: Double = js.native
  
  var pingTimeoutDisabled: Boolean = js.native
  
  var protocolVersion: ProtocolVersions = js.native
  
  def send(data: js.Any): Unit = js.native
  
  def sendObject(`object`: js.Any): Unit = js.native
  
  def serializeObject(`object`: js.Any): js.Any = js.native
  
  var socket: typingsSlinky.ws.mod.^ = js.native
  
  def startBatch(): Unit = js.native
  
  var state: States = js.native
  
  def transmit(event: String, data: js.Any, options: TransmitOptions): js.Promise[Unit] = js.native
  
  def transmitObject(eventObject: EventObject): Double | Null = js.native
  
  def uri(): String = js.native
  
  var wsOptions: js.UndefOr[typingsSlinky.ws.mod.ClientOptions] = js.native
}
