package typingsSlinky.stripe.mod.subscriptions

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionUpdateItem extends js.Object {
  /**
    * Delete all usage for a given subscription item. Only allowed when deleted is set to true and the current plan’s
    * usage_type is metered.
    */
  var clear_usage: js.UndefOr[Boolean] = js.native
  /**
    * Delete the specified item if set to true.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * SubscriptionItem to update.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Plan ID for this item.
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ISubscriptionUpdateItem {
  @scala.inline
  def apply(): ISubscriptionUpdateItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionUpdateItem]
  }
  @scala.inline
  implicit class ISubscriptionUpdateItemOps[Self <: ISubscriptionUpdateItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear_usage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear_usage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear_usage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
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

