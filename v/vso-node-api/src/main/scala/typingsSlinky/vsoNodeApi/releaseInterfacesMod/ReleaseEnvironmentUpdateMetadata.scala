package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironmentUpdateMetadata extends js.Object {
  /**
    * Gets or sets comment.
    */
  var comment: String = js.native
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: js.Date = js.native
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus = js.native
}

object ReleaseEnvironmentUpdateMetadata {
  @scala.inline
  def apply(comment: String, scheduledDeploymentTime: js.Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
  @scala.inline
  implicit class ReleaseEnvironmentUpdateMetadataOps[Self <: ReleaseEnvironmentUpdateMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledDeploymentTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledDeploymentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: EnvironmentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

