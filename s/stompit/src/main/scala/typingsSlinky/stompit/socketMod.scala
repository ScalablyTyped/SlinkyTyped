package typingsSlinky.stompit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketMod {
  
  @JSImport("stompit/lib/Socket", JSImport.Namespace)
  @js.native
  class ^ protected () extends Socket {
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  type CommandHandlers = StringDictionary[js.Function2[/* frame */ Writable, /* callback */ commandHandler, Unit]]
  
  type Heartbeat = js.Array[Double]
  
  @js.native
  trait Socket extends EventEmitter {
    
    def createApplicationError(): SocketError = js.native
    def createApplicationError(message: String): SocketError = js.native
    def createApplicationError(message: js.Error): SocketError = js.native
    
    def createProtocolError(): SocketError = js.native
    def createProtocolError(message: String): SocketError = js.native
    def createProtocolError(message: js.Error): SocketError = js.native
    
    def createTransportError(): SocketError = js.native
    def createTransportError(message: String): SocketError = js.native
    def createTransportError(message: js.Error): SocketError = js.native
    
    def destroy(exception: js.Error): Unit = js.native
    
    def getHeartbeat(): Heartbeat = js.native
    
    def getTransportSocket(): Duplex = js.native
    
    def hasFinishedOutput(): Boolean = js.native
    
    def sendFrame(command: String): Writable = js.native
    def sendFrame(command: String, headers: js.UndefOr[scala.Nothing], streamOptions: WritableOptions): Writable = js.native
    def sendFrame(command: String, headers: js.Any): Writable = js.native
    def sendFrame(command: String, headers: js.Any, streamOptions: WritableOptions): Writable = js.native
    
    def setCommandHandler(command: String, handler: commandHandler): Unit = js.native
    
    def setCommandHandlers(handlers: CommandHandlers): Unit = js.native
    
    def setHeartbeat(heartbeat: Heartbeat): Unit = js.native
    
    def setUnknownCommandHandler(handler: js.Function0[Unit]): Unit = js.native
    
    def setVersion(version: String): Unit = js.native
  }
  
  @js.native
  trait SocketError extends Error {
    
    def isApplicationError(): Boolean = js.native
    
    def isProtocolError(): Boolean = js.native
    
    def isTransportError(): Boolean = js.native
  }
  object SocketError {
    
    @scala.inline
    def apply(
      isApplicationError: () => Boolean,
      isProtocolError: () => Boolean,
      isTransportError: () => Boolean,
      message: String,
      name: String
    ): SocketError = {
      val __obj = js.Dynamic.literal(isApplicationError = js.Any.fromFunction0(isApplicationError), isProtocolError = js.Any.fromFunction0(isProtocolError), isTransportError = js.Any.fromFunction0(isTransportError), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketError]
    }
    
    @scala.inline
    implicit class SocketErrorMutableBuilder[Self <: SocketError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsApplicationError(value: () => Boolean): Self = StObject.set(x, "isApplicationError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsProtocolError(value: () => Boolean): Self = StObject.set(x, "isProtocolError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTransportError(value: () => Boolean): Self = StObject.set(x, "isTransportError", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    var commandHandlers: js.UndefOr[CommandHandlers] = js.native
    
    var heartbeat: js.UndefOr[Heartbeat] = js.native
    
    var heartbeatDelayMargin: js.UndefOr[Double] = js.native
    
    var heartbeatOutputMargin: js.UndefOr[Double] = js.native
    
    var outgoingFrameStream: js.UndefOr[typingsSlinky.stompit.outgoingFrameStreamMod.^] = js.native
    
    var resetDisconnect: js.UndefOr[Boolean] = js.native
    
    var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandHandlers(value: CommandHandlers): Self = StObject.set(x, "commandHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandHandlersUndefined: Self = StObject.set(x, "commandHandlers", js.undefined)
      
      @scala.inline
      def setHeartbeat(value: Heartbeat): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatDelayMargin(value: Double): Self = StObject.set(x, "heartbeatDelayMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatDelayMarginUndefined: Self = StObject.set(x, "heartbeatDelayMargin", js.undefined)
      
      @scala.inline
      def setHeartbeatOutputMargin(value: Double): Self = StObject.set(x, "heartbeatOutputMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeatOutputMarginUndefined: Self = StObject.set(x, "heartbeatOutputMargin", js.undefined)
      
      @scala.inline
      def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      @scala.inline
      def setHeartbeatVarargs(value: Double*): Self = StObject.set(x, "heartbeat", js.Array(value :_*))
      
      @scala.inline
      def setOutgoingFrameStream(value: typingsSlinky.stompit.outgoingFrameStreamMod.^): Self = StObject.set(x, "outgoingFrameStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoingFrameStreamUndefined: Self = StObject.set(x, "outgoingFrameStream", js.undefined)
      
      @scala.inline
      def setResetDisconnect(value: Boolean): Self = StObject.set(x, "resetDisconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetDisconnectUndefined: Self = StObject.set(x, "resetDisconnect", js.undefined)
      
      @scala.inline
      def setUnknownCommand(value: () => Unit): Self = StObject.set(x, "unknownCommand", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnknownCommandUndefined: Self = StObject.set(x, "unknownCommand", js.undefined)
    }
  }
  
  type commandHandler = js.Function1[/* frame */ Writable, Unit]
}
