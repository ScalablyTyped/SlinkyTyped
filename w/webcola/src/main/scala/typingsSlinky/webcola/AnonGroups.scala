package typingsSlinky.webcola

import typingsSlinky.webcola.powergraphMod.PowerEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroups extends js.Object {
  var groups: js.Array[_] = js.native
  var powerEdges: js.Array[PowerEdge] = js.native
}

object AnonGroups {
  @scala.inline
  def apply(groups: js.Array[_], powerEdges: js.Array[PowerEdge]): AnonGroups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], powerEdges = powerEdges.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroups]
  }
  @scala.inline
  implicit class AnonGroupsOps[Self <: AnonGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerEdges(value: js.Array[PowerEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerEdges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

