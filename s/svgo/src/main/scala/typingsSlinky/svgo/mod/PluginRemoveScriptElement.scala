package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginRemoveScriptElement extends PluginConfig {
  var removeScriptElement: Boolean | js.Object = js.native
}

object PluginRemoveScriptElement {
  @scala.inline
  def apply(removeScriptElement: Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
  @scala.inline
  implicit class PluginRemoveScriptElementOps[Self <: PluginRemoveScriptElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoveScriptElement(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeScriptElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

