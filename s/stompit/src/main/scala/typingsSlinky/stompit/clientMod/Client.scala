package typingsSlinky.stompit.clientMod

import typingsSlinky.node.streamMod.Writable
import typingsSlinky.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

