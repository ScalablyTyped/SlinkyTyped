package typingsSlinky.websocket.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.urlMod.Url
import typingsSlinky.websocket.websocketStrings.requestAccepted
import typingsSlinky.websocket.websocketStrings.requestRejected
import typingsSlinky.websocket.websocketStrings.requestResolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("websocket", "request")
@js.native
class request protected () extends EventEmitter {
  def this(socket: Socket, httpRequest: IncomingMessage, config: IServerConfig) = this()
  
  def _handleSocketCloseBeforeAccept(): Unit = js.native
  
  def _removeSocketCloseListeners(): Unit = js.native
  
  var _resolved: Boolean = js.native
  
  var _socketIsClosing: Boolean = js.native
  
  def _verifyResolution(): Unit = js.native
  
  /**
    * After inspecting the `request` properties, call this function on the
    * request object to accept the connection. If you don't have a particular subprotocol
    * you wish to speak, you may pass `null` for the `acceptedProtocol` parameter.
    *
    * @param [acceptedProtocol] case-insensitive value that was requested by the client
    */
  def accept(): connection = js.native
  def accept(
    acceptedProtocol: js.UndefOr[scala.Nothing],
    allowedOrigin: js.UndefOr[scala.Nothing],
    cookies: js.Array[ICookie]
  ): connection = js.native
  def accept(acceptedProtocol: js.UndefOr[scala.Nothing], allowedOrigin: String): connection = js.native
  def accept(acceptedProtocol: js.UndefOr[scala.Nothing], allowedOrigin: String, cookies: js.Array[ICookie]): connection = js.native
  def accept(acceptedProtocol: String): connection = js.native
  def accept(acceptedProtocol: String, allowedOrigin: js.UndefOr[scala.Nothing], cookies: js.Array[ICookie]): connection = js.native
  def accept(acceptedProtocol: String, allowedOrigin: String): connection = js.native
  def accept(acceptedProtocol: String, allowedOrigin: String, cookies: js.Array[ICookie]): connection = js.native
  
  @JSName("addListener")
  def addListener_requestAccepted(event: requestAccepted, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_requestRejected(event: requestRejected, cb: js.Function1[/* request */ this.type, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_requestResolved(event: requestResolved, cb: js.Function1[/* request */ this.type, Unit]): this.type = js.native
  
  var cookies: js.Array[ICookie] = js.native
  
  /** This will include the port number if a non-standard port is used */
  var host: String = js.native
  
  /** A reference to the original Node HTTP request object */
  var httpRequest: IncomingMessage = js.native
  
  /** `Sec-WebSocket-Key` */
  var key: String = js.native
  
  @JSName("on")
  def on_requestAccepted(event: requestAccepted, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("on")
  def on_requestRejected(event: requestRejected, cb: js.Function1[/* request */ this.type, Unit]): this.type = js.native
  // Events
  @JSName("on")
  def on_requestResolved(event: requestResolved, cb: js.Function1[/* request */ this.type, Unit]): this.type = js.native
  
  /**
    * If the client is a web browser, origin will be a string containing the URL
    * of the page containing the script that opened the connection.
    * If the client is not a web browser, origin may be `null` or "*".
    */
  var origin: String = js.native
  
  def parseCookies(str: String): js.Array[ICookie] | Unit = js.native
  
  def parseExtensions(extensionString: String): js.Array[String] = js.native
  
  var protocolFullCaseMap: StringDictionary[String] = js.native
  
  def readHandshake(): Unit = js.native
  
  /**
    * Reject connection.
    * You may optionally pass in an HTTP Status code (such as 404) and a textual
    * description that will be sent to the client in the form of an
    * `X-WebSocket-Reject-Reason` header.
    * Optional extra http headers can be added via Object key/values on extraHeaders.
    */
  def reject(): Unit = js.native
  def reject(httpStatus: js.UndefOr[scala.Nothing], reason: js.UndefOr[scala.Nothing], extraHeaders: js.Object): Unit = js.native
  def reject(httpStatus: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def reject(httpStatus: js.UndefOr[scala.Nothing], reason: String, extraHeaders: js.Object): Unit = js.native
  def reject(httpStatus: Double): Unit = js.native
  def reject(httpStatus: Double, reason: js.UndefOr[scala.Nothing], extraHeaders: js.Object): Unit = js.native
  def reject(httpStatus: Double, reason: String): Unit = js.native
  def reject(httpStatus: Double, reason: String, extraHeaders: js.Object): Unit = js.native
  
  /**
    * Client's IP. If an `X-Forwarded-For` header is present, the value will be taken
    * from that header to facilitate WebSocket servers that live behind a reverse-proxy
    */
  var remoteAddress: String = js.native
  
  var remoteAddresses: js.Array[String] = js.native
  
  /** An array containing a list of extensions requested by the client */
  var requestedExtensions: js.Array[_] = js.native
  
  /**
    * List of strings that indicate the subprotocols the client would like to speak.
    * The server should select the best one that it can support from the list and
    * pass it to the `accept` function when accepting the connection.
    * Note that all the strings in the `requestedProtocols` array will have been
    * converted to lower case.
    */
  var requestedProtocols: js.Array[String] = js.native
  
  /** A string containing the path that was requested by the client */
  var resource: String = js.native
  
  /** Parsed resource, including the query string parameters */
  var resourceURL: Url = js.native
  
  var serverConfig: IServerConfig = js.native
  
  var socket: Socket = js.native
  
  /** The version of the WebSocket protocol requested by the client */
  var webSocketVersion: Double = js.native
}
