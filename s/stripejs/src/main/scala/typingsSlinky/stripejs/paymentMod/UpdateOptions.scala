package typingsSlinky.stripejs.paymentMod

import typingsSlinky.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOptions extends js.Object {
  /**
    * The currency in which the customer should be charged
    * @example 'usd'
    */
  var currency: String = js.native
  /**
    * An array of payment item objects
    * NOTE: The sum of the line item amounts does not need to add up to the total amount above
    * @see total
    *
    * @default []
    */
  var displayItems: js.UndefOr[js.Array[PaymentItem]] = js.native
  /**
    * An array of possible shipping options
    * NOTE: This first one in the array will be listed as the default option
    *
    * @default []
    */
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.native
  /**
    * The total amount the customer has to pay
    * NOTE: This object is shown to the customer in the browser‘s payment UI
    */
  var total: PaymentItem = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(currency: String, total: PaymentItem): UpdateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: PaymentItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayItems(value: js.Array[PaymentItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOptions(value: js.Array[ShippingOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOptions")(js.undefined)
        ret
    }
  }
  
}

