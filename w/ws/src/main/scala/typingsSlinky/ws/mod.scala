package typingsSlinky.ws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.DuplexOptions
import typingsSlinky.node.tlsMod.SecureContextOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.node.zlibMod.ZlibOptions
import typingsSlinky.std.Set
import typingsSlinky.ws.anon.Binary
import typingsSlinky.ws.anon.ChunkSize
import typingsSlinky.ws.anon.Code
import typingsSlinky.ws.anon.Error
import typingsSlinky.ws.anon.Origin
import typingsSlinky.ws.anon.Target
import typingsSlinky.ws.wsStrings.`unexpected-response`
import typingsSlinky.ws.wsStrings.close
import typingsSlinky.ws.wsStrings.connection
import typingsSlinky.ws.wsStrings.error
import typingsSlinky.ws.wsStrings.headers
import typingsSlinky.ws.wsStrings.listening
import typingsSlinky.ws.wsStrings.message
import typingsSlinky.ws.wsStrings.open
import typingsSlinky.ws.wsStrings.ping
import typingsSlinky.ws.wsStrings.pong
import typingsSlinky.ws.wsStrings.upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // WebSocket socket.
  @JSImport("ws", JSImport.Namespace)
  @js.native
  class ^ protected () extends WebSocket {
    def this(address: String) = this()
    def this(address: URL_) = this()
    def this(address: String, options: ClientRequestArgs) = this()
    def this(address: String, options: ClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: URL_, options: ClientRequestArgs) = this()
    def this(address: URL_, options: ClientOptions) = this()
    def this(address: URL_, protocols: String) = this()
    def this(address: URL_, protocols: js.Array[String]) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: String, protocols: String, options: ClientRequestArgs) = this()
    def this(address: String, protocols: String, options: ClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.UndefOr[scala.Nothing], options: ClientOptions) = this()
    def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: String, options: ClientOptions) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
  }
  @JSImport("ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("ws", "CLOSED")
  @js.native
  def CLOSED: Double = js.native
  @scala.inline
  def CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("ws", "CLOSING")
  @js.native
  def CLOSING: Double = js.native
  @scala.inline
  def CLOSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("ws", "CONNECTING")
  @js.native
  def CONNECTING: Double = js.native
  @scala.inline
  def CONNECTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("ws", "OPEN")
  @js.native
  def OPEN: Double = js.native
  @scala.inline
  def OPEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  // WebSocket Server
  @JSImport("ws", "Server")
  @js.native
  class Server () extends EventEmitter {
    def this(options: ServerOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]) = this()
    def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, cb: js.Function0[Unit]): this.type = js.native
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
    
    var clients: Set[WebSocket] = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def handleUpgrade(
      request: IncomingMessage,
      socket: Socket,
      upgradeHead: Buffer,
      callback: js.Function2[/* client */ WebSocket, /* request */ IncomingMessage, Unit]
    ): Unit = js.native
    
    def off(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("off")
    def off_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("off")
    def off_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("off")
    def off_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ this.type, 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("off")
    def off_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    // Events
    @JSName("on")
    def on_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ this.type, 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("once")
    def once_connection(
      event: connection,
      cb: js.ThisFunction2[/* this */ this.type, /* socket */ WebSocket, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_headers(
      event: headers,
      cb: js.ThisFunction2[
          /* this */ this.type, 
          /* headers */ js.Array[String], 
          /* request */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_listening(event: listening, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    
    var options: ServerOptions = js.native
    
    var path: String = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, cb: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_headers(
      event: headers,
      cb: js.Function2[/* headers */ js.Array[String], /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_listening(event: listening, cb: js.Function0[Unit]): this.type = js.native
    
    def shouldHandle(request: IncomingMessage): Boolean | js.Promise[Boolean] = js.native
  }
  
  // WebSocket stream
  @JSImport("ws", "createWebSocketStream")
  @js.native
  def createWebSocketStream(websocket: WebSocket): Duplex = js.native
  @JSImport("ws", "createWebSocketStream")
  @js.native
  def createWebSocketStream(websocket: WebSocket, options: DuplexOptions): Duplex = js.native
  
  @js.native
  trait AddressInfo extends StObject {
    
    var address: String = js.native
    
    var family: String = js.native
    
    var port: Double = js.native
  }
  object AddressInfo {
    
    @scala.inline
    def apply(address: String, family: String, port: Double): AddressInfo = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressInfo]
    }
    
    @scala.inline
    implicit class AddressInfoMutableBuilder[Self <: AddressInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * CertMeta represents the accepted types for certificate & key data.
    */
  type CertMeta = String | (js.Array[Buffer | String]) | Buffer
  
  @js.native
  trait ClientOptions extends SecureContextOptions {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var checkServerIdentity: js.UndefOr[js.Function2[/* servername */ String, /* cert */ CertMeta, Boolean]] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var handshakeTimeout: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxPayload: js.UndefOr[Double] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var protocolVersion: js.UndefOr[Double] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setCheckServerIdentity(value: (/* servername */ String, /* cert */ CertMeta) => Boolean): Self = StObject.set(x, "checkServerIdentity", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckServerIdentityUndefined: Self = StObject.set(x, "checkServerIdentity", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setHandshakeTimeout(value: Double): Self = StObject.set(x, "handshakeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandshakeTimeoutUndefined: Self = StObject.set(x, "handshakeTimeout", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxPayload(value: Double): Self = StObject.set(x, "maxPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPayloadUndefined: Self = StObject.set(x, "maxPayload", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  @js.native
  trait CloseEvent extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
    
    var target: WebSocket = js.native
    
    var wasClean: Boolean = js.native
  }
  object CloseEvent {
    
    @scala.inline
    def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): CloseEvent = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseEvent]
    }
    
    @scala.inline
    implicit class CloseEventMutableBuilder[Self <: CloseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Data represents the message payload received over the WebSocket.
    */
  type Data = String | Buffer | js.typedarray.ArrayBuffer | js.Array[Buffer]
  
  @js.native
  trait ErrorEvent extends StObject {
    
    var error: js.Any = js.native
    
    var message: String = js.native
    
    var target: WebSocket = js.native
    
    var `type`: String = js.native
  }
  object ErrorEvent {
    
    @scala.inline
    def apply(error: js.Any, message: String, target: WebSocket, `type`: String): ErrorEvent = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorEvent]
    }
    
    @scala.inline
    implicit class ErrorEventMutableBuilder[Self <: ErrorEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventListenerOptions extends StObject {
    
    var once: js.UndefOr[Boolean] = js.native
  }
  object EventListenerOptions {
    
    @scala.inline
    def apply(): EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListenerOptions]
    }
    
    @scala.inline
    implicit class EventListenerOptionsMutableBuilder[Self <: EventListenerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    }
  }
  
  @js.native
  trait MessageEvent extends StObject {
    
    var data: Data = js.native
    
    var target: WebSocket = js.native
    
    var `type`: String = js.native
  }
  object MessageEvent {
    
    @scala.inline
    def apply(data: Data, target: WebSocket, `type`: String): MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    @scala.inline
    implicit class MessageEventMutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Buffer*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenEvent extends StObject {
    
    var target: WebSocket = js.native
  }
  object OpenEvent {
    
    @scala.inline
    def apply(target: WebSocket): OpenEvent = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenEvent]
    }
    
    @scala.inline
    implicit class OpenEventMutableBuilder[Self <: OpenEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PerMessageDeflateOptions extends StObject {
    
    var clientMaxWindowBits: js.UndefOr[Double] = js.native
    
    var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
    
    var concurrencyLimit: js.UndefOr[Double] = js.native
    
    var serverMaxWindowBits: js.UndefOr[Double] = js.native
    
    var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var zlibDeflateOptions: js.UndefOr[ChunkSize] = js.native
    
    var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.native
  }
  object PerMessageDeflateOptions {
    
    @scala.inline
    def apply(): PerMessageDeflateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PerMessageDeflateOptions]
    }
    
    @scala.inline
    implicit class PerMessageDeflateOptionsMutableBuilder[Self <: PerMessageDeflateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientMaxWindowBits(value: Double): Self = StObject.set(x, "clientMaxWindowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientMaxWindowBitsUndefined: Self = StObject.set(x, "clientMaxWindowBits", js.undefined)
      
      @scala.inline
      def setClientNoContextTakeover(value: Boolean): Self = StObject.set(x, "clientNoContextTakeover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientNoContextTakeoverUndefined: Self = StObject.set(x, "clientNoContextTakeover", js.undefined)
      
      @scala.inline
      def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
      
      @scala.inline
      def setServerMaxWindowBits(value: Double): Self = StObject.set(x, "serverMaxWindowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerMaxWindowBitsUndefined: Self = StObject.set(x, "serverMaxWindowBits", js.undefined)
      
      @scala.inline
      def setServerNoContextTakeover(value: Boolean): Self = StObject.set(x, "serverNoContextTakeover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerNoContextTakeoverUndefined: Self = StObject.set(x, "serverNoContextTakeover", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setZlibDeflateOptions(value: ChunkSize): Self = StObject.set(x, "zlibDeflateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlibDeflateOptionsUndefined: Self = StObject.set(x, "zlibDeflateOptions", js.undefined)
      
      @scala.inline
      def setZlibInflateOptions(value: ZlibOptions): Self = StObject.set(x, "zlibInflateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlibInflateOptionsUndefined: Self = StObject.set(x, "zlibInflateOptions", js.undefined)
    }
  }
  
  @js.native
  trait ServerOptions extends StObject {
    
    var backlog: js.UndefOr[Double] = js.native
    
    var clientTracking: js.UndefOr[Boolean] = js.native
    
    var handleProtocols: js.UndefOr[js.Any] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var maxPayload: js.UndefOr[Double] = js.native
    
    var noServer: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var perMessageDeflate: js.UndefOr[Boolean | PerMessageDeflateOptions] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var server: js.UndefOr[typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server] = js.native
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      @scala.inline
      def setClientTracking(value: Boolean): Self = StObject.set(x, "clientTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTrackingUndefined: Self = StObject.set(x, "clientTracking", js.undefined)
      
      @scala.inline
      def setHandleProtocols(value: js.Any): Self = StObject.set(x, "handleProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleProtocolsUndefined: Self = StObject.set(x, "handleProtocols", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMaxPayload(value: Double): Self = StObject.set(x, "maxPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPayloadUndefined: Self = StObject.set(x, "maxPayload", js.undefined)
      
      @scala.inline
      def setNoServer(value: Boolean): Self = StObject.set(x, "noServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoServerUndefined: Self = StObject.set(x, "noServer", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPerMessageDeflate(value: Boolean | PerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setServer(value: typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "verifyClient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyClientFunction2(
        value: (/* info */ Origin, /* callback */ js.Function4[
              /* res */ Boolean, 
              /* code */ js.UndefOr[Double], 
              /* message */ js.UndefOr[String], 
              /* headers */ js.UndefOr[OutgoingHttpHeaders], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    }
  }
  
  /**
    * VerifyClientCallbackAsync is an asynchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackAsync = js.Function2[
    /* info */ Origin, 
    /* callback */ js.Function4[
      /* res */ Boolean, 
      /* code */ js.UndefOr[Double], 
      /* message */ js.UndefOr[String], 
      /* headers */ js.UndefOr[OutgoingHttpHeaders], 
      Unit
    ], 
    Unit
  ]
  
  /**
    * VerifyClientCallbackSync is a synchronous callback used to inspect the
    * incoming message. The return value (boolean) of the function determines
    * whether or not to accept the handshake.
    */
  type VerifyClientCallbackSync = js.Function1[/* info */ Origin, Boolean]
  
  // WebSocket socket.
  @js.native
  trait WebSocket extends EventEmitter {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
    
    def addEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
    def addEventListener(method: String, listener: js.Function0[Unit], options: EventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close, cb: js.Function1[/* event */ Code, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close, cb: js.Function1[/* event */ Code, Unit], options: EventListenerOptions): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* event */ Error, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* event */ Error, Unit], options: EventListenerOptions): Unit = js.native
    // HTML5 WebSocket events
    @JSName("addEventListener")
    def addEventListener_message(method: message, cb: js.Function1[/* event */ typingsSlinky.ws.anon.Data, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      method: message,
      cb: js.Function1[/* event */ typingsSlinky.ws.anon.Data, Unit],
      options: EventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open, cb: js.Function1[/* event */ Target, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open, cb: js.Function1[/* event */ Target, Unit], options: EventListenerOptions): Unit = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unexpectedresponse(
      event: `unexpected-response`,
      listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("addListener")
    def addListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
    
    var binaryType: String = js.native
    
    var bufferedAmount: Double = js.native
    
    def close(): Unit = js.native
    def close(code: js.UndefOr[scala.Nothing], data: String): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, data: String): Unit = js.native
    
    var extensions: String = js.native
    
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    // Events
    @JSName("on")
    def on_close(
      event: close,
      listener: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* reason */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.ThisFunction1[/* this */ this.type, /* data */ Data, Unit]): this.type = js.native
    @JSName("on")
    def on_open(event: open, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_ping(event: ping, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_pong(event: pong, listener: js.ThisFunction1[/* this */ this.type, /* data */ Buffer, Unit]): this.type = js.native
    @JSName("on")
    def on_unexpectedresponse(
      event: `unexpected-response`,
      listener: js.ThisFunction2[
          /* this */ this.type, 
          /* request */ ClientRequest, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_upgrade(
      event: upgrade,
      listener: js.ThisFunction1[/* this */ this.type, /* request */ IncomingMessage, Unit]
    ): this.type = js.native
    
    def onclose(event: CloseEvent): Unit = js.native
    
    def onerror(event: ErrorEvent): Unit = js.native
    
    def onmessage(event: MessageEvent): Unit = js.native
    
    def onopen(event: OpenEvent): Unit = js.native
    
    def ping(): Unit = js.native
    def ping(
      data: js.UndefOr[scala.Nothing],
      mask: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    def ping(data: js.UndefOr[scala.Nothing], mask: Boolean): Unit = js.native
    def ping(data: js.UndefOr[scala.Nothing], mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def ping(data: js.Any): Unit = js.native
    def ping(data: js.Any, mask: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def ping(data: js.Any, mask: Boolean): Unit = js.native
    def ping(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def pong(): Unit = js.native
    def pong(
      data: js.UndefOr[scala.Nothing],
      mask: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    def pong(data: js.UndefOr[scala.Nothing], mask: Boolean): Unit = js.native
    def pong(data: js.UndefOr[scala.Nothing], mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def pong(data: js.Any): Unit = js.native
    def pong(data: js.Any, mask: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def pong(data: js.Any, mask: Boolean): Unit = js.native
    def pong(data: js.Any, mask: Boolean, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    var protocol: String = js.native
    
    var readyState: Double = js.native
    
    def removeEventListener(method: String): Unit = js.native
    def removeEventListener(method: String, listener: js.Function0[Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(method: close): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_close(method: close, cb: js.Function1[/* event */ Code, Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(method: error): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(method: error, cb: js.Function1[/* event */ Error, Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(method: message): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(method: message, cb: js.Function1[/* event */ typingsSlinky.ws.anon.Data, Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(method: open): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(method: open, cb: js.Function1[/* event */ Target, Unit]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function1[/* data */ Data, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_open(event: open, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_ping(event: ping, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pong(event: pong, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unexpectedresponse(
      event: `unexpected-response`,
      listener: js.Function2[/* request */ ClientRequest, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_upgrade(event: upgrade, listener: js.Function1[/* request */ IncomingMessage, Unit]): this.type = js.native
    
    def send(data: js.Any): Unit = js.native
    def send(data: js.Any, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def send(data: js.Any, options: Binary): Unit = js.native
    def send(data: js.Any, options: Binary, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def terminate(): Unit = js.native
    
    var url: String = js.native
  }
}
