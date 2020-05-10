package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.available
import typingsSlinky.stripe.stripeStrings.email
import typingsSlinky.stripe.stripeStrings.manual
import typingsSlinky.stripe.stripeStrings.missing
import typingsSlinky.stripe.stripeStrings.none
import typingsSlinky.stripe.stripeStrings.requested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmountcharged extends js.Object {
  var address: String = js.native
  var amount_charged: Double = js.native
  var amount_received: Double = js.native
  var amount_returned: Double = js.native
  var refund_attributes_method: email | manual | none = js.native
  var refund_attributes_status: missing | requested | available = js.native
}

object AnonAmountcharged {
  @scala.inline
  def apply(
    address: String,
    amount_charged: Double,
    amount_received: Double,
    amount_returned: Double,
    refund_attributes_method: email | manual | none,
    refund_attributes_status: missing | requested | available
  ): AnonAmountcharged = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmountcharged]
  }
  @scala.inline
  implicit class AnonAmountchargedOps[Self <: AnonAmountcharged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_charged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_charged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_returned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_returned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_attributes_method(value: email | manual | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_attributes_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefund_attributes_status(value: missing | requested | available): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_attributes_status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

