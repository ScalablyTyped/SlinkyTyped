package typingsSlinky.stripe.mod.paymentIntents

import typingsSlinky.stripe.anon.Returnurl
import typingsSlinky.stripe.stripeStrings.redirect_to_url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentNextActionRedirectToUrl extends js.Object {
  
  /**
    * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
    */
  var redirect_to_url: Returnurl = js.native
  
  var `type`: redirect_to_url = js.native
}
object IPaymentIntentNextActionRedirectToUrl {
  
  @scala.inline
  def apply(redirect_to_url: Returnurl, `type`: redirect_to_url): IPaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentNextActionRedirectToUrl]
  }
  
  @scala.inline
  implicit class IPaymentIntentNextActionRedirectToUrlOps[Self <: IPaymentIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRedirect_to_url(value: Returnurl): Self = this.set("redirect_to_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: redirect_to_url): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
