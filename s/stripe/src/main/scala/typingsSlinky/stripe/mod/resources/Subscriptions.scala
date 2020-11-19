package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Subscriptions")
@js.native
class Subscriptions () extends SubscriptionsBase {
  
  def create(data: ISubscriptionCreationOptions): js.Promise[ISubscription] = js.native
  /**
    * Creates a new subscription on an existing customer.
    *
    * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
    * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
    * period).
    *
    * @param options The options for the new subscription
    */
  def create(data: ISubscriptionCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def create(data: ISubscriptionCreationOptions, options: HeaderOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
  def create(data: ISubscriptionCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
}
