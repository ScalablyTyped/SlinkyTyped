package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveDesc extends PluginConfig {
  var removeDesc: Boolean | js.Object = js.native
}

object PluginRemoveDesc {
  @scala.inline
  def apply(removeDesc: Boolean | js.Object): PluginRemoveDesc = {
    val __obj = js.Dynamic.literal(removeDesc = removeDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDesc]
  }
  @scala.inline
  implicit class PluginRemoveDescOps[Self <: PluginRemoveDesc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveDesc(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDesc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

