package typingsSlinky.vsoNodeApi.testInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlanUpdateModel extends js.Object {
  var area: ShallowReference = js.native
  var automatedTestEnvironment: TestEnvironment = js.native
  var automatedTestSettings: TestSettings = js.native
  var build: ShallowReference = js.native
  var buildDefinition: ShallowReference = js.native
  var configurationIds: js.Array[Double] = js.native
  var description: String = js.native
  var endDate: String = js.native
  var iteration: String = js.native
  var manualTestEnvironment: TestEnvironment = js.native
  var manualTestSettings: TestSettings = js.native
  var name: String = js.native
  var owner: IdentityRef = js.native
  var releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference = js.native
  var startDate: String = js.native
  var state: String = js.native
  var status: String = js.native
}

object PlanUpdateModel {
  @scala.inline
  def apply(
    area: ShallowReference,
    automatedTestEnvironment: TestEnvironment,
    automatedTestSettings: TestSettings,
    build: ShallowReference,
    buildDefinition: ShallowReference,
    configurationIds: js.Array[Double],
    description: String,
    endDate: String,
    iteration: String,
    manualTestEnvironment: TestEnvironment,
    manualTestSettings: TestSettings,
    name: String,
    owner: IdentityRef,
    releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference,
    startDate: String,
    state: String,
    status: String
  ): PlanUpdateModel = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], automatedTestEnvironment = automatedTestEnvironment.asInstanceOf[js.Any], automatedTestSettings = automatedTestSettings.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildDefinition = buildDefinition.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], manualTestEnvironment = manualTestEnvironment.asInstanceOf[js.Any], manualTestSettings = manualTestSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], releaseEnvironmentDefinition = releaseEnvironmentDefinition.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanUpdateModel]
  }
  @scala.inline
  implicit class PlanUpdateModelOps[Self <: PlanUpdateModel] (val x: Self) extends AnyVal {
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
    def withConfigurationIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
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
    def withReleaseEnvironmentDefinition(value: ReleaseEnvironmentDefinitionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvironmentDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

