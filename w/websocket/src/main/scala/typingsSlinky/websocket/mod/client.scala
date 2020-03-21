package typingsSlinky.websocket.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.urlMod.Url
import typingsSlinky.websocket.websocketStrings.connect
import typingsSlinky.websocket.websocketStrings.connectFailed
import typingsSlinky.websocket.websocketStrings.httpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "client")
@js.native
class client () extends EventEmitter {
  def this(ClientConfig: IClientConfig) = this()
  var firstDataChunk: Buffer | Null = js.native
  var origin: String = js.native
  var protocols: js.Array[String] = js.native
  var response: IncomingMessage = js.native
  var secure: Boolean = js.native
  var socket: Socket = js.native
  var url: Url = js.native
  /**
    * Will cancel an in-progress connection request before either the `connect` event or the `connectFailed` event has been emitted.
    * If the `connect` or `connectFailed` event has already been emitted, calling `abort()` will do nothing.
    */
  def abort(): Unit = js.native
  @JSName("addListener")
  def addListener_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connectFailed(event: connectFailed, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_httpResponse(
    event: httpResponse,
    cb: js.Function2[/* response */ IncomingMessage, /* client */ this.type, Unit]
  ): this.type = js.native
  def connect(requestUrl: String): Unit = js.native
  def connect(requestUrl: String, protocols: String): Unit = js.native
  def connect(requestUrl: String, protocols: String, origin: String): Unit = js.native
  def connect(requestUrl: String, protocols: String, origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: String,
    protocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, protocols: js.Array[String]): Unit = js.native
  def connect(requestUrl: String, protocols: js.Array[String], origin: String): Unit = js.native
  def connect(requestUrl: String, protocols: js.Array[String], origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: String,
    protocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  /**
    * Establish a connection. The remote server will select the best subprotocol that
    * it supports and send that back when establishing the connection.
    *
    * @param [origin] can be used in user-agent scenarios to identify the page containing
    *                 any scripting content that caused the connection to be requested.
    * @param requestUrl should be a standard websocket url
    */
  def connect(requestUrl: Url): Unit = js.native
  def connect(requestUrl: Url, protocols: String): Unit = js.native
  def connect(requestUrl: Url, protocols: String, origin: String): Unit = js.native
  def connect(requestUrl: Url, protocols: String, origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: Url,
    protocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, protocols: js.Array[String]): Unit = js.native
  def connect(requestUrl: Url, protocols: js.Array[String], origin: String): Unit = js.native
  def connect(requestUrl: Url, protocols: js.Array[String], origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: Url,
    protocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def failHandshake(errorDescription: String): Unit = js.native
  // Events
  @JSName("on")
  def on_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("on")
  def on_connectFailed(event: connectFailed, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_httpResponse(
    event: httpResponse,
    cb: js.Function2[/* response */ IncomingMessage, /* client */ this.type, Unit]
  ): this.type = js.native
  def succeedHandshake(): Unit = js.native
  def validateHandshake(): Unit = js.native
}

