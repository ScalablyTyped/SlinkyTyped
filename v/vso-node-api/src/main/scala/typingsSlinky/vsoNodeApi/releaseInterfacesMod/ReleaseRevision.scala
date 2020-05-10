package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseRevision extends js.Object {
  var changeDetails: String = js.native
  var changeType: String = js.native
  var changedBy: IdentityRef = js.native
  var changedDate: js.Date = js.native
  var comment: String = js.native
  var definitionSnapshotRevision: Double = js.native
  var releaseId: Double = js.native
}

object ReleaseRevision {
  @scala.inline
  def apply(
    changeDetails: String,
    changeType: String,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionSnapshotRevision: Double,
    releaseId: Double
  ): ReleaseRevision = {
    val __obj = js.Dynamic.literal(changeDetails = changeDetails.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionSnapshotRevision = definitionSnapshotRevision.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseRevision]
  }
  @scala.inline
  implicit class ReleaseRevisionOps[Self <: ReleaseRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedBy(value: IdentityRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionSnapshotRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionSnapshotRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

