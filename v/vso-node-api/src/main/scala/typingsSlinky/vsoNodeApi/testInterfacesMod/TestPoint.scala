package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPoint extends js.Object {
  var assignedTo: IdentityRef = js.native
  var automated: Boolean = js.native
  var comment: String = js.native
  var configuration: ShallowReference = js.native
  var failureType: String = js.native
  var id: Double = js.native
  var lastResolutionStateId: Double = js.native
  var lastResult: ShallowReference = js.native
  var lastResultDetails: LastResultDetails = js.native
  var lastResultState: String = js.native
  var lastRunBuildNumber: String = js.native
  var lastTestRun: ShallowReference = js.native
  var lastUpdatedBy: IdentityRef = js.native
  var lastUpdatedDate: js.Date = js.native
  var outcome: String = js.native
  var revision: Double = js.native
  var state: String = js.native
  var suite: ShallowReference = js.native
  var testCase: WorkItemReference = js.native
  var testPlan: ShallowReference = js.native
  var url: String = js.native
  var workItemProperties: js.Array[_] = js.native
}

object TestPoint {
  @scala.inline
  def apply(
    assignedTo: IdentityRef,
    automated: Boolean,
    comment: String,
    configuration: ShallowReference,
    failureType: String,
    id: Double,
    lastResolutionStateId: Double,
    lastResult: ShallowReference,
    lastResultDetails: LastResultDetails,
    lastResultState: String,
    lastRunBuildNumber: String,
    lastTestRun: ShallowReference,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    outcome: String,
    revision: Double,
    state: String,
    suite: ShallowReference,
    testCase: WorkItemReference,
    testPlan: ShallowReference,
    url: String,
    workItemProperties: js.Array[_]
  ): TestPoint = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], automated = automated.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], failureType = failureType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResolutionStateId = lastResolutionStateId.asInstanceOf[js.Any], lastResult = lastResult.asInstanceOf[js.Any], lastResultDetails = lastResultDetails.asInstanceOf[js.Any], lastResultState = lastResultState.asInstanceOf[js.Any], lastRunBuildNumber = lastRunBuildNumber.asInstanceOf[js.Any], lastTestRun = lastTestRun.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], testCase = testCase.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemProperties = workItemProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPoint]
  }
  @scala.inline
  implicit class TestPointOps[Self <: TestPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignedTo(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
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
    def withLastResolutionStateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResolutionStateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResult(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResultDetails(value: LastResultDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResultDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastResultState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastResultState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRunBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRunBuildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTestRun(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTestRun")(value.asInstanceOf[js.Any])
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
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuite(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCase(value: WorkItemReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPlan(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemProperties(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

