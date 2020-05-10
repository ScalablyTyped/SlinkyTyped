package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskGroupRevision extends js.Object {
  var changeType: AuditAction = js.native
  var changedBy: IdentityRef = js.native
  var changedDate: js.Date = js.native
  var comment: String = js.native
  var fileId: Double = js.native
  var revision: Double = js.native
  var taskGroupId: String = js.native
}

object TaskGroupRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    fileId: Double,
    revision: Double,
    taskGroupId: String
  ): TaskGroupRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], taskGroupId = taskGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskGroupRevision]
  }
  @scala.inline
  implicit class TaskGroupRevisionOps[Self <: TaskGroupRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: AuditAction): Self = {
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
    def withFileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

