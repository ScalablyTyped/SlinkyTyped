package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDueby extends js.Object {
  /**
    * Date by which evidence must be submitted in order to successfully challenge dispute. Will be null
    * if the customer's bank or credit card company doesn't allow a response for this particular dispute.
    */
  var due_by: Double = js.native
  /**
    * Whether or not evidence has been saved for this dispute.
    */
  var has_evidence: Boolean = js.native
  /**
    * Whether or not the last evidence submission was submitted past the due date. Defaults to false
    * if no evidence submissions have occurred. If true, then delivery of the latest evidence is not guaranteed.
    */
  var past_due: Boolean = js.native
  /**
    * The number of times the evidence has been submitted. You may submit evidence a maximum of 5 times
    */
  var submission_count: Double = js.native
}

object AnonDueby {
  @scala.inline
  def apply(due_by: Double, has_evidence: Boolean, past_due: Boolean, submission_count: Double): AnonDueby = {
    val __obj = js.Dynamic.literal(due_by = due_by.asInstanceOf[js.Any], has_evidence = has_evidence.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any], submission_count = submission_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDueby]
  }
  @scala.inline
  implicit class AnonDuebyOps[Self <: AnonDueby] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDue_by(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_evidence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPast_due(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past_due")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmission_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submission_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

