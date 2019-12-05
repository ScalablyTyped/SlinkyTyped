package typingsSlinky.ws.wsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.netMod.Socket
import typingsSlinky.std.Set
import typingsSlinky.ws.wsStrings.connection
import typingsSlinky.ws.wsStrings.error
import typingsSlinky.ws.wsStrings.headers
import typingsSlinky.ws.wsStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket Server
@JSImport("ws", "Server")
@js.native
class Server () extends EventEmitter {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
  var clients: Set[WebSocket] = js.native
  var options: ServerOptions = js.native
  var path: String = js.native
  @JSName("addListener")
  def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: headers,
    cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
  def address(): AddressInfo | String = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def handleUpgrade(
    request: IncomingMessage,
    socket: Socket,
    upgradeHead: Buffer,
    callback: js.Function1[/* client */ WebSocket, Unit]
  ): Unit = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ WebSocket, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ WebSocket, /* repeated */ js.Any, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_connection(
    event: connection,
    cb: js.ThisFunction2[/* this */ WebSocket, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.ThisFunction1[/* this */ WebSocket, /* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(
    event: headers,
    cb: js.ThisFunction2[
      /* this */ WebSocket, 
      /* headers */ js.Array[String], 
      /* request */ IncomingMessage, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: listening, cb: js.ThisFunction0[/* this */ WebSocket, Unit]): this.type = js.native
  def shouldHandle(request: IncomingMessage): Boolean = js.native
}

