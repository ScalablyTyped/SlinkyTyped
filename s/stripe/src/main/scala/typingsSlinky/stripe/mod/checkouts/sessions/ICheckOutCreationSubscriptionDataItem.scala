package typingsSlinky.stripe.mod.checkouts.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckOutCreationSubscriptionDataItem extends js.Object {
  /**
    * Plan ID for this item.
    */
  var plan: String = js.native
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ICheckOutCreationSubscriptionDataItem {
  @scala.inline
  def apply(plan: String): ICheckOutCreationSubscriptionDataItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionDataItem]
  }
  @scala.inline
  implicit class ICheckOutCreationSubscriptionDataItemOps[Self <: ICheckOutCreationSubscriptionDataItem] (val x: Self) extends AnyVal {
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

