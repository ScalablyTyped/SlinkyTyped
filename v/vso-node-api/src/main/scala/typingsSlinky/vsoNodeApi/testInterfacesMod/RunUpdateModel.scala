package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunUpdateModel extends js.Object {
  var build: ShallowReference = js.native
  var buildDropLocation: String = js.native
  var buildFlavor: String = js.native
  var buildPlatform: String = js.native
  var comment: String = js.native
  var completedDate: String = js.native
  var controller: String = js.native
  var deleteInProgressResults: Boolean = js.native
  var dtlAutEnvironment: ShallowReference = js.native
  var dtlEnvironment: ShallowReference = js.native
  var dtlEnvironmentDetails: DtlEnvironmentDetails = js.native
  var dueDate: String = js.native
  var errorMessage: String = js.native
  var iteration: String = js.native
  var logEntries: js.Array[TestMessageLogDetails] = js.native
  var name: String = js.native
  var releaseEnvironmentUri: String = js.native
  var releaseUri: String = js.native
  var sourceWorkflow: String = js.native
  var startedDate: String = js.native
  var state: String = js.native
  var substate: TestRunSubstate = js.native
  var testEnvironmentId: String = js.native
  var testSettings: ShallowReference = js.native
}

object RunUpdateModel {
  @scala.inline
  def apply(
    build: ShallowReference,
    buildDropLocation: String,
    buildFlavor: String,
    buildPlatform: String,
    comment: String,
    completedDate: String,
    controller: String,
    deleteInProgressResults: Boolean,
    dtlAutEnvironment: ShallowReference,
    dtlEnvironment: ShallowReference,
    dtlEnvironmentDetails: DtlEnvironmentDetails,
    dueDate: String,
    errorMessage: String,
    iteration: String,
    logEntries: js.Array[TestMessageLogDetails],
    name: String,
    releaseEnvironmentUri: String,
    releaseUri: String,
    sourceWorkflow: String,
    startedDate: String,
    state: String,
    substate: TestRunSubstate,
    testEnvironmentId: String,
    testSettings: ShallowReference
  ): RunUpdateModel = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildDropLocation = buildDropLocation.asInstanceOf[js.Any], buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], deleteInProgressResults = deleteInProgressResults.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlEnvironment = dtlEnvironment.asInstanceOf[js.Any], dtlEnvironmentDetails = dtlEnvironmentDetails.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], logEntries = logEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], sourceWorkflow = sourceWorkflow.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substate = substate.asInstanceOf[js.Any], testEnvironmentId = testEnvironmentId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunUpdateModel]
  }
  @scala.inline
  implicit class RunUpdateModelOps[Self <: RunUpdateModel] (val x: Self) extends AnyVal {
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
    def withBuildDropLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDropLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildFlavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildFlavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPlatform")(value.asInstanceOf[js.Any])
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
    def withController(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteInProgressResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInProgressResults")(value.asInstanceOf[js.Any])
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
    def withDtlEnvironmentDetails(value: DtlEnvironmentDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtlEnvironmentDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDueDate(value: String): Self = {
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
    def withIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogEntries(value: js.Array[TestMessageLogDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withSourceWorkflow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceWorkflow")(value.asInstanceOf[js.Any])
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
    def withSubstate(value: TestRunSubstate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestEnvironmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testEnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSettings(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

