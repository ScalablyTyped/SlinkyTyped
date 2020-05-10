package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginMoveElemsAttrsToGroup extends PluginConfig {
  var moveElemsAttrsToGroup: Boolean | js.Object = js.native
}

object PluginMoveElemsAttrsToGroup {
  @scala.inline
  def apply(moveElemsAttrsToGroup: Boolean | js.Object): PluginMoveElemsAttrsToGroup = {
    val __obj = js.Dynamic.literal(moveElemsAttrsToGroup = moveElemsAttrsToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveElemsAttrsToGroup]
  }
  @scala.inline
  implicit class PluginMoveElemsAttrsToGroupOps[Self <: PluginMoveElemsAttrsToGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveElemsAttrsToGroup(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveElemsAttrsToGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

