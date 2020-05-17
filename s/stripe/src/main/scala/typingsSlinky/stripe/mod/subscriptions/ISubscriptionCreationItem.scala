package typingsSlinky.stripe.mod.subscriptions

import typingsSlinky.stripe.anon.Usagegte
import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionCreationItem extends js.Object {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: js.UndefOr[Usagegte] = js.native
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Plan ID for this item.
    */
  var plan: String = js.native
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ISubscriptionCreationItem {
  @scala.inline
  def apply(plan: String): ISubscriptionCreationItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationItem]
  }
  @scala.inline
  implicit class ISubscriptionCreationItemOps[Self <: ISubscriptionCreationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_thresholds(value: Usagegte): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_thresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_thresholds")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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

