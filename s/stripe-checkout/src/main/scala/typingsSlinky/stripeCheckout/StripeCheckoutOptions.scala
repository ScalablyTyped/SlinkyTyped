package typingsSlinky.stripeCheckout

import typingsSlinky.stripeCheckout.stripeCheckoutStrings.auto
import typingsSlinky.stripeV3.stripe.Source
import typingsSlinky.stripeV3.stripe.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeCheckoutOptions extends js.Object {
  var alipay: js.UndefOr[Boolean | auto] = js.native
  var alipayReusable: js.UndefOr[Boolean] = js.native
  var allowRememberMe: js.UndefOr[Boolean] = js.native
  var amount: js.UndefOr[Double] = js.native
  var billingAddress: js.UndefOr[Boolean] = js.native
  var bitcoin: js.UndefOr[Boolean] = js.native
  var closed: js.UndefOr[js.Function0[Unit]] = js.native
  var currency: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var opened: js.UndefOr[js.Function0[Unit]] = js.native
  var panelLabel: js.UndefOr[String] = js.native
  var shippingAddress: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.native
  var token: js.UndefOr[js.Function1[/* token */ Token, Unit]] = js.native
  var zipCode: js.UndefOr[Boolean] = js.native
}

object StripeCheckoutOptions {
  @scala.inline
  def apply(): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
  @scala.inline
  implicit class StripeCheckoutOptionsOps[Self <: StripeCheckoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlipay(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlipay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay")(js.undefined)
        ret
    }
    @scala.inline
    def withAlipayReusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipayReusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlipayReusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipayReusable")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRememberMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRememberMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRememberMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRememberMe")(js.undefined)
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withBitcoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitcoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: /* source */ Source => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: /* token */ Token => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withZipCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipCode")(js.undefined)
        ret
    }
  }
  
}

