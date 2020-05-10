package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveUnusedNS extends PluginConfig {
  var removeUnusedNS: Boolean | js.Object = js.native
}

object PluginRemoveUnusedNS {
  @scala.inline
  def apply(removeUnusedNS: Boolean | js.Object): PluginRemoveUnusedNS = {
    val __obj = js.Dynamic.literal(removeUnusedNS = removeUnusedNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnusedNS]
  }
  @scala.inline
  implicit class PluginRemoveUnusedNSOps[Self <: PluginRemoveUnusedNS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveUnusedNS(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUnusedNS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

