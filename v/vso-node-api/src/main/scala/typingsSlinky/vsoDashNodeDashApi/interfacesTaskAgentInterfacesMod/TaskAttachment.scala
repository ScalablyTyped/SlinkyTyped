package typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAttachment extends js.Object {
  var _links: js.Any
  var createdOn: js.Date
  var lastChangedBy: String
  var lastChangedOn: js.Date
  var name: String
  var recordId: String
  var timelineId: String
  var `type`: String
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
}

