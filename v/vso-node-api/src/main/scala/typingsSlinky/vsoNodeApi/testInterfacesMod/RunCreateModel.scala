package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunCreateModel extends StObject {
  
  var automated: Boolean = js.native
  
  var build: ShallowReference = js.native
  
  var buildDropLocation: String = js.native
  
  var buildFlavor: String = js.native
  
  var buildPlatform: String = js.native
  
  var comment: String = js.native
  
  var completeDate: String = js.native
  
  var configurationIds: js.Array[Double] = js.native
  
  var controller: String = js.native
  
  var customTestFields: js.Array[CustomTestField] = js.native
  
  var dtlAutEnvironment: ShallowReference = js.native
  
  var dtlTestEnvironment: ShallowReference = js.native
  
  var dueDate: String = js.native
  
  var environmentDetails: DtlEnvironmentDetails = js.native
  
  var errorMessage: String = js.native
  
  var filter: RunFilter = js.native
  
  var iteration: String = js.native
  
  var name: String = js.native
  
  var owner: IdentityRef = js.native
  
  var plan: ShallowReference = js.native
  
  var pointIds: js.Array[Double] = js.native
  
  var releaseEnvironmentUri: String = js.native
  
  var releaseUri: String = js.native
  
  var runTimeout: js.Any = js.native
  
  var sourceWorkflow: String = js.native
  
  var startDate: String = js.native
  
  var state: String = js.native
  
  var testConfigurationsMapping: String = js.native
  
  var testEnvironmentId: String = js.native
  
  var testSettings: ShallowReference = js.native
  
  var `type`: String = js.native
}
object RunCreateModel {
  
  @scala.inline
  def apply(
    automated: Boolean,
    build: ShallowReference,
    buildDropLocation: String,
    buildFlavor: String,
    buildPlatform: String,
    comment: String,
    completeDate: String,
    configurationIds: js.Array[Double],
    controller: String,
    customTestFields: js.Array[CustomTestField],
    dtlAutEnvironment: ShallowReference,
    dtlTestEnvironment: ShallowReference,
    dueDate: String,
    environmentDetails: DtlEnvironmentDetails,
    errorMessage: String,
    filter: RunFilter,
    iteration: String,
    name: String,
    owner: IdentityRef,
    plan: ShallowReference,
    pointIds: js.Array[Double],
    releaseEnvironmentUri: String,
    releaseUri: String,
    runTimeout: js.Any,
    sourceWorkflow: String,
    startDate: String,
    state: String,
    testConfigurationsMapping: String,
    testEnvironmentId: String,
    testSettings: ShallowReference,
    `type`: String
  ): RunCreateModel = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDropLocation = buildDropLocation.asInstanceOf[js.Any], buildFlavor = buildFlavor.asInstanceOf[js.Any], buildPlatform = buildPlatform.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completeDate = completeDate.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], customTestFields = customTestFields.asInstanceOf[js.Any], dtlAutEnvironment = dtlAutEnvironment.asInstanceOf[js.Any], dtlTestEnvironment = dtlTestEnvironment.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], environmentDetails = environmentDetails.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], pointIds = pointIds.asInstanceOf[js.Any], releaseEnvironmentUri = releaseEnvironmentUri.asInstanceOf[js.Any], releaseUri = releaseUri.asInstanceOf[js.Any], runTimeout = runTimeout.asInstanceOf[js.Any], sourceWorkflow = sourceWorkflow.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testConfigurationsMapping = testConfigurationsMapping.asInstanceOf[js.Any], testEnvironmentId = testEnvironmentId.asInstanceOf[js.Any], testSettings = testSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCreateModel]
  }
  
  @scala.inline
  implicit class RunCreateModelMutableBuilder[Self <: RunCreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomated(value: Boolean): Self = StObject.set(x, "automated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDropLocation(value: String): Self = StObject.set(x, "buildDropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildFlavor(value: String): Self = StObject.set(x, "buildFlavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildPlatform(value: String): Self = StObject.set(x, "buildPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteDate(value: String): Self = StObject.set(x, "completeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIds(value: js.Array[Double]): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: Double*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTestFields(value: js.Array[CustomTestField]): Self = StObject.set(x, "customTestFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTestFieldsVarargs(value: CustomTestField*): Self = StObject.set(x, "customTestFields", js.Array(value :_*))
    
    @scala.inline
    def setDtlAutEnvironment(value: ShallowReference): Self = StObject.set(x, "dtlAutEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlTestEnvironment(value: ShallowReference): Self = StObject.set(x, "dtlTestEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDetails(value: DtlEnvironmentDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: RunFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: ShallowReference): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIds(value: js.Array[Double]): Self = StObject.set(x, "pointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIdsVarargs(value: Double*): Self = StObject.set(x, "pointIds", js.Array(value :_*))
    
    @scala.inline
    def setReleaseEnvironmentUri(value: String): Self = StObject.set(x, "releaseEnvironmentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUri(value: String): Self = StObject.set(x, "releaseUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunTimeout(value: js.Any): Self = StObject.set(x, "runTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWorkflow(value: String): Self = StObject.set(x, "sourceWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestConfigurationsMapping(value: String): Self = StObject.set(x, "testConfigurationsMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestEnvironmentId(value: String): Self = StObject.set(x, "testEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSettings(value: ShallowReference): Self = StObject.set(x, "testSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
