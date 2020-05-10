package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironmentCompletedEvent extends js.Object {
  var createdByName: String = js.native
  var definitionId: Double = js.native
  var definitionName: String = js.native
  var environment: ReleaseEnvironment = js.native
  var environmentId: Double = js.native
  var projectName: String = js.native
  var reason: DeploymentReason = js.native
  var releaseCreatedBy: IdentityRef = js.native
  var releaseLogsUri: String = js.native
  var releaseName: String = js.native
  var status: String = js.native
  var title: String = js.native
  var webAccessUri: String = js.native
}

object ReleaseEnvironmentCompletedEvent {
  @scala.inline
  def apply(
    createdByName: String,
    definitionId: Double,
    definitionName: String,
    environment: ReleaseEnvironment,
    environmentId: Double,
    projectName: String,
    reason: DeploymentReason,
    releaseCreatedBy: IdentityRef,
    releaseLogsUri: String,
    releaseName: String,
    status: String,
    title: String,
    webAccessUri: String
  ): ReleaseEnvironmentCompletedEvent = {
    val __obj = js.Dynamic.literal(createdByName = createdByName.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseCreatedBy = releaseCreatedBy.asInstanceOf[js.Any], releaseLogsUri = releaseLogsUri.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentCompletedEvent]
  }
  @scala.inline
  implicit class ReleaseEnvironmentCompletedEventOps[Self <: ReleaseEnvironmentCompletedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedByName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: ReleaseEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: DeploymentReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseCreatedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseLogsUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseLogsUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAccessUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAccessUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

