package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseResult extends js.Object {
  var afnStripId: Double = js.native
  var area: ShallowReference = js.native
  var associatedBugs: js.Array[ShallowReference] = js.native
  var automatedTestId: String = js.native
  var automatedTestName: String = js.native
  var automatedTestStorage: String = js.native
  var automatedTestType: String = js.native
  var automatedTestTypeId: String = js.native
  var build: ShallowReference = js.native
  var buildReference: BuildReference = js.native
  var comment: String = js.native
  var completedDate: js.Date = js.native
  var computerName: String = js.native
  var configuration: ShallowReference = js.native
  var createdDate: js.Date = js.native
  var customFields: js.Array[CustomTestField] = js.native
  var durationInMs: Double = js.native
  var errorMessage: String = js.native
  var failingSince: FailingSince = js.native
  var failureType: String = js.native
  var id: Double = js.native
  var iterationDetails: js.Array[TestIterationDetailsModel] = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: js.Date = js.native
  var outcome: String = js.native
  var owner: IdentityRef = js.native
  var priority: Double = js.native
  var project: ShallowReference = js.native
  var release: ShallowReference = js.native
  var releaseReference: ReleaseReference = js.native
  var resetCount: Double = js.native
  var resolutionState: String = js.native
  var resolutionStateId: Double = js.native
  var revision: Double = js.native
  var runBy: IdentityRef = js.native
  var stackTrace: String = js.native
  var startedDate: js.Date = js.native
  var state: String = js.native
  var testCase: ShallowReference = js.native
  var testCaseReferenceId: Double = js.native
  var testCaseTitle: String = js.native
  var testPlan: ShallowReference = js.native
  var testPoint: ShallowReference = js.native
  var testRun: ShallowReference = js.native
  var testSuite: ShallowReference = js.native
  var url: String = js.native
}

object TestCaseResult {
  @scala.inline
  def apply(
    afnStripId: Double,
    area: ShallowReference,
    associatedBugs: js.Array[ShallowReference],
    automatedTestId: String,
    automatedTestName: String,
    automatedTestStorage: String,
    automatedTestType: String,
    automatedTestTypeId: String,
    build: ShallowReference,
    buildReference: BuildReference,
    comment: String,
    completedDate: js.Date,
    computerName: String,
    configuration: ShallowReference,
    createdDate: js.Date,
    customFields: js.Array[CustomTestField],
    durationInMs: Double,
    errorMessage: String,
    failingSince: FailingSince,
    failureType: String,
    id: Double,
    iterationDetails: js.Array[TestIterationDetailsModel],
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    outcome: String,
    owner: IdentityRef,
    priority: Double,
    project: ShallowReference,
    release: ShallowReference,
    releaseReference: ReleaseReference,
    resetCount: Double,
    resolutionState: String,
    resolutionStateId: Double,
    revision: Double,
    runBy: IdentityRef,
    stackTrace: String,
    startedDate: js.Date,
    state: String,
    testCase: ShallowReference,
    testCaseReferenceId: Double,
    testCaseTitle: String,
    testPlan: ShallowReference,
    testPoint: ShallowReference,
    testRun: ShallowReference,
    testSuite: ShallowReference,
    url: String
  ): TestCaseResult = {
    val __obj = js.Dynamic.literal(afnStripId = afnStripId.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], associatedBugs = associatedBugs.asInstanceOf[js.Any], automatedTestId = automatedTestId.asInstanceOf[js.Any], automatedTestName = automatedTestName.asInstanceOf[js.Any], automatedTestStorage = automatedTestStorage.asInstanceOf[js.Any], automatedTestType = automatedTestType.asInstanceOf[js.Any], automatedTestTypeId = automatedTestTypeId.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildReference = buildReference.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], failingSince = failingSince.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationDetails = iterationDetails.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseReference = releaseReference.asInstanceOf[js.Any], resetCount = resetCount.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], resolutionStateId = resolutionStateId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runBy = runBy.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testCaseReferenceId = testCaseReferenceId.asInstanceOf[js.Any], testCaseTitle = testCaseTitle.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoint = testPoint.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResult]
  }
  @scala.inline
  implicit class TestCaseResultOps[Self <: TestCaseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfnStripId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afnStripId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedBugs(value: js.Array[ShallowReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedBugs")(value.asInstanceOf[js.Any])
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
    def withBuild(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildReference(value: BuildReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildReference")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFields(value: js.Array[CustomTestField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
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
    def withFailingSince(value: FailingSince): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failingSince")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationDetails(value: js.Array[TestIterationDetailsModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
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
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseReference(value: ReleaseReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolutionStateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionStateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
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
    def withStartedDate(value: js.Date): Self = {
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
    def withTestCaseReferenceId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPoint(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRun(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSuite(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

