package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkArtifactLink extends js.Object {
  /**
    * Target artifact type.
    */
  var artifactType: String = js.native
  /**
    * Outbound link type.
    */
  var linkType: String = js.native
  /**
    * Target tool type.
    */
  var toolType: String = js.native
}

object WorkArtifactLink {
  @scala.inline
  def apply(artifactType: String, linkType: String, toolType: String): WorkArtifactLink = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], toolType = toolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkArtifactLink]
  }
  @scala.inline
  implicit class WorkArtifactLinkOps[Self <: WorkArtifactLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

