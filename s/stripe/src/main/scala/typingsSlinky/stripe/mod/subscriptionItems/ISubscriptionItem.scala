package typingsSlinky.stripe.mod.subscriptionItems

import typingsSlinky.stripe.anon.Usagegte
import typingsSlinky.stripe.mod.IMetadata
import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.plans.IPlan
import typingsSlinky.stripe.stripeStrings.subscription_item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subscription items allow you to create customer subscriptions with more than one plan, making it easy to represent
  * complex billing relationships.
  */
@js.native
trait ISubscriptionItem extends IResourceObject {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: Null | Usagegte = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information
    * about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * Value is "subscription_item"
    */
  @JSName("object")
  var object_ISubscriptionItem: subscription_item = js.native
  /**
    * Hash describing the plan the customer is subscribed to
    */
  var plan: IPlan = js.native
  /**
    * The quantity of the plan to which the customer should be subscribed.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The subscription this subscription_item belongs to.
    */
  var subscription: String = js.native
}

object ISubscriptionItem {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    metadata: IMetadata,
    `object`: subscription_item,
    plan: IPlan,
    subscription: String
  ): ISubscriptionItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItem]
  }
  @scala.inline
  implicit class ISubscriptionItemOps[Self <: ISubscriptionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: subscription_item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: IPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_thresholds(value: Usagegte): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_thresholdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_thresholds")(null)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

