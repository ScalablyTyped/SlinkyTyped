package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debitnegativebalances extends js.Object {
  /**
    * A Boolean indicating if Stripe should try to reclaim negative balances from
    * an attached bank account. See our Understanding Connect Account Balances
    * documentation for details. Default value is true for Express accounts and
    * false for Custom accounts.
    */
  var debit_negative_balances: js.UndefOr[Boolean] = js.native
  /**
    * Details on when funds from charges are available, and when they are paid out
    * to an external account. See our Setting Bank and Debit Card Payouts
    * documentation for details.
    */
  var schedule: js.UndefOr[Delaydays] = js.native
  /**
    * The text that appears on the bank account statement for payouts. If not set,
    * this defaults to the platform’s bank descriptor as set in the Dashboard.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
}

object Debitnegativebalances {
  @scala.inline
  def apply(): Debitnegativebalances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debitnegativebalances]
  }
  @scala.inline
  implicit class DebitnegativebalancesOps[Self <: Debitnegativebalances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebit_negative_balances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debit_negative_balances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebit_negative_balances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debit_negative_balances")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Delaydays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
        ret
    }
  }
  
}

