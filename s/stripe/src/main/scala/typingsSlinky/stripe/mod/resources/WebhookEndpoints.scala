package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IDeleteConfirmation
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListOptions
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.webhookEndpoints.IWebhookCreateOptions
import typingsSlinky.stripe.mod.webhookEndpoints.IWebhookEndpoint
import typingsSlinky.stripe.mod.webhookEndpoints.IWebhookUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.WebhookEndpoints")
@js.native
class WebhookEndpoints () extends js.Object {
  
  def create(data: IWebhookCreateOptions): js.Promise[IWebhookEndpoint] = js.native
  /**
    * Creates a new Webhook Endpoint
    */
  def create(data: IWebhookCreateOptions, options: HeaderOptions): js.Promise[IWebhookEndpoint] = js.native
  def create(data: IWebhookCreateOptions, options: HeaderOptions, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
  def create(data: IWebhookCreateOptions, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
  
  def del(webhookId: String): js.Promise[IDeleteConfirmation] = js.native
  /**
    * Deletes a webhook endpoint.
    *
    * Webhook endpoints can also be deleted from the Stripe dashboard
    */
  def del(webhookId: String, options: HeaderOptions): js.Promise[IDeleteConfirmation] = js.native
  def del(webhookId: String, options: HeaderOptions, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  def del(webhookId: String, response: IResponseFn[IDeleteConfirmation]): js.Promise[IDeleteConfirmation] = js.native
  
  def list(): IListPromise[IWebhookEndpoint] = js.native
  def list(data: IListOptions): IListPromise[IWebhookEndpoint] = js.native
  /**
    * Returns a list of your webhook endpoints
    */
  def list(data: IListOptions, options: HeaderOptions): IListPromise[IWebhookEndpoint] = js.native
  def list(data: IListOptions, options: HeaderOptions, response: IResponseFn[IList[IWebhookEndpoint]]): IListPromise[IWebhookEndpoint] = js.native
  def list(data: IListOptions, response: IResponseFn[IList[IWebhookEndpoint]]): IListPromise[IWebhookEndpoint] = js.native
  def list(options: HeaderOptions): IListPromise[IWebhookEndpoint] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IWebhookEndpoint]]): IListPromise[IWebhookEndpoint] = js.native
  def list(response: IResponseFn[IList[IWebhookEndpoint]]): IListPromise[IWebhookEndpoint] = js.native
  
  def retrieve(webhookId: String): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(webhookId: String, data: IDataOptions): js.Promise[IWebhookEndpoint] = js.native
  /**
    * Retrieves the details of an existing webhook
    */
  def retrieve(webhookId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(
    webhookId: String,
    data: IDataOptions,
    options: HeaderOptions,
    response: IResponseFn[IWebhookEndpoint]
  ): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(webhookId: String, data: IDataOptions, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(webhookId: String, options: HeaderOptions): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(webhookId: String, options: HeaderOptions, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
  def retrieve(webhookId: String, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
  
  def update(webhookId: String, data: IWebhookUpdateOptions): js.Promise[IWebhookEndpoint] = js.native
  /**
    * Updates the specific webhook endpoint by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    *
    * The parameters that can be edited are the url, the list of enabled_events, and the status of your endpoint
    */
  def update(webhookId: String, data: IWebhookUpdateOptions, options: HeaderOptions): js.Promise[IWebhookEndpoint] = js.native
  def update(
    webhookId: String,
    data: IWebhookUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[IWebhookEndpoint]
  ): js.Promise[IWebhookEndpoint] = js.native
  def update(webhookId: String, data: IWebhookUpdateOptions, response: IResponseFn[IWebhookEndpoint]): js.Promise[IWebhookEndpoint] = js.native
}
