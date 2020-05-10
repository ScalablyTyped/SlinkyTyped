package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultCreateModel extends js.Object {
  var area: ShallowReference = js.native
  var associatedWorkItems: js.Array[Double] = js.native
  var automatedTestId: String = js.native
  var automatedTestName: String = js.native
  var automatedTestStorage: String = js.native
  var automatedTestType: String = js.native
  var automatedTestTypeId: String = js.native
  var comment: String = js.native
  var completedDate: String = js.native
  var computerName: String = js.native
  var configuration: ShallowReference = js.native
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
  var testCase: ShallowReference = js.native
  var testCasePriority: String = js.native
  var testCaseTitle: String = js.native
  var testPoint: ShallowReference = js.native
}

object TestResultCreateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    associatedWorkItems: js.Array[Double],
    automatedTestId: String,
    automatedTestName: String,
    automatedTestStorage: String,
    automatedTestType: String,
    automatedTestTypeId: String,
    comment: String,
    completedDate: String,
    computerName: String,
    configuration: ShallowReference,
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
    testCase: ShallowReference,
    testCasePriority: String,
    testCaseTitle: String,
    testPoint: ShallowReference
  ): TestResultCreateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], associatedWorkItems = associatedWorkItems.asInstanceOf[js.Any], automatedTestId = automatedTestId.asInstanceOf[js.Any], automatedTestName = automatedTestName.asInstanceOf[js.Any], automatedTestStorage = automatedTestStorage.asInstanceOf[js.Any], automatedTestType = automatedTestType.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testCasePriority = testCasePriority.asInstanceOf[js.Any], testCaseTitle = testCaseTitle.asInstanceOf[js.Any], testPoint = testPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultCreateModel]
  }
  @scala.inline
  implicit class TestResultCreateModelOps[Self <: TestResultCreateModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedWorkItems(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedWorkItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestType")(value.asInstanceOf[js.Any])
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
    def withConfiguration(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
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
    def withTestCase(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCasePriority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCasePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPoint(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

