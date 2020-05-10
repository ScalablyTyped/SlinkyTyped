package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.stripeStrings.any
import typingsSlinky.stripe.stripeStrings.automatic
import typingsSlinky.stripe.stripeStrings.challenge_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaymentMethodCardOptions extends js.Object {
  /**
    * We strongly recommend that you rely on our SCA Engine to automatically prompt your customers for authentication based on risk level and other requirements. However, if you wish to request 3D Secure based on
    * logic from your own fraud engine, provide this option. Permitted values include: automatic, any, or challenge_only. If not provided, defaults to automatic.
    */
  var request_three_d_secure: js.UndefOr[automatic | challenge_only | any] = js.native
}

object IPaymentMethodCardOptions {
  @scala.inline
  def apply(): IPaymentMethodCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentMethodCardOptions]
  }
  @scala.inline
  implicit class IPaymentMethodCardOptionsOps[Self <: IPaymentMethodCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest_three_d_secure(value: automatic | challenge_only | any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_three_d_secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_three_d_secure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_three_d_secure")(js.undefined)
        ret
    }
  }
  
}

