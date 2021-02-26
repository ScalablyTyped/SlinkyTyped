package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestCaseResult extends StObject {
  
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
  implicit class TestCaseResultMutableBuilder[Self <: TestCaseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfnStripId(value: Double): Self = StObject.set(x, "afnStripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedBugs(value: js.Array[ShallowReference]): Self = StObject.set(x, "associatedBugs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedBugsVarargs(value: ShallowReference*): Self = StObject.set(x, "associatedBugs", js.Array(value :_*))
    
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
    def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildReference(value: BuildReference): Self = StObject.set(x, "buildReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: js.Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ShallowReference): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDurationInMs(value: Double): Self = StObject.set(x, "durationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailingSince(value: FailingSince): Self = StObject.set(x, "failingSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationDetails(value: js.Array[TestIterationDetailsModel]): Self = StObject.set(x, "iterationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationDetailsVarargs(value: TestIterationDetailsModel*): Self = StObject.set(x, "iterationDetails", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: ShallowReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseReference(value: ReleaseReference): Self = StObject.set(x, "releaseReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetCount(value: Double): Self = StObject.set(x, "resetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionState(value: String): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStateId(value: Double): Self = StObject.set(x, "resolutionStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBy(value: IdentityRef): Self = StObject.set(x, "runBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedDate(value: js.Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCase(value: ShallowReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseReferenceId(value: Double): Self = StObject.set(x, "testCaseReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseTitle(value: String): Self = StObject.set(x, "testCaseTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPlan(value: ShallowReference): Self = StObject.set(x, "testPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPoint(value: ShallowReference): Self = StObject.set(x, "testPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRun(value: ShallowReference): Self = StObject.set(x, "testRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSuite(value: ShallowReference): Self = StObject.set(x, "testSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
