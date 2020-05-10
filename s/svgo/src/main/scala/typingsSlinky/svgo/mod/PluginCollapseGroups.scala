package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCollapseGroups extends PluginConfig {
  var collapseGroups: Boolean | js.Object = js.native
}

object PluginCollapseGroups {
  @scala.inline
  def apply(collapseGroups: Boolean | js.Object): PluginCollapseGroups = {
    val __obj = js.Dynamic.literal(collapseGroups = collapseGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCollapseGroups]
  }
  @scala.inline
  implicit class PluginCollapseGroupsOps[Self <: PluginCollapseGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseGroups(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

