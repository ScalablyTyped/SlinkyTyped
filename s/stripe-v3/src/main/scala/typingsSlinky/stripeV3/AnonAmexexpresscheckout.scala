package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripeV3Strings.amex_express_checkout
import typingsSlinky.stripeV3.stripeV3Strings.apple_pay
import typingsSlinky.stripeV3.stripeV3Strings.google_pay
import typingsSlinky.stripeV3.stripeV3Strings.masterpass
import typingsSlinky.stripeV3.stripeV3Strings.samsung_pay
import typingsSlinky.stripeV3.stripeV3Strings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmexexpresscheckout extends js.Object {
  var amex_express_checkout: js.UndefOr[js.Any] = js.native
  var apple_pay: js.UndefOr[js.Any] = js.native
  var dynamic_last4: js.UndefOr[js.Any] = js.native
  var google_pay: js.UndefOr[js.Any] = js.native
  var masterpass: js.UndefOr[js.Any] = js.native
  var samsung_pay: js.UndefOr[js.Any] = js.native
  var `type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout = js.native
  var visa_checkout: js.UndefOr[js.Any] = js.native
}

object AnonAmexexpresscheckout {
  @scala.inline
  def apply(`type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): AnonAmexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmexexpresscheckout]
  }
  @scala.inline
  implicit class AnonAmexexpresscheckoutOps[Self <: AnonAmexexpresscheckout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmex_express_checkout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amex_express_checkout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmex_express_checkout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amex_express_checkout")(js.undefined)
        ret
    }
    @scala.inline
    def withApple_pay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple_pay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApple_pay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apple_pay")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamic_last4(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic_last4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamic_last4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic_last4")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogle_pay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_pay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogle_pay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_pay")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterpass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterpass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterpass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterpass")(js.undefined)
        ret
    }
    @scala.inline
    def withSamsung_pay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samsung_pay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamsung_pay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samsung_pay")(js.undefined)
        ret
    }
    @scala.inline
    def withVisa_checkout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visa_checkout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisa_checkout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visa_checkout")(js.undefined)
        ret
    }
  }
  
}

