package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListOptionsCreated
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.Stripe
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.disputes.IDispute
import typingsSlinky.stripe.mod.disputes.IDisputeUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Disputes")
@js.native
class Disputes protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  def close(disputeId: String): js.Promise[IDispute] = js.native
  /**
    * Closing the dispute for a charge indicates that you do not have any evidence to submit and are
    * essentially ‘dismissing’ the dispute, acknowledging it as lost
    *
    * The status of the dispute will change from needs_response to lost.
    *
    * *Closing a dispute is irreversible!*
    */
  def close(disputeId: String, options: HeaderOptions): js.Promise[IDispute] = js.native
  def close(disputeId: String, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  def close(disputeId: String, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  
  // TODO: Implement placeholder method
  def getMetadata(): Unit = js.native
  
  def list(): IListPromise[IDispute] = js.native
  def list(data: IListOptionsCreated): IListPromise[IDispute] = js.native
  /**
    * Returns a list of your disputes.
    */
  def list(data: IListOptionsCreated, options: HeaderOptions): IListPromise[IDispute] = js.native
  def list(data: IListOptionsCreated, options: HeaderOptions, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
  def list(data: IListOptionsCreated, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
  def list(options: HeaderOptions): IListPromise[IDispute] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
  def list(response: IResponseFn[IList[IDispute]]): IListPromise[IDispute] = js.native
  
  def retrieve(disputeId: String): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, data: IDataOptions): js.Promise[IDispute] = js.native
  /**
    * Retrieves the dispute with the given ID.
    */
  def retrieve(disputeId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, data: IDataOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, options: HeaderOptions): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, options: HeaderOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  def retrieve(disputeId: String, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
  
  def setMetadata(): Unit = js.native
  
  def update(disputeId: String, data: IDisputeUpdateOptions): js.Promise[IDispute] = js.native
  /**
    * When you get a dispute, contacting your customer is always the best first step. If that doesn't work, you can submit evidence in
    * order to help us resolve the dispute in your favor. You can do this in your dashboard, but if you prefer, you can use the API to
    * submit evidence programmatically. Depending on your dispute type, different evidence fields will give you a better chance of winning
    * your dispute. You may want to consult our guide to dispute types to help you figure out which evidence fields to provide:
    * https://stripe.com/help/dispute-types
    *
    * @param data The fields to update
    */
  def update(disputeId: String, data: IDisputeUpdateOptions, options: HeaderOptions): js.Promise[IDispute] = js.native
  def update(
    disputeId: String,
    data: IDisputeUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IDispute]
  ): js.Promise[IDispute] = js.native
  def update(disputeId: String, data: IDisputeUpdateOptions, response: IResponseFn[IDispute]): js.Promise[IDispute] = js.native
}
