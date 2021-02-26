package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestPlan extends StObject {
  
  var area: ShallowReference = js.native
  
  var automatedTestEnvironment: TestEnvironment = js.native
  
  var automatedTestSettings: TestSettings = js.native
  
  var build: ShallowReference = js.native
  
  var buildDefinition: ShallowReference = js.native
  
  var clientUrl: String = js.native
  
  var description: String = js.native
  
  var endDate: js.Date = js.native
  
  var id: Double = js.native
  
  var iteration: String = js.native
  
  var manualTestEnvironment: TestEnvironment = js.native
  
  var manualTestSettings: TestSettings = js.native
  
  var name: String = js.native
  
  var owner: IdentityRef = js.native
  
  var previousBuild: ShallowReference = js.native
  
  var project: ShallowReference = js.native
  
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference = js.native
  
  var revision: Double = js.native
  
  var rootSuite: ShallowReference = js.native
  
  var startDate: js.Date = js.native
  
  var state: String = js.native
  
  var updatedBy: IdentityRef = js.native
  
  var updatedDate: js.Date = js.native
  
  var url: String = js.native
}
object TestPlan {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    clientUrl: String,
    description: String,
    endDate: js.Date,
    id: Double,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    previousBuild: ShallowReference,
    project: ShallowReference,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    revision: Double,
    rootSuite: ShallowReference,
    startDate: js.Date,
    state: String,
    updatedBy: IdentityRef,
    updatedDate: js.Date,
    url: String
  ): TestPlan = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], clientUrl = clientUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], previousBuild = previousBuild.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], rootSuite = rootSuite.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  
  @scala.inline
  implicit class TestPlanMutableBuilder[Self <: TestPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "automatedTestEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestSettings(value: TestSettings): Self = StObject.set(x, "automatedTestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: ShallowReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDefinition(value: ShallowReference): Self = StObject.set(x, "buildDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUrl(value: String): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "manualTestEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualTestSettings(value: TestSettings): Self = StObject.set(x, "manualTestSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousBuild(value: ShallowReference): Self = StObject.set(x, "previousBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = StObject.set(x, "releaseEnvironmentDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootSuite(value: ShallowReference): Self = StObject.set(x, "rootSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: IdentityRef): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
