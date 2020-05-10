package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveDoctype extends PluginConfig {
  var removeDoctype: Boolean | js.Object = js.native
}

object PluginRemoveDoctype {
  @scala.inline
  def apply(removeDoctype: Boolean | js.Object): PluginRemoveDoctype = {
    val __obj = js.Dynamic.literal(removeDoctype = removeDoctype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDoctype]
  }
  @scala.inline
  implicit class PluginRemoveDoctypeOps[Self <: PluginRemoveDoctype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveDoctype(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDoctype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

