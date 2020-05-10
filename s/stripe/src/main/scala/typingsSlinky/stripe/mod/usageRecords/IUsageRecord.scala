package typingsSlinky.stripe.mod.usageRecords

import typingsSlinky.stripe.mod.IObject
import typingsSlinky.stripe.stripeStrings.usage_record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUsageRecord extends IObject {
  var id: String = js.native
  var livemode: Boolean = js.native
  @JSName("object")
  var object_IUsageRecord: usage_record = js.native
  var quantity: Double = js.native
  var subscription_item: String = js.native
  var timestamp: Double = js.native
}

object IUsageRecord {
  @scala.inline
  def apply(
    id: String,
    livemode: Boolean,
    `object`: usage_record,
    quantity: Double,
    subscription_item: String,
    timestamp: Double
  ): IUsageRecord = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], subscription_item = subscription_item.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecord]
  }
  @scala.inline
  implicit class IUsageRecordOps[Self <: IUsageRecord] (val x: Self) extends AnyVal {
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
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: usage_record): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

