package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseResultUpdateModel extends js.Object {
  var associatedWorkItems: js.Array[Double] = js.native
  var automatedTestTypeId: String = js.native
  var comment: String = js.native
  var completedDate: String = js.native
  var computerName: String = js.native
  var customFields: js.Array[CustomTestField] = js.native
  var durationInMs: String = js.native
  var errorMessage: String = js.native
  var failureType: String = js.native
  var outcome: String = js.native
  var owner: IdentityRef = js.native
  var resolutionState: String = js.native
  var runBy: IdentityRef = js.native
  var stackTrace: String = js.native
  var startedDate: String = js.native
  var state: String = js.native
  var testCasePriority: String = js.native
  var testResult: ShallowReference = js.native
}

object TestCaseResultUpdateModel {
  @scala.inline
  def apply(
    associatedWorkItems: js.Array[Double],
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    customFields: js.Array[CustomTestField],
    durationInMs: String,
    errorMessage: String,
    failureType: String,
    outcome: String,
    owner: IdentityRef,
    resolutionState: String,
    runBy: IdentityRef,
    stackTrace: String,
    startedDate: String,
    state: String,
    testCasePriority: String,
    testResult: ShallowReference
  ): TestCaseResultUpdateModel = {
    val __obj = js.Dynamic.literal(associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultUpdateModel]
  }
  @scala.inline
  implicit class TestCaseResultUpdateModelOps[Self <: TestCaseResultUpdateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedWorkItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFields(value: js.Array[CustomTestField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInMs(value: String): Self = {
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
    def withFailureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutcome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCasePriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCasePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResult(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

