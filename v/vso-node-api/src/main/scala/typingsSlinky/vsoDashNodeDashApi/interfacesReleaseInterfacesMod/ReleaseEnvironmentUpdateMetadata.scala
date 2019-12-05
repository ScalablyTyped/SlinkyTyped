package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseEnvironmentUpdateMetadata extends js.Object {
  /**
    * Gets or sets comment.
    */
  var comment: String
  /**
    * Gets or sets scheduled deployment time.
    */
  var scheduledDeploymentTime: js.Date
  /**
    * Gets or sets status of environment.
    */
  var status: EnvironmentStatus
}

object ReleaseEnvironmentUpdateMetadata {
  @scala.inline
  def apply(comment: String, scheduledDeploymentTime: js.Date, status: EnvironmentStatus): ReleaseEnvironmentUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseEnvironmentUpdateMetadata]
  }
}

