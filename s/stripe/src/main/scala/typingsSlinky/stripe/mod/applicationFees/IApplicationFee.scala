package typingsSlinky.stripe.mod.applicationFees

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.mod.accounts.IAccount
import typingsSlinky.stripe.mod.applications.IApplication
import typingsSlinky.stripe.mod.balance.IBalanceTransaction
import typingsSlinky.stripe.mod.charges.ICharge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationFee extends IResourceObject {
  /**
    * ID of the Stripe account this fee was taken from. [Expandable]
    */
  var account: String | IAccount = js.native
  /**
    * Amount earned, in cents/pence.
    */
  var amount: Double = js.native
  /**
    * Positive integer or zero
    */
  var amount_refunded: Double = js.native
  /**
    * ID of the Connect Application that earned the fee. [Expandable]
    */
  var application: String | IApplication = js.native
  /**
    * Balance transaction that describes the impact of this collected application
    * fee on your account balance (not including refunds). [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * ID of the charge that the application fee was taken from. [Expandable]
    */
  var charge: String | ICharge = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO code representing the currency of the charge.
    */
  var currency: String = js.native
  var livemode: Boolean = js.native
  /**
    * ID of the corresponding charge on the platform account, if this fee was the
    * result of a charge using the destination parameter. [Expandable]
    */
  var originating_transaction: String = js.native
  /**
    * Whether or not the fee has been fully refunded. If the fee is only partially
    * refunded, this attribute will still be false.
    */
  var refunded: Boolean = js.native
  /**
    * A list of refunds that have been applied to the fee.
    */
  var refunds: IApplicationFeeRefunds = js.native
}

object IApplicationFee {
  @scala.inline
  def apply(
    account: String | IAccount,
    amount: Double,
    amount_refunded: Double,
    application: String | IApplication,
    balance_transaction: String | IBalanceTransaction,
    charge: String | ICharge,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    `object`: String,
    originating_transaction: String,
    refunded: Boolean,
    refunds: IApplicationFeeRefunds
  ): IApplicationFee = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], originating_transaction = originating_transaction.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFee]
  }
  @scala.inline
  implicit class IApplicationFeeOps[Self <: IApplicationFee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String | IAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmount_refunded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount_refunded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: String | IApplication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance_transaction(value: String | IBalanceTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharge(value: String | ICharge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginating_transaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originating_transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefunded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefunds(value: IApplicationFeeRefunds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

