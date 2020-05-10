package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.mod.bankAccounts.IBankAccountHash
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBankAccountToken extends ITokenBase {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[IBankAccountHash] = js.native
}

object IBankAccountToken {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean
  ): IBankAccountToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBankAccountToken]
  }
  @scala.inline
  implicit class IBankAccountTokenOps[Self <: IBankAccountToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBank_account(value: IBankAccountHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBank_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_account")(js.undefined)
        ret
    }
  }
  
}

