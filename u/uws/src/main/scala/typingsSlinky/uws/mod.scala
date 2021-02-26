package typingsSlinky.uws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.uws.anon.Binary
import typingsSlinky.uws.anon.BinaryBoolean
import typingsSlinky.uws.anon.Code
import typingsSlinky.uws.anon.Data
import typingsSlinky.uws.anon.Origin
import typingsSlinky.uws.anon.Reason
import typingsSlinky.uws.anon.Target
import typingsSlinky.uws.anon.Type
import typingsSlinky.uws.anon.`0`
import typingsSlinky.uws.uwsStrings.close
import typingsSlinky.uws.uwsStrings.connection
import typingsSlinky.uws.uwsStrings.error
import typingsSlinky.uws.uwsStrings.headers
import typingsSlinky.uws.uwsStrings.message
import typingsSlinky.uws.uwsStrings.open
import typingsSlinky.uws.uwsStrings.ping
import typingsSlinky.uws.uwsStrings.pong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uws", JSImport.Namespace)
  @js.native
  class ^ protected () extends WebSocket {
    def this(address: String) = this()
    def this(address: String, options: IClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: String, protocols: js.UndefOr[scala.Nothing], options: IClientOptions) = this()
    def this(address: String, protocols: String, options: IClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: IClientOptions) = this()
  }
  @JSImport("uws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("uws", "CLOSED")
  @js.native
  def CLOSED: Double = js.native
  @scala.inline
  def CLOSED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "CLOSING")
  @js.native
  def CLOSING: Double = js.native
  @scala.inline
  def CLOSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "CONNECTING")
  @js.native
  def CONNECTING: Double = js.native
  @scala.inline
  def CONNECTING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("uws", "OPEN")
  @js.native
  def OPEN: Double = js.native
  @scala.inline
  def OPEN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  @JSImport("uws", "Server")
  @js.native
  class Server () extends EventEmitter {
    def this(options: IServerOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], callback: js.Function) = this()
    def this(options: IServerOptions, callback: js.Function) = this()
    
    @JSName("addListener")
    def addListener_connection(event: connection, cb: js.Function1[/* client */ WebSocket, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
    
    var clients: js.Array[WebSocket] = js.native
    
    def close(): Unit = js.native
    def close(cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def handleUpgrade(
      request: IncomingMessage,
      socket: Socket,
      upgradeHead: js.typedarray.ArrayBuffer,
      callback: js.Function1[/* client */ WebSocket, Unit]
    ): Unit = js.native
    
    @JSName("on")
    def on_connection(event: connection, cb: js.ThisFunction1[/* this */ WebSocket, /* client */ WebSocket, Unit]): this.type = js.native
    // Events
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_headers(event: headers, cb: js.Function1[/* headers */ js.Array[String], Unit]): this.type = js.native
    
    var options: IServerOptions = js.native
    
    var path: String = js.native
  }
  
  @JSImport("uws", "connect")
  @js.native
  def connect(address: String): Unit = js.native
  @JSImport("uws", "connect")
  @js.native
  def connect(address: String, openListener: js.Function): Unit = js.native
  
  @JSImport("uws", "createConnection")
  @js.native
  def createConnection(address: String): Unit = js.native
  @JSImport("uws", "createConnection")
  @js.native
  def createConnection(address: String, openListener: js.Function): Unit = js.native
  
  @JSImport("uws", "createServer")
  @js.native
  def createServer(): Server = js.native
  @JSImport("uws", "createServer")
  @js.native
  def createServer(options: js.UndefOr[scala.Nothing], connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = js.native
  @JSImport("uws", "createServer")
  @js.native
  def createServer(options: IServerOptions): Server = js.native
  @JSImport("uws", "createServer")
  @js.native
  def createServer(options: IServerOptions, connectionListener: js.Function1[/* client */ WebSocket, Unit]): Server = js.native
  
  @JSImport("uws", "http")
  @js.native
  val http: UwsHttp = js.native
  
  @js.native
  trait IClientOptions extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var ca: js.UndefOr[js.Array[_]] = js.native
    
    var cert: js.UndefOr[js.Any] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[js.Any] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[js.Any] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var protocolVersion: js.UndefOr[js.Any] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object IClientOptions {
    
    @scala.inline
    def apply(): IClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClientOptions]
    }
    
    @scala.inline
    implicit class IClientOptionsMutableBuilder[Self <: IClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setCa(value: js.Array[_]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: js.Any*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: js.Any): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: js.Any): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProtocolVersion(value: js.Any): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  @js.native
  trait IPerMessageDeflateOptions extends StObject {
    
    var clientMaxWindowBits: js.UndefOr[Double] = js.native
    
    var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
    
    var memLevel: js.UndefOr[Double] = js.native
    
    var serverMaxWindowBits: js.UndefOr[Double] = js.native
    
    var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
  }
  object IPerMessageDeflateOptions {
    
    @scala.inline
    def apply(): IPerMessageDeflateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPerMessageDeflateOptions]
    }
    
    @scala.inline
    implicit class IPerMessageDeflateOptionsMutableBuilder[Self <: IPerMessageDeflateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientMaxWindowBits(value: Double): Self = StObject.set(x, "clientMaxWindowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientMaxWindowBitsUndefined: Self = StObject.set(x, "clientMaxWindowBits", js.undefined)
      
      @scala.inline
      def setClientNoContextTakeover(value: Boolean): Self = StObject.set(x, "clientNoContextTakeover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientNoContextTakeoverUndefined: Self = StObject.set(x, "clientNoContextTakeover", js.undefined)
      
      @scala.inline
      def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      @scala.inline
      def setServerMaxWindowBits(value: Double): Self = StObject.set(x, "serverMaxWindowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerMaxWindowBitsUndefined: Self = StObject.set(x, "serverMaxWindowBits", js.undefined)
      
      @scala.inline
      def setServerNoContextTakeover(value: Boolean): Self = StObject.set(x, "serverNoContextTakeover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerNoContextTakeoverUndefined: Self = StObject.set(x, "serverNoContextTakeover", js.undefined)
    }
  }
  
  @js.native
  trait IServerOptions extends StObject {
    
    var clientTracking: js.UndefOr[Boolean] = js.native
    
    var disableHixie: js.UndefOr[Boolean] = js.native
    
    var handleProtocols: js.UndefOr[js.Any] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var noServer: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var perMessageDeflate: js.UndefOr[Boolean | IPerMessageDeflateOptions] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var server: js.UndefOr[typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server] = js.native
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.native
  }
  object IServerOptions {
    
    @scala.inline
    def apply(): IServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IServerOptions]
    }
    
    @scala.inline
    implicit class IServerOptionsMutableBuilder[Self <: IServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientTracking(value: Boolean): Self = StObject.set(x, "clientTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientTrackingUndefined: Self = StObject.set(x, "clientTracking", js.undefined)
      
      @scala.inline
      def setDisableHixie(value: Boolean): Self = StObject.set(x, "disableHixie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHixieUndefined: Self = StObject.set(x, "disableHixie", js.undefined)
      
      @scala.inline
      def setHandleProtocols(value: js.Any): Self = StObject.set(x, "handleProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleProtocolsUndefined: Self = StObject.set(x, "handleProtocols", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setNoServer(value: Boolean): Self = StObject.set(x, "noServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoServerUndefined: Self = StObject.set(x, "noServer", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPerMessageDeflate(value: Boolean | IPerMessageDeflateOptions): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
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
      def setVerifyClientFunction2(value: (/* info */ Origin, /* callback */ js.Function1[/* res */ Boolean, Unit]) => Unit): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    }
  }
  
  @js.native
  trait UwsHttp extends StObject {
    
    def createServer(): typingsSlinky.node.httpMod.Server = js.native
    def createServer(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): typingsSlinky.node.httpMod.Server = js.native
    
    // any to avoid express definitions
    def getExpressApp(express: js.Any): js.Any = js.native
    
    def getRequestPrototype(): IncomingMessage = js.native
    
    def getResponsePrototype(): ServerResponse = js.native
  }
  
  type VerifyClientCallbackAsync = js.Function2[/* info */ Origin, /* callback */ js.Function1[/* res */ Boolean, Unit], Unit]
  
  type VerifyClientCallbackSync = js.Function1[/* info */ Origin, Boolean]
  
  @js.native
  trait WebSocket extends EventEmitter {
    
    var CLOSED: Double = js.native
    
    var CLOSING: Double = js.native
    
    var CONNECTING: Double = js.native
    
    var OPEN: Double = js.native
    
    def addEventListener(method: String): Unit = js.native
    def addEventListener(method: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_close(method: close, cb: js.Function1[/* event */ Reason, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(method: error, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    // HTML5 WebSocket events
    @JSName("addEventListener")
    def addEventListener_message(method: message): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(method: message, cb: js.Function1[/* event */ Type, Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(method: open, cb: js.Function1[/* event */ `0`, Unit]): Unit = js.native
    
    @JSName("addListener")
    def addListener_close(event: close, cb: js.Function2[/* code */ Double, /* message */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, cb: js.Function2[/* data */ js.Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_open(event: open, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_ping(event: ping, cb: js.Function2[/* data */ js.Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pong(event: pong, cb: js.Function2[/* data */ js.Any, /* flags */ BinaryBoolean, Unit]): this.type = js.native
    
    var bytesReceived: Double = js.native
    
    def close(): Unit = js.native
    def close(code: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, data: js.Any): Unit = js.native
    
    def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(
      event: close,
      cb: js.ThisFunction2[/* this */ this.type, /* code */ Double, /* message */ String, Unit]
    ): this.type = js.native
    // Events
    @JSName("on")
    def on_error(event: error, cb: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_open(event: open, cb: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_ping(
      event: ping,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_pong(
      event: pong,
      cb: js.ThisFunction2[/* this */ this.type, /* data */ js.Any, /* flags */ BinaryBoolean, Unit]
    ): this.type = js.native
    
    def onclose(event: Code): Unit = js.native
    
    def onerror(err: js.Error): Unit = js.native
    
    def onmessage(event: Data): Unit = js.native
    
    def onopen(event: Target): Unit = js.native
    
    def pause(): Unit = js.native
    
    def ping(): Unit = js.native
    def ping(data: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dontFail: Boolean): Unit = js.native
    def ping(data: js.UndefOr[scala.Nothing], options: Binary): Unit = js.native
    def ping(data: js.UndefOr[scala.Nothing], options: Binary, dontFail: Boolean): Unit = js.native
    def ping(data: js.Any): Unit = js.native
    def ping(data: js.Any, options: js.UndefOr[scala.Nothing], dontFail: Boolean): Unit = js.native
    def ping(data: js.Any, options: Binary): Unit = js.native
    def ping(data: js.Any, options: Binary, dontFail: Boolean): Unit = js.native
    
    def pong(): Unit = js.native
    def pong(data: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dontFail: Boolean): Unit = js.native
    def pong(data: js.UndefOr[scala.Nothing], options: Binary): Unit = js.native
    def pong(data: js.UndefOr[scala.Nothing], options: Binary, dontFail: Boolean): Unit = js.native
    def pong(data: js.Any): Unit = js.native
    def pong(data: js.Any, options: js.UndefOr[scala.Nothing], dontFail: Boolean): Unit = js.native
    def pong(data: js.Any, options: Binary): Unit = js.native
    def pong(data: js.Any, options: Binary, dontFail: Boolean): Unit = js.native
    
    var protocol: String = js.native
    
    var protocolVersion: String = js.native
    
    var readyState: Double = js.native
    
    def resume(): Unit = js.native
    
    def send(data: js.Any): Unit = js.native
    def send(data: js.Any, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    def send(data: js.Any, options: Binary): Unit = js.native
    def send(data: js.Any, options: Binary, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def stream(): Unit = js.native
    def stream(cb: js.Function2[/* err */ js.Error, /* final */ Boolean, Unit]): Unit = js.native
    def stream(options: Binary): Unit = js.native
    def stream(options: Binary, cb: js.Function2[/* err */ js.Error, /* final */ Boolean, Unit]): Unit = js.native
    
    var supports: js.Any = js.native
    
    def terminate(): Unit = js.native
    
    var upgradeReq: IncomingMessage = js.native
    
    var url: String = js.native
  }
}
