package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskLog extends TaskLogReference {
  var createdOn: js.Date = js.native
  var indexLocation: String = js.native
  var lastChangedOn: js.Date = js.native
  var lineCount: Double = js.native
  var path: String = js.native
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
  @scala.inline
  implicit class TaskLogOps[Self <: TaskLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastChangedOn(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

