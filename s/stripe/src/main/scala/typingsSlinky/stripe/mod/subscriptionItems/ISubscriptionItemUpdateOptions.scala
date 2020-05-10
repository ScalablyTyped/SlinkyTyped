package typingsSlinky.stripe.mod.subscriptionItems

import typingsSlinky.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The identifier of the new plan for this subscription item.
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.native
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.native
  /**
    * The quantity you’d like to apply to the subscription item you’re creating.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ISubscriptionItemUpdateOptions {
  @scala.inline
  def apply(): ISubscriptionItemUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionItemUpdateOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemUpdateOptionsOps[Self <: ISubscriptionItemUpdateOptions] (val x: Self) extends AnyVal {
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
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withProrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prorate")(js.undefined)
        ret
    }
    @scala.inline
    def withProration_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proration_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProration_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proration_date")(js.undefined)
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

