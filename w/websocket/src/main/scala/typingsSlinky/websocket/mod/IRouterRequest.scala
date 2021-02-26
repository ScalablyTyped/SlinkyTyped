package typingsSlinky.websocket.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.urlMod.Url
import typingsSlinky.websocket.websocketStrings.requestAccepted
import typingsSlinky.websocket.websocketStrings.requestRejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterRequest extends EventEmitter {
  
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
  
  var cookies: js.Array[ICookie] = js.native
  
  /** A reference to the original Node HTTP request object */
  var httpRequest: IncomingMessage = js.native
  
  // Events
  @JSName("on")
  def on_requestAccepted(event: requestAccepted, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("on")
  def on_requestRejected(event: requestRejected, cb: js.Function1[/* request */ this.type, Unit]): this.type = js.native
  
  /**
    * If the client is a web browser, origin will be a string containing the URL
    * of the page containing the script that opened the connection.
    * If the client is not a web browser, origin may be `null` or "*".
    */
  var origin: String = js.native
  
  var protocol: String | Null = js.native
  
  /**
    * Reject connection.
    * You may optionally pass in an HTTP Status code (such as 404) and a textual
    * description that will be sent to the client in the form of an
    * `X-WebSocket-Reject-Reason` header.
    */
  def reject(): Unit = js.native
  def reject(httpStatus: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def reject(httpStatus: Double): Unit = js.native
  def reject(httpStatus: Double, reason: String): Unit = js.native
  
  /**
    * Client's IP. If an `X-Forwarded-For` header is present, the value will be taken
    * from that header to facilitate WebSocket servers that live behind a reverse-proxy
    */
  var remoteAddress: String = js.native
  
  /** An array containing a list of extensions requested by the client */
  var requestedExtensions: js.Array[_] = js.native
  
  /** A string containing the path that was requested by the client */
  var resource: String = js.native
  
  /** Parsed resource, including the query string parameters */
  var resourceURL: Url = js.native
  
  var webSocketRequest: request = js.native
  
  /** The version of the WebSocket protocol requested by the client */
  var webSocketVersion: Double = js.native
}
