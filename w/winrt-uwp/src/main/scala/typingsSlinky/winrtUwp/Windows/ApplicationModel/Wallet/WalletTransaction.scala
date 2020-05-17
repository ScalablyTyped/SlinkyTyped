package typingsSlinky.winrtUwp.Windows.ApplicationModel.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single wallet transaction in the transaction history. */
@js.native
trait WalletTransaction extends js.Object {
  /** Gets or sets the summary description (suitable for user UI) of the transaction. */
  var description: String = js.native
  /** Gets or sets the transaction amount. */
  var displayAmount: String = js.native
  /** Gets or sets a description (suitable for user UI) of the transaction location. */
  var displayLocation: String = js.native
  /** Gets or sets whether to display the time of the transaction. */
  var ignoreTimeOfDay: Boolean = js.native
  /** Gets or sets whether to launch your app when the user taps "see more transaction history". */
  var isLaunchable: Boolean = js.native
  /** Gets or sets the date and time of the transaction. */
  var transactionDate: js.Date = js.native
}

object WalletTransaction {
  @scala.inline
  def apply(
    description: String,
    displayAmount: String,
    displayLocation: String,
    ignoreTimeOfDay: Boolean,
    isLaunchable: Boolean,
    transactionDate: js.Date
  ): WalletTransaction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayAmount = displayAmount.asInstanceOf[js.Any], displayLocation = displayLocation.asInstanceOf[js.Any], ignoreTimeOfDay = ignoreTimeOfDay.asInstanceOf[js.Any], isLaunchable = isLaunchable.asInstanceOf[js.Any], transactionDate = transactionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletTransaction]
  }
  @scala.inline
  implicit class WalletTransactionOps[Self <: WalletTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreTimeOfDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTimeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLaunchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLaunchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

