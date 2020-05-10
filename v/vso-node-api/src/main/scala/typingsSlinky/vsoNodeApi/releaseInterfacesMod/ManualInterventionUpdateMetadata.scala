package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualInterventionUpdateMetadata extends js.Object {
  /**
    * Sets the comment for manual intervention update.
    */
  var comment: String = js.native
  /**
    * Sets the status of the manual intervention.
    */
  var status: ManualInterventionStatus = js.native
}

object ManualInterventionUpdateMetadata {
  @scala.inline
  def apply(comment: String, status: ManualInterventionStatus): ManualInterventionUpdateMetadata = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualInterventionUpdateMetadata]
  }
  @scala.inline
  implicit class ManualInterventionUpdateMetadataOps[Self <: ManualInterventionUpdateMetadata] (val x: Self) extends AnyVal {
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
    def withStatus(value: ManualInterventionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

