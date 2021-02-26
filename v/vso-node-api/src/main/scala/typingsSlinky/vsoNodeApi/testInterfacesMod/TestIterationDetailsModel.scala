package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIterationDetailsModel extends StObject {
  
  var actionResults: js.Array[TestActionResultModel] = js.native
  
  var attachments: js.Array[TestCaseResultAttachmentModel] = js.native
  
  var comment: String = js.native
  
  var completedDate: js.Date = js.native
  
  var durationInMs: Double = js.native
  
  var errorMessage: String = js.native
  
  var id: Double = js.native
  
  var outcome: String = js.native
  
  var parameters: js.Array[TestResultParameterModel] = js.native
  
  var startedDate: js.Date = js.native
  
  var url: String = js.native
}
object TestIterationDetailsModel {
  
  @scala.inline
  def apply(
    actionResults: js.Array[TestActionResultModel],
    attachments: js.Array[TestCaseResultAttachmentModel],
    comment: String,
    completedDate: js.Date,
    durationInMs: Double,
    errorMessage: String,
    id: Double,
    outcome: String,
    parameters: js.Array[TestResultParameterModel],
    startedDate: js.Date,
    url: String
  ): TestIterationDetailsModel = {
    val __obj = js.Dynamic.literal(actionResults = actionResults.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], durationInMs = durationInMs.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIterationDetailsModel]
  }
  
  @scala.inline
  implicit class TestIterationDetailsModelMutableBuilder[Self <: TestIterationDetailsModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionResults(value: js.Array[TestActionResultModel]): Self = StObject.set(x, "actionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionResultsVarargs(value: TestActionResultModel*): Self = StObject.set(x, "actionResults", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[TestCaseResultAttachmentModel]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: TestCaseResultAttachmentModel*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: js.Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMs(value: Double): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[TestResultParameterModel]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: TestResultParameterModel*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setStartedDate(value: js.Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
