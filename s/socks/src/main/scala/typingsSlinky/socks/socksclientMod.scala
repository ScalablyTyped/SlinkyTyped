package typingsSlinky.socks

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.socks.constantsMod.SocksClientBoundEvent
import typingsSlinky.socks.constantsMod.SocksClientChainOptions
import typingsSlinky.socks.constantsMod.SocksClientEstablishedEvent
import typingsSlinky.socks.constantsMod.SocksClientOptions
import typingsSlinky.socks.constantsMod.SocksUDPFrameDetails
import typingsSlinky.socks.socksStrings.bound
import typingsSlinky.socks.socksStrings.error
import typingsSlinky.socks.socksStrings.established
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socksclientMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocksClient * / any */ @JSImport("socks/typings/client/socksclient", "SocksClient")
  @js.native
  class SocksClient protected () extends EventEmitter {
    def this(options: SocksClientOptions) = this()
    
    /**
      * Closes and destroys the underlying Socket. Emits an error event.
      * @param err { String } An error string to include in error event.
      */
    var closeSocket: js.Any = js.native
    
    /**
      * Starts the connection establishment to the proxy and destination.
      * @param existingSocket Connected socket to use instead of creating a new one (internal use).
      */
    def connect(): Unit = js.native
    def connect(existingSocket: Duplex): Unit = js.native
    
    @JSName("emit")
    def emit_bound(event: bound, info: SocksClientBoundEvent): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: typingsSlinky.socks.utilMod.SocksClientError): Boolean = js.native
    @JSName("emit")
    def emit_established(event: established, info: SocksClientEstablishedEvent): Boolean = js.native
    
    var getSocketOptions: js.Any = js.native
    
    /**
      * Handles Socks v5 auth handshake response.
      * @param data
      */
    var handleInitialSocks5AuthenticationHandshakeResponse: js.Any = js.native
    
    /**
      * Handles initial Socks v5 handshake response.
      * @param data
      */
    var handleInitialSocks5HandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v4 handshake response.
      * @param data
      */
    var handleSocks4FinalHandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v4 incoming connection request (BIND)
      * @param data
      */
    var handleSocks4IncomingConnectionResponse: js.Any = js.native
    
    /**
      * Handles Socks v5 final handshake response.
      * @param data
      */
    var handleSocks5FinalHandshakeResponse: js.Any = js.native
    
    /**
      * Handles Socks v5 incoming connection request (BIND).
      */
    var handleSocks5IncomingConnectionResponse: js.Any = js.native
    
    var nextRequiredPacketBufferSize: js.Any = js.native
    
    var onClose: js.Any = js.native
    
    /**
      * Handles Socket close event.
      * @param had_error
      */
    var onCloseHandler: js.Any = js.native
    
    var onConnect: js.Any = js.native
    
    /**
      * Handles Socket connect event.
      */
    var onConnectHandler: js.Any = js.native
    
    var onDataReceived: js.Any = js.native
    
    /**
      * Handles Socket data event.
      * @param data
      */
    var onDataReceivedHandler: js.Any = js.native
    
    var onError: js.Any = js.native
    
    /**
      * Handles Socket error event.
      * @param err
      */
    var onErrorHandler: js.Any = js.native
    
    /**
      * Handles internal Socks timeout callback.
      * Note: If the Socks client is not BoundWaitingForConnection or Established, the connection will be closed.
      */
    var onEstablishedTimeout: js.Any = js.native
    
    @JSName("on")
    def on_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ typingsSlinky.socks.utilMod.SocksClientError, Unit]): this.type = js.native
    @JSName("on")
    def on_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    @JSName("once")
    def once_bound(event: bound, listener: js.Function1[/* info */ SocksClientBoundEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ typingsSlinky.socks.utilMod.SocksClientError, Unit]): this.type = js.native
    @JSName("once")
    def once_established(event: established, listener: js.Function1[/* info */ SocksClientEstablishedEvent, Unit]): this.type = js.native
    
    var options: js.Any = js.native
    
    /**
      * Handles processing of the data we have received.
      */
    var processData: js.Any = js.native
    
    var receiveBuffer: js.Any = js.native
    
    /**
      * Removes internal event listeners on the underlying Socket.
      */
    var removeInternalSocketHandlers: js.Any = js.native
    
    /**
      * Sends initial Socks v4 handshake request.
      */
    var sendSocks4InitialHandshake: js.Any = js.native
    
    /**
      * Sends Socks v5 final handshake request.
      */
    var sendSocks5CommandRequest: js.Any = js.native
    
    /**
      * Sends initial Socks v5 handshake request.
      */
    var sendSocks5InitialHandshake: js.Any = js.native
    
    /**
      * Sends Socks v5 user & password auth handshake.
      *
      * Note: No auth and user/pass are currently supported.
      */
    var sendSocks5UserPassAuthentication: js.Any = js.native
    
    /**
      * Internal state setter. If the SocksClient is in an error state, it cannot be changed to a non error state.
      */
    var setState: js.Any = js.native
    
    var socket: js.Any = js.native
    
    def socksClientOptions: SocksClientOptions = js.native
    
    var state: js.Any = js.native
  }
  object SocksClient {
    
    /**
      * Creates a new SOCKS connection.
      *
      * Note: Supports callbacks and promises. Only supports the connect command.
      * @param options { SocksClientOptions } Options.
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    @JSImport("socks/typings/client/socksclient", "SocksClient.createConnection")
    @js.native
    def createConnection(options: SocksClientOptions): js.Promise[SocksClientEstablishedEvent] = js.native
    @JSImport("socks/typings/client/socksclient", "SocksClient.createConnection")
    @js.native
    def createConnection(options: SocksClientOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
    
    /**
      * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
      *
      * Note: Supports callbacks and promises. Only supports the connect method.
      * Note: Implemented via createConnection() factory function.
      * @param options { SocksClientChainOptions } Options
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    @JSImport("socks/typings/client/socksclient", "SocksClient.createConnectionChain")
    @js.native
    def createConnectionChain(options: SocksClientChainOptions): js.Promise[SocksClientEstablishedEvent] = js.native
    @JSImport("socks/typings/client/socksclient", "SocksClient.createConnectionChain")
    @js.native
    def createConnectionChain(options: SocksClientChainOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
    
    /**
      * Creates a SOCKS UDP Frame.
      * @param options
      */
    /* static member */
    @JSImport("socks/typings/client/socksclient", "SocksClient.createUDPFrame")
    @js.native
    def createUDPFrame(options: SocksUDPFrameDetails): Buffer = js.native
    
    /**
      * Parses a SOCKS UDP frame.
      * @param data
      */
    /* static member */
    @JSImport("socks/typings/client/socksclient", "SocksClient.parseUDPFrame")
    @js.native
    def parseUDPFrame(data: Buffer): SocksUDPFrameDetails = js.native
  }
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks/typings/client/socksclient", "SocksClientError")
  @js.native
  class SocksClientError protected ()
    extends typingsSlinky.socks.utilMod.SocksClientError {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
  }
}
