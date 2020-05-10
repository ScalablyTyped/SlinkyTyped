package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAttachment extends js.Object {
  var _links: js.Any = js.native
  var createdOn: js.Date = js.native
  var lastChangedBy: String = js.native
  var lastChangedOn: js.Date = js.native
  var name: String = js.native
  var recordId: String = js.native
  var timelineId: String = js.native
  var `type`: String = js.native
}

object TaskAttachment {
  @scala.inline
  def apply(
    _links: js.Any,
    createdOn: js.Date,
    lastChangedBy: String,
    lastChangedOn: js.Date,
    name: String,
    recordId: String,
    timelineId: String,
    `type`: String
  ): TaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAttachment]
  }
  @scala.inline
  implicit class TaskAttachmentOps[Self <: TaskAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimelineId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timelineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

