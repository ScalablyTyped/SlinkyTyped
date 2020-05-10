package typingsSlinky.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardholderAuthorizationControls extends js.Object {
  /**
    * Array of strings containing categories of authorizations permitted on this card.
    */
  var allowed_categories: js.Array[String] = js.native
  /**
    * Array of strings containing categories of authorizations to always decline on this card.
    */
  var blocked_categories: js.Array[String] = js.native
  /**
    * Limit the spending with rules based on time intervals and categories.
    */
  var spending_limits: js.Array[ISpendingLimit] = js.native
  /**
    * Currency for the amounts within spending_limits. Locked to the currency of the card.
    */
  var spending_limits_currency: String = js.native
}

object ICardholderAuthorizationControls {
  @scala.inline
  def apply(
    allowed_categories: js.Array[String],
    blocked_categories: js.Array[String],
    spending_limits: js.Array[ISpendingLimit],
    spending_limits_currency: String
  ): ICardholderAuthorizationControls = {
    val __obj = js.Dynamic.literal(allowed_categories = allowed_categories.asInstanceOf[js.Any], blocked_categories = blocked_categories.asInstanceOf[js.Any], spending_limits = spending_limits.asInstanceOf[js.Any], spending_limits_currency = spending_limits_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholderAuthorizationControls]
  }
  @scala.inline
  implicit class ICardholderAuthorizationControlsOps[Self <: ICardholderAuthorizationControls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_categories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked_categories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked_categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpending_limits(value: js.Array[ISpendingLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spending_limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpending_limits_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spending_limits_currency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

