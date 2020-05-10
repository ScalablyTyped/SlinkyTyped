package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabledreason extends js.Object {
  /**
    * A string describing the reason for this account being unable to charge
    * and/or transfer, if that is the case. Possible values are "rejected.fraud",
    * "rejected.terms_of_service", "rejected.listed", "rejected.other",
    * "fields_needed", "listed", or "other".
    */
  var disabled_reason: String = js.native
  /**
    * At what time the fields_needed must be provided. If this date is in
    * the past, the account is already in bad standing, and providing
    * fields_needed is necessary to re-enable transfers and prevent other
    * consequences. If this date is in the future, fields_needed must be
    * provided to ensure the account remains in good standing.
    */
  var due_by: Double = js.native
  /**
    * Field names that need to be provided for the account to remain in good
    * standing. Nested fields are separated by "." (for example,
    * "legal_entity.first_name").
    */
  var fields_needed: js.Array[String] = js.native
  /**
    * The set of capabilities you want to unlock for this account (US only).
    * Each capability will be inactive until you have provided its specific requirements and Stripe has verified them.
    * An account may have some of its requested capabilities be active and some be inactive.
    */
  var requested_capabilities: js.UndefOr[js.Array[String]] = js.native
}

object AnonDisabledreason {
  @scala.inline
  def apply(disabled_reason: String, due_by: Double, fields_needed: js.Array[String]): AnonDisabledreason = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], due_by = due_by.asInstanceOf[js.Any], fields_needed = fields_needed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabledreason]
  }
  @scala.inline
  implicit class AnonDisabledreasonOps[Self <: AnonDisabledreason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDue_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields_needed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields_needed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequested_capabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested_capabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested_capabilities")(js.undefined)
        ret
    }
  }
  
}

