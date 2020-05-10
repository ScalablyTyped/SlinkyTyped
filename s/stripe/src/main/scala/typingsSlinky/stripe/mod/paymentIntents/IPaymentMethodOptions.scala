package typingsSlinky.stripe.mod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentMethodOptions extends js.Object {
  /**
    * Configuration for any card payments attempted on this PaymentIntent.
    */
  var card: js.UndefOr[IPaymentMethodCardOptions] = js.native
}

object IPaymentMethodOptions {
  @scala.inline
  def apply(): IPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodOptions]
  }
  @scala.inline
  implicit class IPaymentMethodOptionsOps[Self <: IPaymentMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: IPaymentMethodCardOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
  }
  
}

