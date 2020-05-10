package typingsSlinky.stripeV3.stripe.paymentIntents

import typingsSlinky.stripeV3.AnonUrl
import typingsSlinky.stripeV3.stripeV3Strings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by
    * redirecting your customer to another page or application.
    */
  var redirect_to_url: AnonUrl = js.native
  /**
    * Type of the next action to perform
    */
  var `type`: redirect_to_url = js.native
}

object PaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(redirect_to_url: AnonUrl, `type`: redirect_to_url): PaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
  }
  @scala.inline
  implicit class PaymentIntentNextActionRedirectToUrlOps[Self <: PaymentIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirect_to_url(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_to_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: redirect_to_url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

