package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveAttrs extends PluginConfig {
  var removeAttrs: Boolean | js.Object = js.native
}

object PluginRemoveAttrs {
  @scala.inline
  def apply(removeAttrs: Boolean | js.Object): PluginRemoveAttrs = {
    val __obj = js.Dynamic.literal(removeAttrs = removeAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttrs]
  }
  @scala.inline
  implicit class PluginRemoveAttrsOps[Self <: PluginRemoveAttrs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveAttrs(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

