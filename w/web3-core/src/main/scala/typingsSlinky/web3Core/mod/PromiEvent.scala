package typingsSlinky.web3Core.mod

import typingsSlinky.std.Promise
import typingsSlinky.web3Core.web3CoreStrings.confirmation
import typingsSlinky.web3Core.web3CoreStrings.error
import typingsSlinky.web3Core.web3CoreStrings.receipt
import typingsSlinky.web3Core.web3CoreStrings.transactionHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiEvent[T] extends Promise[T] {
  @JSName("on")
  def on_confirmation(
    `type`: confirmation,
    handler: js.Function1[/* error */ js.Error | TransactionReceipt | String, Unit]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_confirmation(
    `type`: confirmation,
    handler: js.Function2[/* confNumber */ Double, /* receipt */ TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_error(`type`: error, handler: js.Function1[(/* error */ js.Error) | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("on")
  def on_receipt(
    `type`: receipt,
    handler: js.Function1[js.Error | String | (/* receipt */ TransactionReceipt), Unit]
  ): PromiEvent[T] = js.native
  @JSName("on")
  def on_transactionHash(
    `type`: transactionHash,
    handler: js.Function1[js.Error | (/* receipt */ String) | TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(
    `type`: confirmation,
    handler: js.Function1[/* error */ js.Error | TransactionReceipt | String, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_confirmation(
    `type`: confirmation,
    handler: js.Function2[/* confNumber */ Double, /* receipt */ TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_error(`type`: error, handler: js.Function1[(/* error */ js.Error) | String | TransactionReceipt, Unit]): PromiEvent[T] = js.native
  @JSName("once")
  def once_receipt(
    `type`: receipt,
    handler: js.Function1[js.Error | String | (/* receipt */ TransactionReceipt), Unit]
  ): PromiEvent[T] = js.native
  @JSName("once")
  def once_transactionHash(
    `type`: transactionHash,
    handler: js.Function1[js.Error | (/* receipt */ String) | TransactionReceipt, Unit]
  ): PromiEvent[T] = js.native
}

