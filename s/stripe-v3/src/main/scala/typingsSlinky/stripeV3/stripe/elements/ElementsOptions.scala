package typingsSlinky.stripeV3.stripe.elements

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripeV3.AnonBase
import typingsSlinky.stripeV3.AnonComplete
import typingsSlinky.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsSlinky.stripeV3.stripeV3Strings.default
import typingsSlinky.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementsOptions extends js.Object {
  var classes: js.UndefOr[AnonBase] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hideIcon: js.UndefOr[Boolean] = js.native
  var hidePostalCode: js.UndefOr[Boolean] = js.native
  var iconStyle: js.UndefOr[solid | default] = js.native
  var paymentRequest: js.UndefOr[StripePaymentRequest] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderCountry: js.UndefOr[String] = js.native
  var style: js.UndefOr[AnonComplete] = js.native
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
  var value: js.UndefOr[String | StringDictionary[String]] = js.native
}

object ElementsOptions {
  @scala.inline
  def apply(): ElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementsOptions]
  }
  @scala.inline
  implicit class ElementsOptionsOps[Self <: ElementsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: AnonBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePostalCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: solid | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentRequest(value: StripePaymentRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: AnonComplete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String | StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

