package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.balance.IBalanceListOptions
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
