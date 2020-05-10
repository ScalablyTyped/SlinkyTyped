package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildChangesCalculatedEvent extends BuildUpdatedEvent {
  var changes: js.Array[Change] = js.native
}

object BuildChangesCalculatedEvent {
  @scala.inline
  def apply(build: Build, buildId: Double, changes: js.Array[Change]): BuildChangesCalculatedEvent = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildChangesCalculatedEvent]
  }
  @scala.inline
  implicit class BuildChangesCalculatedEventOps[Self <: BuildChangesCalculatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

