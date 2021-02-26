package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.anon.Metadata
import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.Stripe
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.applicationFees.IApplicationFeeRefund
import typingsSlinky.stripe.mod.applicationFees.IApplicationFeeRefundCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.ApplicationFeeRefunds")
@js.native
class ApplicationFeeRefunds protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def create(): js.Promise[IApplicationFeeRefund] = js.native
  def create(data: IApplicationFeeRefundCreationOptions): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * Refunds an application fee that has previously been collected but not yet refunded. Funds will be refunded to the Stripe account that
    * the fee was originally collected from.
    *
    * You can optionally refund only part of an application fee. You can do so as many times as you wish until the entire fee has been refunded.
    *
    * Once entirely refunded, an application fee can't be refunded again. This method will throw an error when called on an already-refunded
    * application fee, or when trying to refund more money than is left on an application fee.
    */
  def create(data: IApplicationFeeRefundCreationOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def create(
    data: IApplicationFeeRefundCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def create(data: IApplicationFeeRefundCreationOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def create(options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def create(options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def create(response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  
  def list(): IListPromise[IApplicationFeeRefund] = js.native
  def list(data: IListOptions): IListPromise[IApplicationFeeRefund] = js.native
  /**
    * You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds are always available
    * by default on the application fee object. If you need more than those 10, you can use this API method and the limit and starting_after
    * parameters to page through additional refunds.
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  def list(options: HeaderOptions): IListPromise[IApplicationFeeRefund] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  def list(response: IResponseFn[IList[IApplicationFeeRefund]]): IListPromise[IApplicationFeeRefund] = js.native
  
  def retrieve(refundId: String): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can also retrieve details
    * about a specific refund stored on the application fee.
    */
  def retrieve(refundId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(
    refundId: String,
    data: IDataOptions,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(refundId: String, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(refundId: String, options: HeaderOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(refundId: String, options: IDataOptions): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(refundId: String, options: IDataOptions, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  def retrieve(refundId: String, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
  
  def update(refundId: String, data: Metadata): js.Promise[IApplicationFeeRefund] = js.native
  /**
    * Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not provided will be left
    * unchanged.
    *
    * This request only accepts metadata as an argument.
    */
  def update(refundId: String, data: Metadata, options: HeaderOptions): js.Promise[IApplicationFeeRefund] = js.native
  def update(
    refundId: String,
    data: Metadata,
    options: HeaderOptions,
    response: IResponseFn[IApplicationFeeRefund]
  ): js.Promise[IApplicationFeeRefund] = js.native
  def update(refundId: String, data: Metadata, response: IResponseFn[IApplicationFeeRefund]): js.Promise[IApplicationFeeRefund] = js.native
}
