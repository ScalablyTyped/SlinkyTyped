package typingsSlinky.shopifyPrime.fulfillmentMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.lineItemMod.LineItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fulfillment extends ShopifyObject {
  /**
    * The date and time when the fulfillment was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * A historical record of each item in the fulfillment.
    */
  var line_items: js.UndefOr[js.Array[LineItem]] = js.native
  /**
    * The unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * A textfield with information about the receipt.
    */
  var receipt: js.UndefOr[js.Any] = js.native
  /**
    * The status of the fulfillment. Known values are 'pending', 'open', 'success', 'cancelled',
    * 'error' and 'failure'.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The name of the shipping company.
    */
  var tracking_company: js.UndefOr[String] = js.native
  /**
    * The shipping number, provided by the shipping company. If multiple tracking numbers
    * exist, returns the first number.
    */
  var tracking_number: js.UndefOr[String] = js.native
  /**
    * A list of shipping numbers, provided by the shipping company. May be null.
    */
  var tracking_numbers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The tracking url, provided by the shipping company. May be null. If multiple tracking URLs
    * exist, returns the first URL.
    */
  var tracking_url: js.UndefOr[String] = js.native
  /**
    * An array of one or more tracking urls, provided by the shipping company. May be null.
    */
  var tracking_urls: js.UndefOr[js.Array[String]] = js.native
  /**
    * The date and time when the fulfillment was last modified.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Fulfillment {
  @scala.inline
  def apply(): Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fulfillment]
  }
  @scala.inline
  implicit class FulfillmentOps[Self <: Fulfillment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withLine_items(value: js.Array[LineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine_items: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line_items")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_id")(js.undefined)
        ret
    }
    @scala.inline
    def withReceipt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receipt")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
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
    @scala.inline
    def withTracking_company(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_company: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_company")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_number")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking_numbers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_numbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_numbers")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_url")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking_urls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

