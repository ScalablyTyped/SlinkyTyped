package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IListPromise
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.StripeResource
import typingsSlinky.stripe.stripeMod.balance.IBalanceListOptions
import typingsSlinky.stripe.stripeMod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.BalanceTransaction")
@js.native
class BalanceTransaction () extends StripeResource {
  def list(): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(data: IBalanceListOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(options: HeaderOptions): IListPromise[IBalanceTransaction] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def list(response: IResponseFn[IBalanceTransaction]): IListPromise[IBalanceTransaction] = js.native
  def retrieve(id: String): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
  def retrieve(id: String, response: IResponseFn[IBalanceTransaction]): js.Promise[IBalanceTransaction] = js.native
}

