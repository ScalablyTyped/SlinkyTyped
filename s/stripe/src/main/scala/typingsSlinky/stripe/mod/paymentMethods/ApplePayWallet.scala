package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.apple_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: apple_pay = js.native
}

object ApplePayWallet {
  @scala.inline
  def apply(`type`: apple_pay): ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayWallet]
  }
  @scala.inline
  implicit class ApplePayWalletOps[Self <: ApplePayWallet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: apple_pay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

