package typingsSlinky.stripe.mod.payouts

import typingsSlinky.stripe.mod.IDateFilter
import typingsSlinky.stripe.mod.IListOptionsCreated
import typingsSlinky.stripe.stripeStrings.canceled
import typingsSlinky.stripe.stripeStrings.failed
import typingsSlinky.stripe.stripeStrings.paid
import typingsSlinky.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayoutListOptions extends IListOptionsCreated {
  var arrival_date: js.UndefOr[String | IDateFilter] = js.native
  var destination: js.UndefOr[String] = js.native
  var status: js.UndefOr[canceled | failed | paid | pending] = js.native
}

object IPayoutListOptions {
  @scala.inline
  def apply(): IPayoutListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPayoutListOptions]
  }
  @scala.inline
  implicit class IPayoutListOptionsOps[Self <: IPayoutListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrival_date(value: String | IDateFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrival_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_date")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: canceled | failed | paid | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

