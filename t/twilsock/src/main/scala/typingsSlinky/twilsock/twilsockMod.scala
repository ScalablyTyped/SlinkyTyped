package typingsSlinky.twilsock

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.twilsock.configurationMod.Configuration
import typingsSlinky.twilsock.packetinterfaceMod.PacketInterface
import typingsSlinky.twilsock.twilsockMod.TwilsockChannel.State
import typingsSlinky.twilsock.websocketchannelMod.WebSocketChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockMod {
  
  @JSImport("twilsock/lib/twilsock", "Response")
  @js.native
  class Response () extends StObject
  
  /**
    * Twilsock channel level protocol implementation
    */
  @JSImport("twilsock/lib/twilsock", "TwilsockChannel")
  @js.native
  class TwilsockChannel protected () extends EventEmitter {
    def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
    
    var cancelDisconnectTimer: js.Any = js.native
    
    var cancelInit: js.Any = js.native
    
    var cancelUpdate: js.Any = js.native
    
    var changeState: js.Any = js.native
    
    /**
      * Shutdown connection
      */
    var closeSocket: js.Any = js.native
    
    val config: js.Any = js.native
    
    /**
      * Should be called for each message to confirm it received
      */
    var confirmReceiving: js.Any = js.native
    
    /**
      * Initiate the twilsock connection
      * If already connected, it does nothing
      */
    def connect(): Unit = js.native
    
    /**
      * Close twilsock connection
      * If already disconnected, it does nothing
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    var disconnectedPromiseResolve: js.Any = js.native
    
    var disconnectingTimer: js.Any = js.native
    
    var emitReplyConnectionError: js.Any = js.native
    
    var finalizeSocket: js.Any = js.native
    
    val fsm: js.Any = js.native
    
    def getTerminationReason: String = js.native
    
    var initRetry: js.Any = js.native
    
    def isConnected: Boolean = js.native
    
    def isTerminalState: Boolean = js.native
    
    var lastEmittedState: js.Any = js.native
    
    var modifyBackoff: js.Any = js.native
    
    var onCloseReceived: js.Any = js.native
    
    var onConnected: js.Any = js.native
    
    var onIncomingMessage: js.Any = js.native
    
    var resetBackoff: js.Any = js.native
    
    var retrier: js.Any = js.native
    
    var retry: js.Any = js.native
    
    var sendInit: js.Any = js.native
    
    var sendUpdate: js.Any = js.native
    
    var setupSocket: js.Any = js.native
    
    var startDisconnectTimer: js.Any = js.native
    
    def state: State = js.native
    
    val terminalStates: js.Any = js.native
    
    var terminationReason: js.Any = js.native
    
    val tokenExpiredSasCode: js.Any = js.native
    
    var transport: js.Any = js.native
    
    var transportReady: js.Any = js.native
    
    /**
      * Update fpa token for twilsock connection
      */
    def updateToken(token: String): js.Promise[Unit] = js.native
    
    var websocket: js.Any = js.native
  }
  /**
    * Enum for connection state values.
    * @readonly
    * @enum {number}
    */
  object TwilsockChannel {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.twilsock.twilsockStrings.unknown
      - typingsSlinky.twilsock.twilsockStrings.disconnecting
      - typingsSlinky.twilsock.twilsockStrings.disconnected
      - typingsSlinky.twilsock.twilsockStrings.connecting
      - typingsSlinky.twilsock.twilsockStrings.connected
      - typingsSlinky.twilsock.twilsockStrings.error
      - typingsSlinky.twilsock.twilsockStrings.rejected
    */
    trait State extends StObject
    object State {
      
      @scala.inline
      def connected: typingsSlinky.twilsock.twilsockStrings.connected = "connected".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.connected]
      
      @scala.inline
      def connecting: typingsSlinky.twilsock.twilsockStrings.connecting = "connecting".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.connecting]
      
      @scala.inline
      def disconnected: typingsSlinky.twilsock.twilsockStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.disconnected]
      
      @scala.inline
      def disconnecting: typingsSlinky.twilsock.twilsockStrings.disconnecting = "disconnecting".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.disconnecting]
      
      @scala.inline
      def error: typingsSlinky.twilsock.twilsockStrings.error = "error".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.error]
      
      @scala.inline
      def rejected: typingsSlinky.twilsock.twilsockStrings.rejected = "rejected".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.rejected]
      
      @scala.inline
      def unknown: typingsSlinky.twilsock.twilsockStrings.unknown = "unknown".asInstanceOf[typingsSlinky.twilsock.twilsockStrings.unknown]
    }
  }
  
  /**
    * Twilsock channel level protocol implementation
    */
  @JSImport("twilsock/lib/twilsock", "TwilsockImpl")
  @js.native
  class TwilsockImpl protected () extends TwilsockChannel {
    def this(websocket: WebSocketChannel, transport: PacketInterface, config: Configuration) = this()
  }
  /**
    * Enum for connection state values.
    * @readonly
    * @enum {number}
    */
  object TwilsockImpl
}
