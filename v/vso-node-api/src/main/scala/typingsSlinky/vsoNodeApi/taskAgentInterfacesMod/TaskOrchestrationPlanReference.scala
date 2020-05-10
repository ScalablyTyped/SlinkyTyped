package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOrchestrationPlanReference extends js.Object {
  var artifactLocation: String = js.native
  var artifactUri: String = js.native
  var definition: TaskOrchestrationOwner = js.native
  var owner: TaskOrchestrationOwner = js.native
  var planId: String = js.native
  var planType: String = js.native
  var scopeIdentifier: String = js.native
  var version: Double = js.native
}

object TaskOrchestrationPlanReference {
  @scala.inline
  def apply(
    artifactLocation: String,
    artifactUri: String,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planId: String,
    planType: String,
    scopeIdentifier: String,
    version: Double
  ): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
  @scala.inline
  implicit class TaskOrchestrationPlanReferenceOps[Self <: TaskOrchestrationPlanReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: TaskOrchestrationOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

