package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultUpdateRequestModel extends StObject {
  
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
  implicit class ResultUpdateRequestModelMutableBuilder[Self <: ResultUpdateRequestModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionResultDeletes(value: js.Array[TestActionResultModel]): Self = StObject.set(x, "actionResultDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionResultDeletesVarargs(value: TestActionResultModel*): Self = StObject.set(x, "actionResultDeletes", js.Array(value :_*))
    
    @scala.inline
    def setActionResults(value: js.Array[TestActionResultModel]): Self = StObject.set(x, "actionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionResultsVarargs(value: TestActionResultModel*): Self = StObject.set(x, "actionResults", js.Array(value :_*))
    
    @scala.inline
    def setParameterDeletes(value: js.Array[TestResultParameterModel]): Self = StObject.set(x, "parameterDeletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterDeletesVarargs(value: TestResultParameterModel*): Self = StObject.set(x, "parameterDeletes", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[TestResultParameterModel]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: TestResultParameterModel*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseResult(value: TestCaseResultUpdateModel): Self = StObject.set(x, "testCaseResult", value.asInstanceOf[js.Any])
  }
}
