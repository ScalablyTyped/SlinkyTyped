package typingsSlinky.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLog extends TaskLogReference {
  var createdOn: js.Date
  var indexLocation: String
  var lastChangedOn: js.Date
  var lineCount: Double
  var path: String
}

object TaskLog {
  @scala.inline
  def apply(
    createdOn: js.Date,
    id: Double,
    indexLocation: String,
    lastChangedOn: js.Date,
    lineCount: Double,
    location: String,
    path: String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexLocation = indexLocation.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskLog]
  }
}

