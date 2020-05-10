package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcCheckinEventData extends js.Object {
  var changeset: TfvcChangeset = js.native
  var project: TeamProjectReference = js.native
}

object TfvcCheckinEventData {
  @scala.inline
  def apply(changeset: TfvcChangeset, project: TeamProjectReference): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
  @scala.inline
  implicit class TfvcCheckinEventDataOps[Self <: TfvcCheckinEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeset(value: TfvcChangeset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: TeamProjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

