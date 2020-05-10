package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestActionResultModel extends TestResultModelBase {
  var actionPath: String = js.native
  var iterationId: Double = js.native
  var sharedStepModel: SharedStepModel = js.native
  /**
    * This is step Id of test case. For shared step, it is step Id of shared step in test case workitem; step Id in shared step. Example: TestCase workitem has two steps: 1) Normal step with Id = 1 2) Shared Step with Id = 2. Inside shared step: a) Normal Step with Id = 1 Value for StepIdentifier for First step: "1" Second step: "2;1"
    */
  var stepIdentifier: String = js.native
  var url: String = js.native
}

object TestActionResultModel {
  @scala.inline
  def apply(
    actionPath: String,
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    iterationId: Double,
    outcome: String,
    sharedStepModel: SharedStepModel,
    startedDate: js.Date,
    stepIdentifier: String,
    url: String
  ): TestActionResultModel = {
    val __obj = js.Dynamic.literal(actionPath = actionPath.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], sharedStepModel = sharedStepModel.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], stepIdentifier = stepIdentifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestActionResultModel]
  }
  @scala.inline
  implicit class TestActionResultModelOps[Self <: TestActionResultModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedStepModel(value: SharedStepModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedStepModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepIdentifier")(value.asInstanceOf[js.Any])
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

