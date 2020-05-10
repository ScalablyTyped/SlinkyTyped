package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.samsung_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamsungPayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: samsung_pay = js.native
}

object SamsungPayWallet {
  @scala.inline
  def apply(`type`: samsung_pay): SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamsungPayWallet]
  }
  @scala.inline
  implicit class SamsungPayWalletOps[Self <: SamsungPayWallet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: samsung_pay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

