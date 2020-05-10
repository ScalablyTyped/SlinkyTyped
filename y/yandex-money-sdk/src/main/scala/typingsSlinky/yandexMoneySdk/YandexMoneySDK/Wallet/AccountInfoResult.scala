package typingsSlinky.yandexMoneySdk.YandexMoneySDK.Wallet

import typingsSlinky.yandexMoneySdk.AnonAvailable
import typingsSlinky.yandexMoneySdk.AnonPanfragment
import typingsSlinky.yandexMoneySdk.AnonTs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfoResult extends js.Object {
  var account: String = js.native
  var account_status: String = js.native
  var account_type: String = js.native
  var avatar: js.UndefOr[AnonTs] = js.native
  var balance: Double = js.native
  var balance_details: js.UndefOr[AnonAvailable] = js.native
  var cards_linked: js.UndefOr[js.Array[AnonPanfragment]] = js.native
  var currency: String = js.native
}

object AccountInfoResult {
  @scala.inline
  def apply(account: String, account_status: String, account_type: String, balance: Double, currency: String): AccountInfoResult = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], account_status = account_status.asInstanceOf[js.Any], account_type = account_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoResult]
  }
  @scala.inline
  implicit class AccountInfoResultOps[Self <: AccountInfoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccount_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatar(value: AnonTs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withBalance_details(value: AnonAvailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalance_details: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_details")(js.undefined)
        ret
    }
    @scala.inline
    def withCards_linked(value: js.Array[AnonPanfragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards_linked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCards_linked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards_linked")(js.undefined)
        ret
    }
  }
  
}

