package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultModelBase extends js.Object {
  var comment: String = js.native
  var completedDate: js.Date = js.native
  var durationInMs: Double = js.native
  var errorMessage: String = js.native
  var outcome: String = js.native
  var startedDate: js.Date = js.native
}

object TestResultModelBase {
  @scala.inline
  def apply(
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    outcome: String,
    startedDate: js.Date
  ): TestResultModelBase = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultModelBase]
  }
  @scala.inline
  implicit class TestResultModelBaseOps[Self <: TestResultModelBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutcome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

