package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.bitcoinReceivers.IBitcoinReceiver
import typingsSlinky.stripe.mod.bitcoinReceivers.IBitcoinReceiverCreationOptions
import typingsSlinky.stripe.mod.bitcoinReceivers.IBitcoinReceiverListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.BitcoinReceivers")
@js.native
class BitcoinReceivers () extends StripeResource {
  
  def create(data: IBitcoinReceiverCreationOptions): js.Promise[IBitcoinReceiver] = js.native
  /**
    * Creates a Bitcoin receiver object that can be used to accept bitcoin payments from your customer. The receiver exposes a Bitcoin address
    * and is created with a bitcoin to USD exchange rate that is valid for 10 minutes.
    */
  def create(data: IBitcoinReceiverCreationOptions, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
  def create(
    data: IBitcoinReceiverCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IBitcoinReceiver]
  ): js.Promise[IBitcoinReceiver] = js.native
  def create(data: IBitcoinReceiverCreationOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
  
   // TODO: Implement placeholder method
  def getMetadata(): Unit = js.native
  
  def list(data: IBitcoinReceiverListOptions): IListPromise[IBitcoinReceiver] = js.native
  /**
    * Returns a list of your receivers. Receivers are returned sorted by creation date, with the most recently created receivers appearing first.
    */
  def list(data: IBitcoinReceiverListOptions, options: HeaderOptions): IListPromise[IBitcoinReceiver] = js.native
  def list(
    data: IBitcoinReceiverListOptions,
    options: HeaderOptions,
    response: IResponseFn[IList[IBitcoinReceiver]]
  ): IListPromise[IBitcoinReceiver] = js.native
  def list(data: IBitcoinReceiverListOptions, response: IResponseFn[IList[IBitcoinReceiver]]): IListPromise[IBitcoinReceiver] = js.native
  
  def retrieve(id: String): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IBitcoinReceiver] = js.native
  /**
    * Retrieves the Bitcoin receiver with the given ID.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
  def retrieve(id: String, response: IResponseFn[IBitcoinReceiver]): js.Promise[IBitcoinReceiver] = js.native
  
  // update(id: string): void; // This does seem to be a method in the library (https://github.com/stripe/stripe-node/blob/master/lib/resources/BitcoinReceivers.js#L12), but isn't in the API documentation.
  def setMetadata(): Unit = js.native
}
