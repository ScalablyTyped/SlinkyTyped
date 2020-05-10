package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentUpdate extends js.Object {
  /**
    * The current state of this agent update
    */
  var currentState: String = js.native
  /**
    * Gets the date on which this agent update was requested.
    */
  var requestTime: js.Date = js.native
  /**
    * The identity that request the agent update
    */
  var requestedBy: IdentityRef = js.native
  /**
    * Gets or sets the source agent version of the agent update
    */
  var sourceVersion: PackageVersion = js.native
  /**
    * Gets or sets the target agent version of the agent update
    */
  var targetVersion: PackageVersion = js.native
}

object TaskAgentUpdate {
  @scala.inline
  def apply(
    currentState: String,
    requestTime: js.Date,
    requestedBy: IdentityRef,
    sourceVersion: PackageVersion,
    targetVersion: PackageVersion
  ): TaskAgentUpdate = {
    val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentUpdate]
  }
  @scala.inline
  implicit class TaskAgentUpdateOps[Self <: TaskAgentUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceVersion(value: PackageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetVersion(value: PackageVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

