package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import typingsSlinky.stripe.mod.subscriptions.ISubscriptionCustCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.CustomerSubscriptions")
@js.native
class CustomerSubscriptions () extends SubscriptionsBase {
  def create(data: ISubscriptionCustCreationOptions): js.Promise[ISubscription] = js.native
  /**
    * Creates a new subscription on an existing customer.
    *
    * @returns The newly created subscription object if the call succeeded. If the customer has no card or the
    * attempted charge fails, this call throws an error (unless the specified plan is free or has a trial
    * period).
    *
    * @param options The options for the new subscription
    */
  def create(data: ISubscriptionCustCreationOptions, options: HeaderOptions): js.Promise[ISubscription] = js.native
  def create(
    data: ISubscriptionCustCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[ISubscription]
  ): js.Promise[ISubscription] = js.native
  def create(data: ISubscriptionCustCreationOptions, response: IResponseFn[ISubscription]): js.Promise[ISubscription] = js.native
}

