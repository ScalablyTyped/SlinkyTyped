package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentOptions extends js.Object {
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.native
  var requestPayerName: js.UndefOr[scala.Boolean] = js.native
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.native
  var requestShipping: js.UndefOr[scala.Boolean] = js.native
  var shippingType: js.UndefOr[java.lang.String] = js.native
}

object PaymentOptions {
  @scala.inline
  def apply(): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOptions]
  }
  @scala.inline
  implicit class PaymentOptionsOps[Self <: PaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestPayerEmail(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayerName(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayerPhone(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayerPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayerPhone")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestShipping(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestShipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestShipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestShipping")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingType")(js.undefined)
        ret
    }
  }
  
}

