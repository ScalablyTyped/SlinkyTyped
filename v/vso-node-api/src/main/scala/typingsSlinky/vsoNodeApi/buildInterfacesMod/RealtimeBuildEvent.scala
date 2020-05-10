package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeBuildEvent extends js.Object {
  var buildId: Double = js.native
}

object RealtimeBuildEvent {
  @scala.inline
  def apply(buildId: Double): RealtimeBuildEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeBuildEvent]
  }
  @scala.inline
  implicit class RealtimeBuildEventOps[Self <: RealtimeBuildEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

