package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.email
import typingsSlinky.stripe.stripeStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefundattributesmethod extends js.Object {
  var refund_attributes_method: js.UndefOr[email | manual] = js.native
}

object AnonRefundattributesmethod {
  @scala.inline
  def apply(): AnonRefundattributesmethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRefundattributesmethod]
  }
  @scala.inline
  implicit class AnonRefundattributesmethodOps[Self <: AnonRefundattributesmethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefund_attributes_method(value: email | manual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_attributes_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefund_attributes_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refund_attributes_method")(js.undefined)
        ret
    }
  }
  
}

