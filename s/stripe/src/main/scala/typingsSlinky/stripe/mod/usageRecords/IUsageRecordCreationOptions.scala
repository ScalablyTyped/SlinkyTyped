package typingsSlinky.stripe.mod.usageRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUsageRecordCreationOptions extends js.Object {
  /**
    * Valid values are increment (default) or set. When using increment the specified quantity will be added to the usage at the specified
    * timestamp. The set action will overwrite the usage quantity at that timestamp.
    */
  var action: js.UndefOr[IUsageRecordAction] = js.native
  /**
    * The usage quantity for the specified timestamp
    */
  var quantity: Double = js.native
  /**
    * The timestamp for the usage event. This timestamp must be within the current billing period of the subscription of the provided subscription_item
    */
  var timestamp: Double = js.native
}

object IUsageRecordCreationOptions {
  @scala.inline
  def apply(quantity: Double, timestamp: Double): IUsageRecordCreationOptions = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUsageRecordCreationOptions]
  }
  @scala.inline
  implicit class IUsageRecordCreationOptionsOps[Self <: IUsageRecordCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: IUsageRecordAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
  }
  
}

