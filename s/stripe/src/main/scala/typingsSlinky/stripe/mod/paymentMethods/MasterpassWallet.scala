package typingsSlinky.stripe.mod.paymentMethods

import typingsSlinky.stripe.stripeStrings.masterpass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasterpassWallet extends CardWallet {
  var masterpass: WalletData = js.native
  var `type`: masterpass = js.native
}

object MasterpassWallet {
  @scala.inline
  def apply(masterpass: WalletData, `type`: masterpass): MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterpassWallet]
  }
  @scala.inline
  implicit class MasterpassWalletOps[Self <: MasterpassWallet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterpass(value: WalletData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterpass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: masterpass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

