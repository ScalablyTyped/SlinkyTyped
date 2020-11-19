package typingsSlinky.stompit.channelMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.stompit.clientMod.Ack
import typingsSlinky.stompit.clientMod.Message
import typingsSlinky.stompit.clientMod.MessageCallback
import typingsSlinky.stompit.clientMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends EventEmitter {
  
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
  
  def close(error: js.Error): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  def lock(): Unit = js.native
  
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
  
  def send(headers: js.Any, body: Body): this.type = js.native
  def send(headers: js.Any, body: Body, callback: js.Function1[/* err */ js.Error | Null, Unit]): this.type = js.native
  
  def setImplicitSubscription(id: Double): ChannelSubscription = js.native
  def setImplicitSubscription(id: Double, ack: js.UndefOr[scala.Nothing], msgListener: MessageCallback): ChannelSubscription = js.native
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
