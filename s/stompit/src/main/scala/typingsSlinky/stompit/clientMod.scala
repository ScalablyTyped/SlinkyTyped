package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import typingsSlinky.stompit.incomingFrameStreamMod.IncomingFrame
import typingsSlinky.stompit.socketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("stompit/lib/Client", JSImport.Namespace)
  @js.native
  class ^ protected () extends Client {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stompit.stompitStrings.auto
    - typingsSlinky.stompit.stompitStrings.client
    - typingsSlinky.stompit.stompitStrings.`client-individual`
  */
  trait Ack extends StObject
  object Ack {
    
    @scala.inline
    def auto: typingsSlinky.stompit.stompitStrings.auto = "auto".asInstanceOf[typingsSlinky.stompit.stompitStrings.auto]
    
    @scala.inline
    def client: typingsSlinky.stompit.stompitStrings.client = "client".asInstanceOf[typingsSlinky.stompit.stompitStrings.client]
    
    @scala.inline
    def `client-individual`: typingsSlinky.stompit.stompitStrings.`client-individual` = "client-individual".asInstanceOf[typingsSlinky.stompit.stompitStrings.`client-individual`]
  }
  
  @js.native
  trait Client
    extends typingsSlinky.stompit.socketMod.^ {
    
    def ack(message: Message): Unit = js.native
    def ack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.Any): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def ack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def begin(): typingsSlinky.stompit.transactionMod.^ = js.native
    def begin(headers: js.Any): typingsSlinky.stompit.transactionMod.^ = js.native
    
    def connect(): Unit = js.native
    def connect(
      headers: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error | Null, /* client */ this.type, Unit]
    ): Unit = js.native
    def connect(headers: js.Any): Unit = js.native
    def connect(headers: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(callback: js.Function2[/* error */ js.Error | Null, /* client */ this.type, Unit]): Unit = js.native
    
    def getOptions(): SocketOptions = js.native
    
    def getSubscription(id: Double): typingsSlinky.stompit.subscriptionMod.^ = js.native
    
    def nack(message: Message): Unit = js.native
    def nack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.UndefOr[scala.Nothing], sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: js.UndefOr[scala.Nothing],
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.Any): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
    def nack(
      message: Message,
      headers: js.Any,
      sendOptions: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def readEmptyBody(frame: typingsSlinky.stompit.incomingFrameStreamMod.^): Unit = js.native
    def readEmptyBody(
      frame: typingsSlinky.stompit.incomingFrameStreamMod.^,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    
    def send(): Writable = js.native
    def send(headers: js.UndefOr[scala.Nothing], options: SendOptions): Writable = js.native
    def send(headers: js.Any): Writable = js.native
    def send(headers: js.Any, options: SendOptions): Writable = js.native
    
    def sendFrame(command: String, headers: js.UndefOr[scala.Nothing], options: SendOptions): Writable = js.native
    def sendFrame(command: String, headers: js.Any, options: SendOptions): Writable = js.native
    
    def sendString(): Unit = js.native
    def sendString(
      headers: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.UndefOr[scala.Nothing], body: js.UndefOr[scala.Nothing], options: SendOptions): Unit = js.native
    def sendString(
      headers: js.UndefOr[scala.Nothing],
      body: js.UndefOr[scala.Nothing],
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.UndefOr[scala.Nothing], body: js.Any): Unit = js.native
    def sendString(
      headers: js.UndefOr[scala.Nothing],
      body: js.Any,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.UndefOr[scala.Nothing], body: js.Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: js.UndefOr[scala.Nothing],
      body: js.Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any, body: js.UndefOr[scala.Nothing], options: SendOptions): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.UndefOr[scala.Nothing],
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any, body: js.Any): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.Any,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    def sendString(headers: js.Any, body: js.Any, options: SendOptions): Unit = js.native
    def sendString(
      headers: js.Any,
      body: js.Any,
      options: SendOptions,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    def setImplicitSubscription(id: Double): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: js.UndefOr[scala.Nothing], messageListener: MessageCallback): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def setImplicitSubscription(id: Double, ack: Ack, messageListener: MessageCallback): typingsSlinky.stompit.subscriptionMod.^ = js.native
    
    def subscribe(): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: js.UndefOr[scala.Nothing], messageListener: MessageCallback): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: js.Any): typingsSlinky.stompit.subscriptionMod.^ = js.native
    def subscribe(headers: js.Any, messageListener: MessageCallback): typingsSlinky.stompit.subscriptionMod.^ = js.native
  }
  
  @js.native
  trait Message extends IncomingFrame {
    
    def ack(): Unit = js.native
    
    def nack(): Unit = js.native
  }
  
  type MessageCallback = js.Function2[/* err */ js.Error | Null, /* message */ Message, Unit]
  
  @js.native
  trait SendOptions extends WritableOptions {
    
    def onError(err: js.Error): Unit = js.native
    
    def onReceipt(): Unit = js.native
  }
  object SendOptions {
    
    @scala.inline
    def apply(onError: js.Error => Unit, onReceipt: () => Unit): SendOptions = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onReceipt = js.Any.fromFunction0(onReceipt))
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit class SendOptionsMutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnError(value: js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReceipt(value: () => Unit): Self = StObject.set(x, "onReceipt", js.Any.fromFunction0(value))
    }
  }
}
