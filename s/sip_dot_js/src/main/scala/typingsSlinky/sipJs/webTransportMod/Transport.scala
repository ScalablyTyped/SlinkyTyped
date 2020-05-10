package typingsSlinky.sipJs.webTransportMod

import org.scalajs.dom.raw.WebSocket
import typingsSlinky.events.mod.EventEmitter
import typingsSlinky.sipJs.coreMod.Logger
import typingsSlinky.sipJs.sipJsStrings.connected
import typingsSlinky.sipJs.sipJsStrings.connecting
import typingsSlinky.sipJs.sipJsStrings.disconnected
import typingsSlinky.sipJs.sipJsStrings.disconnecting
import typingsSlinky.sipJs.sipJsStrings.message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/transport", "Transport")
@js.native
class Transport protected ()
  extends EventEmitter
     with typingsSlinky.sipJs.transportMod.Transport {
  def this(logger: Logger) = this()
  def this(logger: Logger, options: TransportOptions) = this()
  var _connect: js.Any = js.native
  var _disconnect: js.Any = js.native
  var _protocol: js.Any = js.native
  var _send: js.Any = js.native
  var _state: js.Any = js.native
  var _stateEventEmitter: js.Any = js.native
  var _ws: js.Any = js.native
  var clearKeepAliveTimeout: js.Any = js.native
  var configuration: js.Any = js.native
  var connectPromise: js.Any = js.native
  var connectReject: js.Any = js.native
  var connectResolve: js.Any = js.native
  var connectTimeout: js.Any = js.native
  var disconnectPromise: js.Any = js.native
  var disconnectReject: js.Any = js.native
  var disconnectResolve: js.Any = js.native
  var keepAliveDebounceTimeout: js.Any = js.native
  var keepAliveInterval: js.Any = js.native
  var logger: js.Any = js.native
  /**
    * WebSocket "onclose" event handler.
    * @param ev - Event.
    */
  var onWebSocketClose: js.Any = js.native
  /**
    * WebSocket "onerror" event handler.
    * @param ev - Event.
    */
  var onWebSocketError: js.Any = js.native
  /**
    * WebSocket "onmessage" event handler.
    * @param ev - Event.
    */
  var onWebSocketMessage: js.Any = js.native
  /**
    * WebSocket "onopen" event handler.
    * @param ev - Event.
    */
  var onWebSocketOpen: js.Any = js.native
  /**
    * Send a keep-alive (a double-CRLF sequence).
    */
  var sendKeepAlive: js.Any = js.native
  /**
    * The URL of the WebSocket Server.
    */
  val server: String = js.native
  /**
    * Start sending keep-alives.
    */
  var startSendingKeepAlives: js.Any = js.native
  /**
    * Stop sending keep-alives.
    */
  var stopSendingKeepAlives: js.Any = js.native
  /**
    * Helper function to generate an Error.
    * @param state State transitioning to.
    */
  var transitionLoopDetectedError: js.Any = js.native
  /**
    * Transition transport state.
    * @internal
    */
  var transitionState: js.Any = js.native
  var transitioningState: js.Any = js.native
  /**
    * The WebSocket.
    */
  val ws: js.UndefOr[WebSocket] = js.native
  /**
    * Add listener for connection events.
    * @deprecated Use `onConnected`, `onDisconnected` and/or `stateChange`.
    */
  @JSName("on")
  def on_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnecting(event: disconnecting, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Add listener for message event.
    * @deprecated Use `onMessage`.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
}

/* static members */
@JSImport("sip.js/lib/platform/web/transport", "Transport")
@js.native
object Transport extends js.Object {
  var defaultOptions: js.Any = js.native
}

