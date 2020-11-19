package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IDeleteConfirmation
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.skus.ISku
import typingsSlinky.stripe.mod.skus.ISkuCreationOptions
import typingsSlinky.stripe.mod.skus.ISkuListOptions
import typingsSlinky.stripe.mod.skus.ISkuUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.SKUs")
@js.native
class SKUs () extends js.Object {
  
  def create(data: ISkuCreationOptions): js.Promise[ISku] = js.native
  /**
    * Creates a new SKU associated with a product.
    */
  def create(data: ISkuCreationOptions, options: HeaderOptions): js.Promise[ISku] = js.native
  def create(data: ISkuCreationOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  def create(data: ISkuCreationOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  
  def del(skuId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Delete a SKU. Deleting a SKU is only possible until it has been used in an order.
    */
  def del(skuId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(skuId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(skuId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def list(): IListPromise[ISku] = js.native
  def list(data: ISkuListOptions): IListPromise[ISku] = js.native
  /**
    * Returns a list of your SKUs. The SKUs are returned sorted by creation date, with the most recently created SKUs appearing first.
    */
  def list(data: ISkuListOptions, options: HeaderOptions): IListPromise[ISku] = js.native
  def list(data: ISkuListOptions, options: HeaderOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
  def list(data: ISkuListOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
  def list(options: HeaderOptions): IListPromise[ISku] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
  def list(response: IResponseFn[IList[ISku]]): IListPromise[ISku] = js.native
  
  def retrieve(skuId: String): js.Promise[ISku] = js.native
  def retrieve(skuId: String, data: IDataOptions): js.Promise[ISku] = js.native
  /**
    * Retrieves the details of an existing SKU. Supply the unique SKU identifier from either a SKU creation request or from the
    * product, and Stripe will return the corresponding SKU information.
    */
  def retrieve(skuId: String, data: IDataOptions, options: HeaderOptions): js.Promise[ISku] = js.native
  def retrieve(skuId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  def retrieve(skuId: String, data: IDataOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  def retrieve(skuId: String, options: HeaderOptions): js.Promise[ISku] = js.native
  def retrieve(skuId: String, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  def retrieve(skuId: String, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  
  def update(skuId: String, data: ISkuUpdateOptions): js.Promise[ISku] = js.native
  /**
    * Updates the specific SKU by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * Note that a SKU's attributes are not editable. Instead, you would need to deactivate the existing SKU and create a new one with
    * the new attribute values.
    */
  def update(skuId: String, data: ISkuUpdateOptions, options: HeaderOptions): js.Promise[ISku] = js.native
  def update(skuId: String, data: ISkuUpdateOptions, options: HeaderOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
  def update(skuId: String, data: ISkuUpdateOptions, response: IResponseFn[ISku]): js.Promise[ISku] = js.native
}
