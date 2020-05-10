package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.stripeStrings.card_present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardPresentPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: card_present = js.native
}

object ICardPresentPaymentMethodDetails {
  @scala.inline
  def apply(`type`: card_present): ICardPresentPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethodDetails]
  }
  @scala.inline
  implicit class ICardPresentPaymentMethodDetailsOps[Self <: ICardPresentPaymentMethodDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: card_present): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

