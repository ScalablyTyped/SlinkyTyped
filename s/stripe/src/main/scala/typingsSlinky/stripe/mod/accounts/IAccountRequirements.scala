package typingsSlinky.stripe.mod.accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccountRequirements extends js.Object {
  /**
    * The date the fields in currently_due must be collected by to keep payouts enabled for the account.
    * These fields might block payouts sooner if the next threshold is reached before these fields are collected.
    */
  var current_deadline: Double | Null = js.native
  /**
    * The fields that need to be collected to keep the account enabled. If not collected by the current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.UndefOr[js.Array[String]] = js.native
  /**
    * If the account is disabled, this string describes why the account can’t create charges or receive payouts. Can be requirements.past_due, requirements.pending_verification, rejected.fraud, rejected.terms_of_service, rejected.listed, rejected.other, listed, under_review, or other.
    */
  var disabled_reason: js.UndefOr[String | Null] = js.native
  /**
    * The fields that need to be collected assuming all volume thresholds are reached. As they become required, these fields appear in currently_due as well, and the current_deadline is set.
    */
  var eventually_due: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fields that weren’t collected by the current_deadline. These fields need to be collected to re-enable the account.
    */
  var past_due: js.UndefOr[js.Array[String]] = js.native
  /**
    * Fields that may become required depending on the results of verification or review. An empty array unless an asynchronous verification is pending. If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.UndefOr[js.Array[String]] = js.native
}

object IAccountRequirements {
  @scala.inline
  def apply(): IAccountRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccountRequirements]
  }
  @scala.inline
  implicit class IAccountRequirementsOps[Self <: IAccountRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent_deadline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_deadlineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_deadline")(null)
        ret
    }
    @scala.inline
    def withCurrently_due(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currently_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrently_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currently_due")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled_reasonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_reason")(null)
        ret
    }
    @scala.inline
    def withEventually_due(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventually_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventually_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventually_due")(js.undefined)
        ret
    }
    @scala.inline
    def withPast_due(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPast_due: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past_due")(js.undefined)
        ret
    }
    @scala.inline
    def withPending_verification(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending_verification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_verification")(js.undefined)
        ret
    }
  }
  
}

