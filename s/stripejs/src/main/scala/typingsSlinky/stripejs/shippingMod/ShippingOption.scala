package typingsSlinky.stripejs.shippingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingOption extends js.Object {
  /**
    * The shipping costs for this option
    * NOTE: If the cost of this shipping option depends on the shipping address the customer enters,
    * listen for the `shippingaddresschange` event.
    */
  var amount: Double = js.native
  /**
    * A longer description of this shipping option.
    */
  var detail: String = js.native
  /**
    * A unique ID you create to keep track of this shipping option.
    * NOTE: You‘ll be told the ID of the selected option on changes and on completion.
    */
  var id: String = js.native
  /**
    * A short “title” for this shipping option.
    */
  var label: String = js.native
}

object ShippingOption {
  @scala.inline
  def apply(amount: Double, detail: String, id: String, label: String): ShippingOption = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShippingOption]
  }
  @scala.inline
  implicit class ShippingOptionOps[Self <: ShippingOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

