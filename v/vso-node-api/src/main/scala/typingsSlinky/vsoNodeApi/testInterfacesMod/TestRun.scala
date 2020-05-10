package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRun extends js.Object {
  var build: ShallowReference = js.native
  var buildConfiguration: BuildConfiguration = js.native
  var comment: String = js.native
  var completedDate: js.Date = js.native
  var controller: String = js.native
  var createdDate: js.Date = js.native
  var customFields: js.Array[CustomTestField] = js.native
  var dropLocation: String = js.native
  var dtlAutEnvironment: ShallowReference = js.native
  var dtlEnvironment: ShallowReference = js.native
  var dtlEnvironmentCreationDetails: DtlEnvironmentDetails = js.native
  var dueDate: js.Date = js.native
  var errorMessage: String = js.native
  var filter: RunFilter = js.native
  var id: Double = js.native
  var incompleteTests: Double = js.native
  var isAutomated: Boolean = js.native
  var iteration: String = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: js.Date = js.native
  var name: String = js.native
  var notApplicableTests: Double = js.native
  var owner: IdentityRef = js.native
  var passedTests: Double = js.native
  var phase: String = js.native
  var plan: ShallowReference = js.native
  var postProcessState: String = js.native
  var project: ShallowReference = js.native
  var release: ReleaseReference = js.native
  var releaseEnvironmentUri: String = js.native
  var releaseUri: String = js.native
  var revision: Double = js.native
  var runStatistics: js.Array[RunStatistic] = js.native
  var startedDate: js.Date = js.native
  var state: String = js.native
  var substate: TestRunSubstate = js.native
  var testEnvironment: TestEnvironment = js.native
  var testMessageLogId: Double = js.native
  var testSettings: ShallowReference = js.native
  var totalTests: Double = js.native
  var unanalyzedTests: Double = js.native
  var url: String = js.native
  var webAccessUrl: String = js.native
}

object TestRun {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildConfiguration: BuildConfiguration,
    comment: String,
    completedDate: js.Date,
    controller: String,
    createdDate: js.Date,
    customFields: js.Array[CustomTestField],
    dropLocation: String,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentCreationDetails: DtlEnvironmentDetails,
    dueDate: js.Date,
    errorMessage: String,
    filter: RunFilter,
    id: Double,
    incompleteTests: Double,
    isAutomated: Boolean,
    iteration: String,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    name: String,
    notApplicableTests: Double,
    owner: IdentityRef,
    passedTests: Double,
    phase: String,
    plan: ShallowReference,
    postProcessState: String,
    project: ShallowReference,
    release: ReleaseReference,
    releaseEnvironmentUri: String,
    releaseUri: String,
    revision: Double,
    runStatistics: js.Array[RunStatistic],
    startedDate: js.Date,
    state: String,
    substate: TestRunSubstate,
    testEnvironment: TestEnvironment,
    testMessageLogId: Double,
    testSettings: ShallowReference,
    totalTests: Double,
    unanalyzedTests: Double,
    url: String,
    webAccessUrl: String
  ): TestRun = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildConfiguration = buildConfiguration.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], customFields = customFields.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlEnvironment = dtlEnvironment.asInstanceOf[js.Any], dtlEnvironmentCreationDetails = dtlEnvironmentCreationDetails.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incompleteTests = incompleteTests.asInstanceOf[js.Any], isAutomated = isAutomated.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notApplicableTests = notApplicableTests.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], passedTests = passedTests.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], postProcessState = postProcessState.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], runStatistics = runStatistics.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substate = substate.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testMessageLogId = testMessageLogId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any], unanalyzedTests = unanalyzedTests.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webAccessUrl = webAccessUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRun]
  }
  @scala.inline
  implicit class TestRunOps[Self <: TestRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildConfiguration(value: BuildConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildConfiguration")(value.asInstanceOf[js.Any])
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
    def withController(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
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
    def withDropLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtlAutEnvironment(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtlAutEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtlEnvironment(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtlEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtlEnvironmentCreationDetails(value: DtlEnvironmentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtlEnvironmentCreationDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dueDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: RunFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncompleteTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompleteTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAutomated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotApplicableTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notApplicableTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassedTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostProcessState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: ReleaseReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseEnvironmentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvironmentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunStatistics(value: js.Array[RunStatistic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runStatistics")(value.asInstanceOf[js.Any])
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
    def withSubstate(value: TestRunSubstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestEnvironment(value: TestEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestMessageLogId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMessageLogId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSettings(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnanalyzedTests(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unanalyzedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAccessUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccessUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

