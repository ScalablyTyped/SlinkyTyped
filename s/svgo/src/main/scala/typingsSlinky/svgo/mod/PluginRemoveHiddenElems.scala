package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveHiddenElems extends PluginConfig {
  var removeHiddenElems: Boolean | js.Object = js.native
}

object PluginRemoveHiddenElems {
  @scala.inline
  def apply(removeHiddenElems: Boolean | js.Object): PluginRemoveHiddenElems = {
    val __obj = js.Dynamic.literal(removeHiddenElems = removeHiddenElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveHiddenElems]
  }
  @scala.inline
  implicit class PluginRemoveHiddenElemsOps[Self <: PluginRemoveHiddenElems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveHiddenElems(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHiddenElems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

