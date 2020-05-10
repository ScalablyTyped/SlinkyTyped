package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveUselessDefs extends PluginConfig {
  var removeUselessDefs: Boolean | js.Object = js.native
}

object PluginRemoveUselessDefs {
  @scala.inline
  def apply(removeUselessDefs: Boolean | js.Object): PluginRemoveUselessDefs = {
    val __obj = js.Dynamic.literal(removeUselessDefs = removeUselessDefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUselessDefs]
  }
  @scala.inline
  implicit class PluginRemoveUselessDefsOps[Self <: PluginRemoveUselessDefs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveUselessDefs(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUselessDefs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

