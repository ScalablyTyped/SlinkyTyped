package typingsSlinky.stripeV2.stripe

import typingsSlinky.stripeV2.stripeV2Strings.`final`
import typingsSlinky.stripeV2.stripeV2Strings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/reference/applepayjs/1916082-applepay_js_data_types
@js.native
trait StripeApplePayLineItem extends js.Object {
  var amount: Double = js.native
  var label: String = js.native
  var `type`: pending | `final` = js.native
}

object StripeApplePayLineItem {
  @scala.inline
  def apply(amount: Double, label: String, `type`: pending | `final`): StripeApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayLineItem]
  }
  @scala.inline
  implicit class StripeApplePayLineItemOps[Self <: StripeApplePayLineItem] (val x: Self) extends AnyVal {
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: pending | `final`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

