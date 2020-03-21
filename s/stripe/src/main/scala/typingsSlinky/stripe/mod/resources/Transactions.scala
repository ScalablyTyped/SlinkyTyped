package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.issuing.transactions.ITransaction
import typingsSlinky.stripe.mod.issuing.transactions.ITransactionListOptions
import typingsSlinky.stripe.mod.issuing.transactions.ITransactionUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Transactions")
@js.native
class Transactions () extends StripeResource {
  def list(): js.Promise[IList[ITransaction]] = js.native
  def list(data: ITransactionListOptions): js.Promise[IList[ITransaction]] = js.native
  /**
    * Returns a list of Issuing Transaction objects. The objects are sorted in descending order by creation date, with the most recently created object appearing first.
    */
  def list(data: ITransactionListOptions, options: HeaderOptions): js.Promise[IList[ITransaction]] = js.native
  def list(data: ITransactionListOptions, options: HeaderOptions, response: IResponseFn[IList[ITransaction]]): js.Promise[IList[ITransaction]] = js.native
  def list(data: ITransactionListOptions, response: IResponseFn[IList[ITransaction]]): js.Promise[IList[ITransaction]] = js.native
  def list(options: HeaderOptions): js.Promise[IList[ITransaction]] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ITransaction]]): js.Promise[IList[ITransaction]] = js.native
  def list(response: IResponseFn[IList[ITransaction]]): js.Promise[IList[ITransaction]] = js.native
  def retrieve(id: String): js.Promise[ITransaction] = js.native
  /**
    * Retrieves an Issuing Transaction object.
    */
  def retrieve(id: String, options: HeaderOptions): js.Promise[ITransaction] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[ITransaction]): js.Promise[ITransaction] = js.native
  def retrieve(id: String, response: IResponseFn[ITransaction]): js.Promise[ITransaction] = js.native
  def update(id: String, data: ITransactionUpdateOptions): js.Promise[ITransaction] = js.native
  /**
    * Updates the specified Issuing Transaction object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  def update(id: String, data: ITransactionUpdateOptions, options: HeaderOptions): js.Promise[ITransaction] = js.native
  def update(
    id: String,
    data: ITransactionUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[ITransaction]
  ): js.Promise[ITransaction] = js.native
  def update(id: String, data: ITransactionUpdateOptions, response: IResponseFn[ITransaction]): js.Promise[ITransaction] = js.native
}

