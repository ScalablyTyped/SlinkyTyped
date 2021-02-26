package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TestActionResultModelMutableBuilder[Self <: TestActionResultModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionPath(value: String): Self = StObject.set(x, "actionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationId(value: Double): Self = StObject.set(x, "iterationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedStepModel(value: SharedStepModel): Self = StObject.set(x, "sharedStepModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdentifier(value: String): Self = StObject.set(x, "stepIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
