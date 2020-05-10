package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlan extends js.Object {
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
  implicit class TestPlanOps[Self <: TestPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestEnvironment(value: TestEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedTestSettings(value: TestSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildDefinition(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualTestEnvironment(value: TestEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualTestEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualTestSettings(value: TestSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualTestSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousBuild(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvironmentDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootSuite(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedDate")(value.asInstanceOf[js.Any])
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

