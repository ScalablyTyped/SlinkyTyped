package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlipayaccount extends js.Object {
  var alipay_account: js.UndefOr[Double] = js.native
  var bitcoin_receiver: js.UndefOr[Double] = js.native
  var card: Double = js.native
  var customer_bank_account: js.UndefOr[Double] = js.native
}

object AnonAlipayaccount {
  @scala.inline
  def apply(card: Double): AnonAlipayaccount = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlipayaccount]
  }
  @scala.inline
  implicit class AnonAlipayaccountOps[Self <: AnonAlipayaccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlipay_account(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlipay_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alipay_account")(js.undefined)
        ret
    }
    @scala.inline
    def withBitcoin_receiver(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitcoin_receiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitcoin_receiver")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer_bank_account(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_bank_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer_bank_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_bank_account")(js.undefined)
        ret
    }
  }
  
}

