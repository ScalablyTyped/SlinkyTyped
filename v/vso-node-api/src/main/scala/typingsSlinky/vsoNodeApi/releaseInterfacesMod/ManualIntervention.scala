package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualIntervention extends js.Object {
  /**
    * Gets or sets the identity who should approve.
    */
  var approver: IdentityRef = js.native
  /**
    * Gets or sets comments for approval.
    */
  var comments: String = js.native
  /**
    * Gets date on which it got created.
    */
  var createdOn: js.Date = js.native
  /**
    * Gets the unique identifier for manual intervention.
    */
  var id: Double = js.native
  /**
    * Gets or sets instructions for approval.
    */
  var instructions: String = js.native
  /**
    * Gets date on which it got modified.
    */
  var modifiedOn: js.Date = js.native
  /**
    * Gets or sets the name.
    */
  var name: String = js.native
  /**
    * Gets releaseReference for manual intervention.
    */
  var release: ReleaseShallowReference = js.native
  /**
    * Gets releaseDefinitionReference for manual intervention.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference = js.native
  /**
    * Gets releaseEnvironmentReference for manual intervention.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference = js.native
  /**
    * Gets or sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus = js.native
  /**
    * Get task instance identifier.
    */
  var taskInstanceId: String = js.native
  /**
    * Gets url to access the manual intervention.
    */
  var url: String = js.native
}

object ManualIntervention {
  @scala.inline
  def apply(
    approver: IdentityRef,
    comments: String,
    createdOn: js.Date,
    id: Double,
    instructions: String,
    modifiedOn: js.Date,
    name: String,
    release: ReleaseShallowReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    status: ManualInterventionStatus,
    taskInstanceId: String,
    url: String
  ): ManualIntervention = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskInstanceId = taskInstanceId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualIntervention]
  }
  @scala.inline
  implicit class ManualInterventionOps[Self <: ManualIntervention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprover(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease(value: ReleaseShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ManualInterventionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskInstanceId")(value.asInstanceOf[js.Any])
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

