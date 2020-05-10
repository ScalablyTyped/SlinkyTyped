package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentManualInterventionPendingEvent extends js.Object {
  var deployment: Deployment = js.native
  var emailRecipients: js.Array[String] = js.native
  var environmentOwner: IdentityRef = js.native
  var manualIntervention: ManualIntervention = js.native
  var project: ProjectReference = js.native
  var release: Release = js.native
}

object DeploymentManualInterventionPendingEvent {
  @scala.inline
  def apply(
    deployment: Deployment,
    emailRecipients: js.Array[String],
    environmentOwner: IdentityRef,
    manualIntervention: ManualIntervention,
    project: ProjectReference,
    release: Release
  ): DeploymentManualInterventionPendingEvent = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], emailRecipients = emailRecipients.asInstanceOf[js.Any], environmentOwner = environmentOwner.asInstanceOf[js.Any], manualIntervention = manualIntervention.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentManualInterventionPendingEvent]
  }
  @scala.inline
  implicit class DeploymentManualInterventionPendingEventOps[Self <: DeploymentManualInterventionPendingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: Deployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailRecipients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironmentOwner(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManualIntervention(value: ManualIntervention): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualIntervention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: Release): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

