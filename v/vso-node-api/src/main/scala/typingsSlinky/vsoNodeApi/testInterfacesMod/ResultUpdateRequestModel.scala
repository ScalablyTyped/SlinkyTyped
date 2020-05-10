package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultUpdateRequestModel extends js.Object {
  var actionResultDeletes: js.Array[TestActionResultModel] = js.native
  var actionResults: js.Array[TestActionResultModel] = js.native
  var parameterDeletes: js.Array[TestResultParameterModel] = js.native
  var parameters: js.Array[TestResultParameterModel] = js.native
  var testCaseResult: TestCaseResultUpdateModel = js.native
}

object ResultUpdateRequestModel {
  @scala.inline
  def apply(
    actionResultDeletes: js.Array[TestActionResultModel],
    actionResults: js.Array[TestActionResultModel],
    parameterDeletes: js.Array[TestResultParameterModel],
    parameters: js.Array[TestResultParameterModel],
    testCaseResult: TestCaseResultUpdateModel
  ): ResultUpdateRequestModel = {
    val __obj = js.Dynamic.literal(actionResultDeletes = actionResultDeletes.asInstanceOf[js.Any], actionResults = actionResults.asInstanceOf[js.Any], parameterDeletes = parameterDeletes.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultUpdateRequestModel]
  }
  @scala.inline
  implicit class ResultUpdateRequestModelOps[Self <: ResultUpdateRequestModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionResultDeletes(value: js.Array[TestActionResultModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResultDeletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionResults(value: js.Array[TestActionResultModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterDeletes(value: js.Array[TestResultParameterModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterDeletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[TestResultParameterModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseResult(value: TestCaseResultUpdateModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

