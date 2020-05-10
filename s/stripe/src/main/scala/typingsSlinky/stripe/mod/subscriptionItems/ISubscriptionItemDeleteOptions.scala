package typingsSlinky.stripe.mod.subscriptionItems

import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.stripeStrings.always_invoice
import typingsSlinky.stripe.stripeStrings.create_prorations
import typingsSlinky.stripe.stripeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemDeleteOptions extends IDataOptions {
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to handle prorations when the billing cycle changes or if an item’s quantity changes.
    * Prorations can be disabled by passing none.
    */
  var proration_behavior: js.UndefOr[create_prorations | always_invoice | none] = js.native
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.native
}

object ISubscriptionItemDeleteOptions {
  @scala.inline
  def apply(): ISubscriptionItemDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionItemDeleteOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemDeleteOptionsOps[Self <: ISubscriptionItemDeleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProration_behavior(value: create_prorations | always_invoice | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proration_behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProration_behavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proration_behavior")(js.undefined)
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
  }
  
}

