package typingsSlinky.stripe.mod.usageRecordSummaries

import typingsSlinky.stripe.mod.invoices.IPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUsageRecordSummariesItem extends js.Object {
  var id: String = js.native
  var invoice: String = js.native
  var livemode: Boolean = js.native
  var `object`: String = js.native
  var period: IPeriod = js.native
  var subscription_item: String = js.native
  var total_usage: Double = js.native
}

object IUsageRecordSummariesItem {
  @scala.inline
  def apply(
    id: String,
    invoice: String,
    livemode: Boolean,
    `object`: String,
    period: IPeriod,
    subscription_item: String,
    total_usage: Double
  ): IUsageRecordSummariesItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], total_usage = total_usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordSummariesItem]
  }
  @scala.inline
  implicit class IUsageRecordSummariesItemOps[Self <: IUsageRecordSummariesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: IPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_usage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

