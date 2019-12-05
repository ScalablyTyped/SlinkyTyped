package typingsSlinky.stompit.libChannelMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.stompit.libClientMod.Ack
import typingsSlinky.stompit.libClientMod.Message
import typingsSlinky.stompit.libClientMod.MessageCallback
import typingsSlinky.stompit.libClientMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends EventEmitter {
  def ack(message: Message): Unit = js.native
  def ack(message: Message, headers: js.Any): Unit = js.native
  def ack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def ack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def begin(): typingsSlinky.stompit.libClientTransactionMod.^ = js.native
  def begin(headers: js.Any): typingsSlinky.stompit.libClientTransactionMod.^ = js.native
  def close(error: js.Error): Unit = js.native
  def isEmpty(): Boolean = js.native
  def lock(): Unit = js.native
  def nack(message: Message): Unit = js.native
  def nack(message: Message, headers: js.Any): Unit = js.native
  def nack(message: Message, headers: js.Any, sendOptions: SendOptions): Unit = js.native
  def nack(
    message: Message,
    headers: js.Any,
    sendOptions: SendOptions,
    callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  ): Unit = js.native
  def send(headers: js.Any, body: Body): this.type = js.native
  def send(headers: js.Any, body: Body, callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
  def setImplicitSubscription(id: Double): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: Ack): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: Ack, msgListener: MessageCallback): ChannelSubscription = js.native
  def subscribe(
    headers: js.Any,
    onMessageCallback: js.Function3[
      /* err */ js.Error | Null, 
      /* message */ Message, 
      /* channelSubscription */ ChannelSubscription, 
      Unit
    ]
  ): ChannelSubscription = js.native
  def unlock(): Unit = js.native
}

