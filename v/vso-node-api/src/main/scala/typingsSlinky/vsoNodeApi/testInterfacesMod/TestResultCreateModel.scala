package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultCreateModel extends StObject {
  
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
  implicit class TestResultCreateModelMutableBuilder[Self <: TestResultCreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWorkItems(value: js.Array[Double]): Self = StObject.set(x, "associatedWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedWorkItemsVarargs(value: Double*): Self = StObject.set(x, "associatedWorkItems", js.Array(value :_*))
    
    @scala.inline
    def setAutomatedTestId(value: String): Self = StObject.set(x, "automatedTestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestName(value: String): Self = StObject.set(x, "automatedTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestStorage(value: String): Self = StObject.set(x, "automatedTestStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestType(value: String): Self = StObject.set(x, "automatedTestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestTypeId(value: String): Self = StObject.set(x, "automatedTestTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDurationInMs(value: String): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionState(value: String): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: String): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCase(value: ShallowReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasePriority(value: String): Self = StObject.set(x, "testCasePriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseTitle(value: String): Self = StObject.set(x, "testCaseTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPoint(value: ShallowReference): Self = StObject.set(x, "testPoint", value.asInstanceOf[js.Any])
  }
}
