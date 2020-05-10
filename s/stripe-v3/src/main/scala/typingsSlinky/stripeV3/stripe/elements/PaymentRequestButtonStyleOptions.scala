package typingsSlinky.stripeV3.stripe.elements

import typingsSlinky.stripeV3.stripeV3Strings.`light-outline`
import typingsSlinky.stripeV3.stripeV3Strings.buy
import typingsSlinky.stripeV3.stripeV3Strings.dark
import typingsSlinky.stripeV3.stripeV3Strings.default
import typingsSlinky.stripeV3.stripeV3Strings.donate
import typingsSlinky.stripeV3.stripeV3Strings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestButtonStyleOptions extends js.Object {
  var height: String = js.native
  var theme: dark | light | `light-outline` = js.native
  var `type`: js.UndefOr[default | donate | buy] = js.native
}

object PaymentRequestButtonStyleOptions {
  @scala.inline
  def apply(height: String, theme: dark | light | `light-outline`): PaymentRequestButtonStyleOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
  }
  @scala.inline
  implicit class PaymentRequestButtonStyleOptionsOps[Self <: PaymentRequestButtonStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: dark | light | `light-outline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: default | donate | buy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

