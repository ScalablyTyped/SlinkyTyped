package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeReleaseEvent extends js.Object {
  var projectId: String = js.native
  var releaseId: Double = js.native
}

object RealtimeReleaseEvent {
  @scala.inline
  def apply(projectId: String, releaseId: Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
  @scala.inline
  implicit class RealtimeReleaseEventOps[Self <: RealtimeReleaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
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

